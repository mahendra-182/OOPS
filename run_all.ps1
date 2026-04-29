$base = 'c:\Users\MAHENDRA\OneDrive\Desktop\OOPS'

$sets = @(
    [PSCustomObject]@{ dir = 'Practical Set-1';  files = @('P1','P2','P3','P4','P5') },
    [PSCustomObject]@{ dir = 'Practical Set-2';  files = @('P6','P7','P8','P9') },
    [PSCustomObject]@{ dir = 'Practical Set-3';  files = @('P10','P11','P12') },
    [PSCustomObject]@{ dir = 'Practical Set-4';  files = @('P13','P14','P15') },
    [PSCustomObject]@{ dir = 'Practical Set-5';  files = @('P16','P17','P18','P19') },
    [PSCustomObject]@{ dir = 'Practical Set-6';  files = @('P20','P21','P22') },
    [PSCustomObject]@{ dir = 'Practical Set-7';  files = @('P23','P24','P25') },
    [PSCustomObject]@{ dir = 'Practical Set-8';  files = @('P26','P27','P28') },
    [PSCustomObject]@{ dir = 'Practical Set-9';  files = @('P29','P30','P31','P32') },
    [PSCustomObject]@{ dir = 'Practical Set-10'; files = @('P33','P34','P35') }
)

$errors = @()

foreach ($set in $sets) {
    $dir = Join-Path $base $set.dir
    foreach ($f in $set.files) {
        Write-Host "=== $($set.dir) / $f ===" -ForegroundColor Cyan
        $javaFile = Join-Path $dir "$f.java"

        if (-not (Test-Path $javaFile)) {
            Write-Host "  SKIP: $javaFile not found" -ForegroundColor Yellow
            continue
        }

        # Compile
        $compileOut = & javac -cp $dir $javaFile 2>&1
        if ($LASTEXITCODE -ne 0) {
            Write-Host "  [COMPILE ERROR]" -ForegroundColor Red
            $compileOut | ForEach-Object { Write-Host "  $_" -ForegroundColor Red }
            $errors += "[COMPILE ERROR] $($set.dir)/$f`n" + ($compileOut -join "`n")
        } else {
            Write-Host "  Compiled OK. Running (5s timeout)..." -ForegroundColor Green
            # Run with a 5-second timeout
            $proc = Start-Process -FilePath "java" -ArgumentList "-cp", $dir, $f `
                -NoNewWindow -PassThru -RedirectStandardOutput "$env:TEMP\java_out.txt" `
                -RedirectStandardError "$env:TEMP\java_err.txt"
            $proc | Wait-Process -Timeout 5 -ErrorAction SilentlyContinue
            if (!$proc.HasExited) {
                $proc.Kill()
                Write-Host "  [TIMEOUT] Program ran for >5s and was killed." -ForegroundColor Yellow
                $errors += "[TIMEOUT] $($set.dir)/$f"
            } else {
                $stdout = Get-Content "$env:TEMP\java_out.txt" -ErrorAction SilentlyContinue
                $stderr = Get-Content "$env:TEMP\java_err.txt" -ErrorAction SilentlyContinue
                if ($proc.ExitCode -ne 0) {
                    Write-Host "  [RUNTIME ERROR]" -ForegroundColor Red
                    $stderr | ForEach-Object { Write-Host "  $_" -ForegroundColor Red }
                    $errors += "[RUNTIME ERROR] $($set.dir)/$f`n" + ($stderr -join "`n")
                } else {
                    Write-Host "  [OK] Output:" -ForegroundColor Green
                    $stdout | ForEach-Object { Write-Host "  $_" }
                    if ($stderr) {
                        Write-Host "  [STDERR]:" -ForegroundColor Yellow
                        $stderr | ForEach-Object { Write-Host "  $_" -ForegroundColor Yellow }
                    }
                }
            }
        }
        Write-Host ""
    }
}

Write-Host "========================================" -ForegroundColor Magenta
Write-Host "SUMMARY" -ForegroundColor Magenta
Write-Host "========================================" -ForegroundColor Magenta
if ($errors.Count -eq 0) {
    Write-Host "All files compiled and ran successfully!" -ForegroundColor Green
} else {
    Write-Host "$($errors.Count) issue(s) found:" -ForegroundColor Red
    foreach ($e in $errors) {
        Write-Host "---" -ForegroundColor DarkGray
        Write-Host $e -ForegroundColor Red
    }
}

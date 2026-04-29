from pathlib import Path
import subprocess
root = Path(r'c:\Users\MAHENDRA\OneDrive\Desktop\OOP-PRACTICAL-main')
java_files = sorted(root.rglob('*.java'))
compile_errors = []
compiled = []
for path in java_files:
    p = subprocess.run(['javac', str(path)], capture_output=True, text=True)
    if p.returncode != 0:
        compile_errors.append((path, p.stderr.strip() or p.stdout.strip()))
    else:
        compiled.append(path)
lines = []
lines.append(f'TOTAL_JAVA_FILES {len(java_files)}')
lines.append(f'COMPILED_OK {len(compiled)}')
lines.append(f'COMPILE_FAILED {len(compile_errors)}')
lines.append('')
lines.append('COMPILED_FILES:')
for path in compiled:
    lines.append(str(path))
lines.append('')
lines.append('FAILED_FILES:')
for path, err in compile_errors:
    lines.append(str(path))
    first_line = err.splitlines()[0] if err else ''
    lines.append('  ' + first_line)
lines.append('')
Path('status_utf8.txt').write_text('\n'.join(lines), encoding='utf-8')
print('WROTE status_utf8.txt')

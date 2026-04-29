from pathlib import Path
import subprocess
root = Path(r'c:\Users\MAHENDRA\OneDrive\Desktop\OOP-PRACTICAL-main')
java_files = sorted(root.rglob('*.java'))
results = []
for path in java_files:
    compile_cmd = ['javac', str(path)]
    p = subprocess.run(compile_cmd, capture_output=True, text=True)
    if p.returncode != 0:
        results.append((str(path), 'compile_failed', p.stderr.strip() or p.stdout.strip()))
        continue
    class_name = path.stem
    run_cmd = ['java', '-cp', str(path.parent), class_name]
    q = subprocess.run(run_cmd, capture_output=True, text=True, timeout=20)
    if q.returncode != 0:
        results.append((str(path), 'run_failed', q.stderr.strip() or q.stdout.strip()))
    else:
        out = q.stdout.strip()
        results.append((str(path), 'run_ok', out))
lines = []
lines.append(f'TOTAL_JAVA_FILES {len(java_files)}')
lines.append(f'TOTAL_RESULTS {len(results)}')
lines.append('')
for path, status, message in results:
    lines.append(f'{status.upper()}: {path}')
    if message:
        for line in message.splitlines():
            lines.append('  ' + line)
    lines.append('')
Path('run_summary.txt').write_text('\n'.join(lines), encoding='utf-8')
print('WROTE run_summary.txt')

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
print('TOTAL_JAVA_FILES', len(java_files))
print('COMPILED_OK', len(compiled))
print('COMPILE_FAILED', len(compile_errors))
for path, err in compile_errors[:20]:
    print('FAIL', path)
    print(err.replace('\n', ' | '))

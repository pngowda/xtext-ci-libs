def runMyPython() {
  final pythonContent = libraryResource('com/mkobit/sharedlib/my_file.py')
  final pythonContent2 = libraryResource('com/mkobit/sharedlib/example.py')
  // There are definitely better ways to do this without having to write to the consumer's workspace
  writeFile(file: 'my_file.py', text: pythonContent)
  writeFile(file: 'example.py', text: pythonContent2)
  sh('chmod +x my_file.py && ./my_file.py')
}

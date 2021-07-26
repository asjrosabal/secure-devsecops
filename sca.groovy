node{
  stage('Checkout'){
    checkout([$class: 'GitSCM', branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/asjrosabal/ms-gradle']]])
  }
  stage('SCA'){
   
    def readContent = readFile 'build.gradle'
    
    def task = '''
    task libraries(type: Copy) {
      from configurations.runtime
      into "lib"
    }
    '''
    writeFile file: 'build.gradle', text: readContent+"\r\n${task}"
   
    sh 'gradle libraries'
    
  }
   stage('pruebas funcionales'){
    println "QA"
  }
}

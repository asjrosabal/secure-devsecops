node{
  stage('build'){
    println "build"
  }
  stage('SAST'){
    sh ''' 
    ./gradlew sonarqube \
    -Dsonar.projectKey=github2 \
    -Dsonar.host.url=http://localhost:9000 \
    -Dsonar.login=1890805ea65026d01d5d91a5bdc52f66c42659bb
    '''
  }
   stage('pruebas funcionales'){
    println "QA"
  }
}

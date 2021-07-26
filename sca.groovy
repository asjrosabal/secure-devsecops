node{
  stage('build'){
    println "build"
  }
  stage('SAST'){
    println "QA"
    
  }
   stage('pruebas funcionales'){
    println "QA"
  }
}

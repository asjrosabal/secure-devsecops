node{
  stage('build'){
    println "build"
  }
  stage('SAST'){
    println "sast"
  }
   stage('pruebas funcionales'){
    println "QA"
  }
}

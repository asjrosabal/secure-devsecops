pipeline{
    agent any
    
    tools{
        maven "Maven"
    }
    
    stages{
        stage('Initial'){
            steps{
                sh '''
                   echo "PATH = ${PATH}"
                   echo "M2_HOME = ${M2_HOME}"
               '''
            }
        }
        
          stage ('Compile') {
            steps {
                 echo 'hello'
            }
        }
    }
}

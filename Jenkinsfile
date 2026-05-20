pipeline {
  
  agent any
  
  stages {
       stage('Clone URL')
	     {
		    steps {
			  echo 'Cloning Code form git hub'
			  git branch:'main',url:'https://github.com/srihari34/IDJenk.git'
			  }
	     }
       stage('Build') {
            steps {
                echo 'Building the project...'
                bat 'mvn compile'
            }
        }
        
        stage('Test') {
            steps {
                echo 'Running TestNG tests...'
                bat 'mvn clean test'
            }
        }
    }
    
    post {
        success {
            echo 'BUILD SUCCESS — All tests passed!'
        }
        failure {
            echo 'BUILD FAILED — Check console output!'
        }
    }
}
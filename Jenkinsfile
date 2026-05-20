pipeline {
  
  agent any
  
   parameters {
        string(name: 'Suite', defaultValue: 'testng.xml', description: 'TestNG suite file to run')
    }
    
  
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
        echo "Running suite: ${params.Suite}"
        bat "mvn clean test -Dsurefire.suiteXmlFiles=${params.Suite}"
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
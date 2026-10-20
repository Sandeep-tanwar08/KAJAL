pipeline {
    agent any

    tools {
        maven 'Maven_Home'
    }

    stages {
        stage('Build & Test') {
            steps {
                bat 'mvn clean test'
            }
        }
    }

    post {
        always {
			junit 'target/surefire-reports/testng-results.xml'
        }
        success {
            echo 'Test cases passed successfully!'
        }
        failure {
            echo 'Build ya Test fail ho gaya.'
        }
    }
}
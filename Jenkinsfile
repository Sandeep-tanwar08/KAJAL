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
			junit testResults: '**/target/surefire-reports/*.xml', allowEmptyResults: true
        }
        success {
            echo 'Test cases passed successfully!'
        }
        failure {
            echo 'Build ya Test fail ho gaya.'
        }
    }
}
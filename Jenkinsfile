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
            echo 'Pipeline execution complete.'
        }
        success {
            echo 'Test cases passed successfully!'
        }
        failure {
            echo 'Build ya Test fail ho gaya.'
        }
    }
}
pipeline {
    agent any
    tools {
        maven 'M3'   // Tool name defined in Jenkins > Global Tools
        jdk 'JDK17'  // Tool name defined in Jenkins > Global Tools
    }

    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/yourusername/CalculatorApp.git'
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean compile'
            }
        }

        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }

        stage('Run Main') {
            steps {
                sh 'mvn exec:java -Dexec.mainClass="CalculatorMain"'
            }
        }
    }

    post {
        always {
            junit '**/target/surefire-reports/*.xml'
        }
    }
}

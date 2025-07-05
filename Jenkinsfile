pipeline {
    agent any

    tools {
        maven 'M3'      // Make sure 'M3' is the name of your Maven installation in Jenkins
        jdk 'JDK17'     // Make sure 'JDK17' is the name of your JDK installation in Jenkins
    }

    stages {
        stage('Checkout') {
            steps {
                // Specify the branch explicitly to avoid branch mismatch errors
                git branch: 'main',
                    url: 'https://github.com/RishabhBatra-01/CI-CD-Pipeline-Implementation.git',
                    credentialsId: '30981179-41e0-4528-ae0d-edec5da01af5'
            }
        }

        stage('Build') {
            steps {
                // Use 'bat' if your Jenkins agent is on Windows, otherwise keep 'sh'
                bat 'mvn clean compile'
            }
        }

        stage('Test') {
            steps {
                bat 'mvn test'
            }
        }

        stage('Run Main') {
            steps {
                // Make sure you have exec-maven-plugin configured in your pom.xml
                bat 'mvn exec:java -Dexec.mainClass="CalculatorMain"'
                // If CalculatorMain is in a package, use the full name, e.g., "com.example.CalculatorMain"
            }
        }
    }

    post {
        always {
            // This will publish JUnit test results to Jenkins
            junit 'target/surefire-reports/*.xml'
        }
    }
}

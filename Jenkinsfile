pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Build & Test (Gradle)') {
            steps {
                bat 'gradle clean build'
            }
        }

        stage('Archive Artifact (JAR)') {
            steps {
                archiveArtifacts artifacts: 'build/libs/*.jar', fingerprint: true
            }
        }
    }
}

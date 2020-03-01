pipeline {
    agent { label 'generic' }
    stages {
        stage ('Clean workspace') {
            steps {
                cleanWs()
                sh 'pwd'
                sh 'ls'
            }
        }
        
        stage ('Checkout') {
            steps {
                git 'https://github.com/nmateev/example.git'
                sh 'pwd'
                sh 'ls'
            }
        }
        
        stage ('Build') {
            steps {
                sh 'chmod +x ./gradlew'
                sh './gradlew clean build'  
            }
        }
        
        stage ('Archive') {
            steps {
                archiveArtifacts 'build/libs/*.jar'
            }
        }
    }
}

node {
    stage ('Clean workspace') {
        cleanWs()
        sh 'pwd'
        sh 'ls'
    }
    
    stage ('Checkout') {
        git 'https://github.com/nmateev/example.git'
        sh 'pwd'
        sh 'ls'
    }

    stage ('Build') {
        sh 'chmod +x ./gradlew'
        sh './gradlew clean build'       
   } 
   
    stage ('Archive') {
        archiveArtifacts 'build/libs/*.jar'
   }
   
   cleanWs()
}

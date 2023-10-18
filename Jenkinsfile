pipeline {
    agent any
    tools {
        maven 'MAVEN'
    }

    stages {
        stage('Build Maven') {
            steps {
               checkout scmGit(branches: [[name: '*/develop']], extensions: [], userRemoteConfigs: [[credentialsId: '313d8fa2-d4aa-4479-8d4c-e5c875f681f4', url: 'https://github.com/vasanthselvam01/spring-boot-docker-demo.git']])
               sh "mvn clean install"
            }
        }

    }
}

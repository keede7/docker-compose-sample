pipeline {
    agent any
    stages {
        stage('Ready') {
            steps {
                echo 'test'
                echo '권한 부여'
                sh 'chmod 777 /var/jenkins_home/workspace/myapp/gradlew'
            }
        }
        stage('Build') {
            steps {
                echo 'build on'
                sh 'cd /var/jenkins_home/workspace/myapp'
                sh './gradlew clean build'
            }
        }
        stage('Clone') {
            steps {
                sh 'cd /var/project'
                sh 'ls -al'
                echo 'clone'
                sh 'git clone https://github.com/keede7/docker-compose-sample.git'
                echo '권한 부여'
                sh 'chmod 777 /var/jenkins_home/workspace/myapp/gradlew'
                sh './gradlew clean build'
            }
        }
        stage('Execute') {
            steps {
                sh 'ls -al'
                sh 'nohup java -jar ./build/libs/docker-compose-sample-*-SNAPSHOT.jar &'
            }
        }
    }
}
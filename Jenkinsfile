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
        stage('Execute') {
            steps {
                sh 'ls -al'
                sh ('JENKINS_NODE_COOKIE=dontKillMe && nohup java -jar ./build/libs/docker-compose-sample-*-SNAPSHOT.jar &')
            }
        }
    }
}
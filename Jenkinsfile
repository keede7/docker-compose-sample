pipeline {
    agent any
    stages {
        stage('Ready') {
            steps {
                echo 'test'
                echo '권한 부여'
                chmod 777 /var/jenkins_home/workspace/myapp/gradlew
            }
        }
        stage('Build') {
            steps {
                echo 'build on'
                cd /var/jenkins_home/workspace/myapp
                ./gradlew clean build
            }
        }
    }
}
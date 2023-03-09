pipeline {
    agent any
    stages {
        stage('Building application and deploy to artifactory') {
            agent {
                docker {
                    image 'docker.repos.blinfo.se/blinfo/maven:3.8.5-jdk-17'
                    args '-e MAVEN_CONFIG=/home/jenkins/.m2'
                }
            }
            steps {
                dir ('dsa-domain'){
                    sh 'mvn deploy -DskipTests'
                }
            }
        }
    }  
}

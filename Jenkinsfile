pipeline {
    agent any

    stages {
        stage('test') {
            steps{
                withMaven(maven: 'apache-maven-3.8.5') {
                    sh 'mvn test'
                }
            }
        }
    }
}

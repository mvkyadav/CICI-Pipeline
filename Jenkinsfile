pipeline {
    agent any

        stages{
            stage('Build') {
                steps {
                    withMaven (maven: 'apache-maven-3.8.5') {
                        sh 'mvn package'
                    }
                }
            }
        }
}

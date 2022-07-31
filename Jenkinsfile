pipeline {
    agent any

        stages{
            stage('Build') {
                steps {
                    withMaven (maven: 'Maven_3_8_5') {
                        sh 'mvn package'
                    }
                }
            }
        }
}

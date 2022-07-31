pipeline {
    agent any

        stages{
            stage('Build') {
                steps {
                    withMaven (maven: 'maven_3_8_0') {
                        sh 'mvn package'
                    }
                }

                stage('Hello') {
                                steps {
                                    echo 'Hello World'
                                    }
                                }
            }
        }

}

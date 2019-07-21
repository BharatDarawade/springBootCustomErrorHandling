pipeline {
    agent any

    stages {
        stage ('Compile Stage') {

            steps {
                withMaven(maven : 'Apache Maven 3.5.4') {
                    bat 'mvn clean compile'
                }
            }
        }

        stage ('Testing Stage') {

            steps {
                withMaven(maven : 'Apache Maven 3.5.4') {
                    bat 'mvn test'
                }
            }
        }
        stage('email'){
        emailext body: 'hi from jenrkins ', subject: 'test', to: 'bharatdarawade1134@gmail.com'
        }


        
    }
}
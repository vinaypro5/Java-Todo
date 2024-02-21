pipeline {
    agent any 

    stages {
        stage('Preparation') {
    steps {
        cleanWs()
    }
}
        stage("Checkout") {
            steps {
                git url: 'https://github.com/vinaypro5/Java-Todo.git'
                echo '*************** ## CHECK-OUT DONE ## ********************'
            }
        }
        stage("Build") {
            steps {
                bat "mvn clean install"
                echo '*************** BUILD DONE ********************'
            }
        }
        stage("Test") {
            steps {
                bat "mvn test"
                echo '*************** TEST DONE ********************'
            }
        }
        stage("Package") {
            steps {
                bat "mvn package"
                echo '*************** PACKAGE DONE ********************'
            }
        }

    }
}

             

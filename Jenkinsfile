pipeline {
    agent any
    tools {
        // Define Maven tool correctly
        maven 'm3'
    }
    stages {
        stage("Git-Checkout") {
            steps {
                script {
                    try {
                        // Checkout code from Git repository
                        git branch: 'main', url: 'https://github.com/vinaypro5/Java-Todo.git'
                        echo '*************** ## CHECK-OUT DONE ## ********************'
                    } catch (Exception e) {
                        // Handle any errors that occur during checkout
                        echo "Error occurred during Git checkout: ${e.message}"
                        currentBuild.result = 'FAILURE'
                        error 'Failed to checkout code from Git repository'
                    }
                }
            }
        }
    }
}

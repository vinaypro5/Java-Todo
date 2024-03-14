pipeline {
    agent any
    tools {
        maven 'm3' // Define Maven tool correctly
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
                        echo "An error occurred during Git checkout: ${e.message}"
                        // You may add further error handling or actions here if needed
                        error "Git checkout failed"
                    }
                }
            }
        }
        
        stage("build-maven") {
            steps {
                script {
                    bat "mvn clean install"
                    echo '*************** BUILD DONE ********************'
                }
            }
        }
    }
}


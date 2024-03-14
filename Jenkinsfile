pipeline {
    agent 'any' // Specifies that this pipeline can run on any available agent (node/agent) in the Jenkins environment.
    
    tools {
        mvn 'm3' // Specifies the Maven tool to be used. 'm3' is the name of the Maven tool configured in Jenkins.
    }
    
    stages {
        stage("Git-Checkout") { // Defines a stage named "Git-Checkout".
            git branch: 'main', url: 'https://github.com/vinaypro5/Java-Todo.git' // Checkout code from the specified Git repository URL and branch.
            echo '*************** ## CHECK-OUT DONE ## ********************' // Prints a message indicating that the checkout process is completed.
        }
    }
}

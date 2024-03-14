pipeline {
    agent "any"
    tools{
        mvn "m3"
    }
    stages {
        stage ("Git-Checkout"){
            steps{
                script {                
            git branch: 'main', url: 'https://github.com/vinaypro5/Java-Todo.git'
              echo '*************** ## CHECK-OUT DONE ## ********************'
            }
            }
        }

    }
}

pipeline{
    agent any

    stages{
        stage('build'){
            sh 'echo "hello Rohit !"'
        }
    }
}
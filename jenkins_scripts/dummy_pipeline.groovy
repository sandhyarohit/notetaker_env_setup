pipeline{
    agent any

    stages{
        stage('build'){
            steps{
                sh 'echo "hello Rohit !"'
            }
            
        }
        stage('test'){
            steps{
                sh 'echo "hello Rohit ! This is the testing stage ....'
            }
        }
    }
}
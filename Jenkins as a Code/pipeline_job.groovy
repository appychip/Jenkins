pipeline {
    agent any

    stages {
        stage('Print Build Number') {
            steps {
                echo "The current build number is $BUILD_NUMBER"
            }
        }
        stage('Print Build ID') {
            steps {
                echo "The current build ID is $BUILD_ID"
            }
        }
        stage('Print Job Name') {
            steps {
                echo "The Job Name is $JOB_NAME"
            }
        }
        stage('Print Varibale 1') {
            steps {
                echo "The Domain name is $VARIABLE1"
            }
        }
        stage('Print Varibale 2') {
            steps {
                echo "The college name  is $VARIABLE2"
            }
        }
    }
}
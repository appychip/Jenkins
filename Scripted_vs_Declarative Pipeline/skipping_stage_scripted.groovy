node {

    stage('Build') {
        echo "Building...."
    }
    if (env.FOO == "barr"){
    stage('Test') {
        echo "Testing..."
    }
    }
    stage('Deploy') {
        echo "Deploying..."
    }
}

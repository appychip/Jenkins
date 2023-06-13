job('NodeAppBuildPublish') {
    description('AppyChip Demo for Build and Publish the Node App')
     scm {
        git {
        remote {
                url('<GITHUB_URL_FOR_THE_PROJECT>')
         
            }
            wrappers {
                preBuildCleanup()
            } 
            branch('*/' + 'main')
        }
    }

    steps {
        dockerBuildAndPublish {
            repositoryName('<USER_NAME>/<REPO_NAME>')
            registryCredentials('<CREDENTIAL_ID>')
            buildContext("Jenkins\\ Job\\ DSL/NodeApp/")
            dockerfileDirectory("Jenkins\\ Job\\ DSL/NodeApp/Dockerfile")


        }
    }
}
// This job will run the nodejs project.

job('nodeApp') {
    steps {
        shell('''
export BUILD_ID=dontKillMe
dir="/home/appychip/Desktop/jenkins/Jenkins Job DSL/NodeApp"
pm2 start $dir/main.js

		''')
    }
}
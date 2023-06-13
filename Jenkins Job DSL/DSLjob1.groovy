// This job will run the nodejs project.

job('nodeApp') {
    steps {
        shell('''
export BUILD_ID=dontKillMePlease
cd "/home/appychip/Desktop/jenkins/Jenkins Job DSL/NodeApp/"
pm2 start main.js

		''')
    }
}
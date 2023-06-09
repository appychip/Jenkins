// This job will run the node js app, build the docker image for the nodejs project and push it to the docker hub.

job('nodeApp') {
    steps {
        shell('''
export BUILD_ID=dontKillMe
IMAGE_NAME="nodeapp"
IMAGE_TAG="2.0.0"
DOCKERHUB_REPO="appychipDemo/jenkinsDSL"
dir="/home/appychip/Desktop/jenkinsdsl" 
pm2 start $dir/main.js
docker build -t "$IMAGE_NAME:$IMAGE_TAG" $dir/
echo "$DOCKER_PASSWORD" | docker login --username "$DOCKER_USERNAME" --password-stdin
docker tag "$IMAGE_NAME:$IMAGE_TAG" "$DOCKERHUB_REPO:$IMAGE_TAG"
docker push "$DOCKERHUB_REPO:$IMAGE_TAG"

		''')
    }
}
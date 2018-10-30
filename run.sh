sbt clean test assembly
docker build . -t prsna23/httphelloworld:$GO_PIPELINE_LABEL
docker login -u "$USERNAME" -p "$PASSWORD"
docker push prsna23/httphelloworld:$GO_PIPELINE_LABEL


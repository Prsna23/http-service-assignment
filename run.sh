sbt clean test assembly
docker build . -t prsna23/httphelloworld
docker login -u "$USERNAME" -p "$PASSWORD"
docker push prsna23/httphelloworld


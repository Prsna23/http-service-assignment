sbt clean test assembly
docker build . -t prsna23/httphelloworld
echo "$PASSWORD" | docker login -u "$USERNAME" --password-stdin
docker push prsna23/httphelloworld


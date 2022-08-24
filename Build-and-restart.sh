docker build -t lottery .
docker stop lottery || true
docker rm lottery || true
docker run -d -p 8080:8080 --name lottery lottery
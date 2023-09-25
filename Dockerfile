FROM alpine:latest

RUN apt-get update && apt-get install -y \
    package1 \
    package2 \
    && rm -rf /var/lib/apt/lists/*

# Copy your project files into the container
COPY . /app

# Set the working directory
WORKDIR /app

# Define the command to run when the container starts
CMD ["./start.sh"]

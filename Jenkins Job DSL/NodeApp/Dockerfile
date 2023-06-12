# Use the official Node.js 14.x image as the base image
FROM node:14

# Set the working directory inside the container
WORKDIR /app

# Copy the application code to the working directory
COPY main.js .

# Expose the port on which your Node.js app listens
EXPOSE 8081

# Start the Node.js application
CMD [ "node", "main.js" ]


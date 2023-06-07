#!/bin/bash
set -x
# Update the system packages
sudo apt update

# Install Java Development Kit (JDK)
sudo apt install openjdk-11-jre

# Download and install Jenkins
curl -fsSL https://pkg.jenkins.io/debian/jenkins.io-2023.key | sudo tee \
  /usr/share/keyrings/jenkins-keyring.asc > /dev/null
echo deb [signed-by=/usr/share/keyrings/jenkins-keyring.asc] \
  https://pkg.jenkins.io/debian binary/ | sudo tee \
  /etc/apt/sources.list.d/jenkins.list > /dev/null
sudo apt-get update
sudo apt-get install -y jenkins

# Enable Jenkins service
sudo systemctl enable jenkins

# Start Jenkins service
sudo systemctl start jenkins


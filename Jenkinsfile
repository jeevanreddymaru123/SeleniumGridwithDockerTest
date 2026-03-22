pipeline {
    agent any

    stages {
        stage('Building') {
            steps {
                echo 'Building the Dev Project'
            }
        }
          stage('Testing') {
            steps {
                checkout scmGit(branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/jeevanreddymaru123/SeleniumGrid.git']])
                sh 'mvn clean test'
            }
        }
        
        stage('Deploying') {
            steps {
                echo 'Deploying code on to staging server'
            }
        }
    }
}

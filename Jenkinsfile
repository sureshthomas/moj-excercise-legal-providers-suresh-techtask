pipeline {
  agent any
  stages {
    stage('compile') {
      parallel {
        stage('compile') {
          steps {
            echo 'compiling'
          }
        }

        stage('analyse') {
          steps {
            echo 'Analysing'
          }
        }

      }
    }

    stage('build') {
      steps {
        echo 'Building'
      }
    }

    stage('container') {
      steps {
        echo 'Docker'
      }
    }

  }
}
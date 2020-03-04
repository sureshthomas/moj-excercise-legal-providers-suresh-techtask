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
      parallel {
        stage('build') {
          steps {
            echo 'Building'
          }
        }

        stage('') {
          steps {
            build(propagate: true, job: 'ted')
            withGradle() {
              build 'bootJar'
            }

          }
        }

      }
    }

    stage('container') {
      steps {
        echo 'Docker'
      }
    }

  }
}
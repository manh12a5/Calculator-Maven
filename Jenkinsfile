pipeline {
    agent any
        tools {
            maven 'Maven 3.6.3'
            jdk 'JDK8'
        }

    stages {
//         stage('Initialize') {
//             steps {
// //                 echo "PATH = ${M2_HOME}/bin:${PATH}"
// //                 echo "M2_HOME = /opt/maven"
//                 echo "PATH = ${PATH}"
//                 echo "M2_HOME = ${M2_HOME}"
//             }
//         }
        stage('Build') {
            steps {
                 git 'https://github.com/manh12a5/Calculator-Maven.git'
                 bat 'mvn clean'
            }
        }
        stage ('Test') {
            steps {
                bat 'mvn test'
            }
        }
        stage ('Install') {
             steps {
                 bat 'mvn install'
             }
        }
     }

    post {
       always {
          junit '**/target/surefire-reports/TEST-*.xml'
      }
   }
}

// pipeline {
// agent any
// stages {
// stage ('Compile Stage') {
// steps {
// withMaven(maven : 'apache-maven-3.6.1') {
// bat'mvn clean compile'
// }
// }
// }
// stage ('Testing Stage') {
// steps {
// withMaven(maven : 'apache-maven-3.6.1') {
// bat'mvn test'
// }
// }
// }
// stage ('Install Stage') {
// steps {
// withMaven(maven : 'apache-maven-3.6.1') {
// bat'mvn install'
// }
// }
// }
// }
// }
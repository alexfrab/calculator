pipeline {
	agent any
	stages {
		stage("Compile") {
			steps {
				sh "sudo ./mvnw clean package"
			}
		}
		stage("Unit test") {
			steps {
				sh "sudo ./mvnw test"
			}
		}
	}
}
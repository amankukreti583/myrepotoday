pipeline{
	agent any
	stages{
		stage('checkout'){
			steps{
				git branch: "main", url: 'https://github.com/deepakkatiyare/TodayRepo1.git'
				}			
			}
			
			stage('Build'){
			steps{
				sh 'chmod a+x mvnw'
				sh './mvnw clean package -DskipTests=true'
				}
				
				post{
					always{
					archiveArtifascts 'target/*.jar'
					}
					
				}
				
			}
			stage(DockerBuild){
			steps{
				sh 'docker build -t aman583/myallergyservice:latest .'
				}
			}
		}


}

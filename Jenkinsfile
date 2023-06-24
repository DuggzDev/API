pipeline{
    agent any
        properties([   
            parameters([
                booleanParam( defaultValue: true, description: '', name: 'Build_Now')
            ])])
 
    
    stages{
        stage("Running Spring Application"){
            steps{
               
                script{
                    if (params.Build_Now == true){
                    dir("C:\\Users\\james\\Documents\\Coding\\Spring\\SpringBootAPI\\API\\"){

                        bat "start cmd.exe"

                        bat "mvn spring-boot:run"
                        }
                    }
                }
            }
            post{
                always{
                    CleanWS()
                }
            }
        }
    }
}
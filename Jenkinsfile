pipeline{
    agent{
        label "dev"
    }
    stages{
        stage("Running Spring Application"){
            steps{
                script{
                    dir("C:\\Users\\james\\Documents\\Coding\\Spring\\SpringBootAPI\\API\\"){

                        bat "start cmd.exe"

                        bat "mvn spring-boot:run"
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
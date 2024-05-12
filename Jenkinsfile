
pipeline{
    // agent {
    //     dockerfile true
    // }
    agent {
        docker { image 'alpine:latest'}
    }
    
    
    
    
    parameters{ booleanParam( defaultValue: true, description: '', name: 'Build_Now')}
          
 
    
    stages{
        stage("Running Spring Application"){
            steps{
              
                script{
                    if (params.Build_Now == true){
                        sh "docker --version"
                    // Build the Docker image using the Dockerfile in your project directory
                        //docker.build("-f ${customImageName} .")
                    // dir("C:\\Users\\james\\Documents\\Coding\\Spring\\SpringBootAPI\\API\\"){

                    //     //sh "start cmd.exe"

                    //     sh "mvn spring-boot:run"

                        
                    //     }
                        
                        //dir ("${env.workspace}/src/main/java/com/API/SpringAPI/"){
                             sh "sh mvn spring-boot:run"
                        //}
                        
                    
                        def inputm = input message: 'Want to end the pipeline?',
                        parameters: [booleanParam(name: 'EndPipeline', defaultValue: false)]

                        if(params.EndPipeline == true){
                            options{
                                timeout(time: 1, unit:'SECONDS')
                            }
                        }
                        else{
                            echo 'countinuing'
                        }

                    }
                }
            
            }
            // post{
            //     always{
            //        // cleanWs()
            //     }
            // }
        }
    }
}

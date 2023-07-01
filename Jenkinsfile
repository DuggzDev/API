
pipeline{
    agent {label 'agent1'}
    
    
    parameters{ booleanParam( defaultValue: true, description: '', name: 'Build_Now')}
          
 
    
    stages{
        stage("Running Spring Application"){
            steps{
                 
                script{
                    if (params.Build_Now == true){
                    // dir("C:\\Users\\james\\Documents\\Coding\\Spring\\SpringBootAPI\\API\\"){

                    //     //sh "start cmd.exe"

                    //     sh "mvn spring-boot:run"

                        
                    //     }
                        sh ''' #!/bin/sh
                        dir ("${env.workspace}/src/main/java/com/API/SpringAPI/"){
                              "mvn spring-boot:run"
                        }
                        '''
                    
                        def inputm = input message: 'Want to end the pipeline?',
                        parameters: [booleanParam(name: 'EndPipeline', defaultValue: false)]

                        if(params.EndPipeline == true){
                            error "Pipeline Stopped"
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
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
                    echo 'pwd'
                        def inputm = input message: 'Want to end the pipeline?', ok: 'Yes',
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
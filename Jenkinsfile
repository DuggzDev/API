pipeline{
    // agent {label 'agent1'}
    agent any
    
    parameters{ booleanParam( defaultValue: true, description: '', name: 'Build_Now')}
          
 
    
    stages{
        stage("Running Spring Application"){
            steps{
               
                script{
                    if (params.Build_Now == true){
                    dir("C:\\Users\\james\\Documents\\Coding\\Spring\\SpringBootAPI\\API\\"){

                        bat "start cmd.exe"

                        bat "mvn spring-boot:run"

                        
                        }
                        def userinput = input message: "Do you want to end the pipeline?",
                        parameters: [
                            [$class: 'ChoiceParameterDefinition',
                             choices: ['N','Y'].join('\n'),
                             name: 'input',
                             description: 'Menu - select box option']
                         ]

                         if("${userinput}" == 'Y'){
                            error 'Pipeline is now ending...'
                         }
                         else{
                            echo 'pipeline is continuning.'
                         }
                    }
                }
            }
            post{
                always{
                    cleanWs()
                }
            }
        }
    }
}
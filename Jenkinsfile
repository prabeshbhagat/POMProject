pipeline {
    agent any

        
    stages {
        stage("Build") {
            steps {
               echo("Build Project")
            }    
        }

        stage("Deploy to Dev") {    
            steps {
                echo("deploy to Dev")
            }
        }

        stage("Deploy to QA") {
            steps {
                echo("deploy to qa")
                
            }
        }

        stage("Run Regression Automation Tests") {
            
            steps {
                echo("run automated test")
                
                }
            }
        
        
        
        stage("Run Sanity Tests") {           
            steps {
                echo("run Sanity test")
                
                }
            }
        
        
        stage("Deploy to Prod") {           
            steps {
                echo("Deploy to Prod")
                
                }
            }
    }   
}
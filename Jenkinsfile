pipeline {
    agent any
stages {
       
        
    stage('cleaning stage') {
             steps {
              sh "mvn clean test" 
               
    } 
}    
    stage('CleanWorkspace') {
            steps {
                
                cleanWs()
                    
                 
                    }

}
}
}

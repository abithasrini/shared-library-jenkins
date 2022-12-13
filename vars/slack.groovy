
#!/usr/bin/env groovy

// def call(String buildResult) {
//   if ( buildResult == "SUCCESS" ) {
//     #slackSend color: "good", message: "Job: ${env.JOB_NAME} with buildnumber ${env.BUILD_NUMBER} was successful"
    
  }
//   else if( buildResult == "FAILURE" ) { 
//     slackSend color: "danger", message: "Job: ${env.JOB_NAME} with buildnumber ${env.BUILD_NUMBER} was failed"
//   }
//   else if( buildResult == "UNSTABLE" ) { 
//     slackSend color: "warning", message: "Job: ${env.JOB_NAME} with buildnumber ${env.BUILD_NUMBER} was unstable"
//   }
//   else {
//     slackSend color: "danger", message: "Job: ${env.JOB_NAME} with buildnumber ${env.BUILD_NUMBER} its resulat was unclear"	
//   }
// }


def call(String buildResult) {
  if ( buildResult == "SUCCESS") {
    slackSend channel: '#devops', message: "jenkins status \n Build_URL : ${env.BUILD_URL} \n Job_Name : ${env.JOB_NAME}\n  Build_Number: ${env.BUILD_NUMBER} \n BuilD_status: ${currentBuild.currentResult}"
  }
  else {
    slackSend channel: '#devops', message: "jenkins status \n Build_URL : ${env.BUILD_URL} \n Job_Name : ${env.JOB_NAME}\n  Build_Number: ${env.BUILD_NUMBER} \n BuilD_status: ${currentBuild.currentResult}"
  }
}

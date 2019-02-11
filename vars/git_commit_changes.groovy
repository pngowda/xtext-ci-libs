#!/usr/bin/env groovy

def call(path, xtext_version, message, gitEmail='jenkins@localhost', gitName='jenkins-slave') {
    def git_cmd
    dir(path) {
        print sh(
            script: 'git add -A',
            returnStdout: true
        )
        sh(
            script: "git commit -a -m '${message} ${xtext_version}' >> commit.log",
            returnStatus: true
        )
        print sh("git diff-index --quiet HEAD || git commit -m '${message} ${xtext_version}'")

        print sh(
             script: "git show --name-only HEAD",
                 returnStdout: true
             )
    }
    
    return git_cmd
}



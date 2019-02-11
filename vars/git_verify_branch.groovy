#!/usr/bin/env groovy

def call(path, branch) {
    def git_cmd
    dir(path) {
        git_cmd = sh (
            script: "git rev-parse --verify ${branch}",
            returnStatus: true
        )
    }
    return git_cmd
}


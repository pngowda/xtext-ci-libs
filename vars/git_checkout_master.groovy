#!/usr/bin/env groovy

def call() {
    def git_cmd
      git_cmd = sh (
          script: 'git checkout master',
          returnStdout: true
      ).trim()
    return git_cmd
}

#!/usr/bin/env groovy

def call() {
    def git_cmd
      git_cmd = sh (
          script: 'git reset --hard',
          returnStdout: true
      ).trim()
    return git_cmd
}

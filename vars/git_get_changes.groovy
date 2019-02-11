#!/usr/bin/env groovy

def call(path) {
    dir(path) {
      git_changes = sh (
          script: 'git show --name-only HEAD',
          returnStdout: true
      ).trim()
    }
    return git_changes
}



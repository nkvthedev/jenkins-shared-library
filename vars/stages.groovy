Closure run() {
  return {
    stage('stage1') {
      steps {
        echo 'Running stage1'
      }
    }
    stage('stage2') {
      steps {
        echo 'Running stage2'
      }
    }
  }
}

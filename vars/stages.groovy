Closure get() {
  return {
    stage('stage1') {
        echo 'Running stage1'
    }
    stage('stage2') {
        echo 'Running stage2'
    }
  }
}

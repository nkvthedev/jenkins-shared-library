Closure get() {
  return {
    stage('stage1') {
        echo 'Running stage1'
        this.name = 'NAME'
    }
    stage('stage2') {
        echo 'Running stage2'
      println this.name
    }
  }
}

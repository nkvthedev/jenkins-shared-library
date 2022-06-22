def call(String name, Closure block) {
  testname = 'test1'
  this.jobname = 'JOB1'
  println this.instance

  if (name == '') {
    block()
  }
}

def defineVariables() {
  this.instance = 'instance1'
  
}

def disconnect(String name, Closure block) {
  println this.jobname
  println testname
  println this.instance
  if (name == '') {
    block()
  }
}

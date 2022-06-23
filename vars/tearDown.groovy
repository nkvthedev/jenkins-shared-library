def call(String name, Closure block) {
  testname = 'test1'
  this.jobname = 'JOB1'
  println this.instance
  println instance
  println instance2
  println this.instance2

  if (name == '') {
    block()
  }
}

def defineVariables() {
  instance2 = 'instance2'
  this.instance = 'instance1'
  
}

def disconnect(String name, Closure block) {
  println this.jobname
  println testname
  println this.testname
  println this.instance
  if (name == '') {
    block()
  }
}

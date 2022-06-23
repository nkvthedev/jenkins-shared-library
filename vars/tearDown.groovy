def call(String name, Closure block) {
  testname = 'test1'
  this.jobname = 'JOB1'
  println this.instance
  println instance

  if (name == '') {
    block()
  }
}

def defineVariables() {
  def instance2 = 'instance2'
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

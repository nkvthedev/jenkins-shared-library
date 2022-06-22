def call(String name, Closure block) {
  testname = 'test1'
  this.jobname = 'JOB1'
  if (name == '') {
    block()
  }
}

def disconnect(String name, Closure block) {
  println this.jobname
  if (name == '') {
    block()
  }
}

def call(String name, Closure block) {
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

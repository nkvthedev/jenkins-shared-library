def call(String name, Closure block) {
  work = 'WORKING'
  this.testname = 'test1'
  this.jobname = 'JOB1'
  println this.instance
  println instance
  this.instance = 'changed_instance'
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
  def jobname = 'JOB2'
//  println this.jobname
  println jobname
//   println testname
  println this.testname
  println this.instance
  prinln this.work
  println work
  if (name == '') {
    block.call()
  }
}

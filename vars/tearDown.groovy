def call(String name, Closure block) {
  work = 'WORKING' // sets up the variable "work" as a "property" of this singleton. Hence the value of this property can be accessed from any other method
  // in this singleton, either by using "this.work" or simply "work" as part of a statement.
  this.testname = 'test1' // sets up the variable testname as a property of the singleton.
  this.jobname = 'JOB1'
  println this.instance
  println instance
  this.instance = 'changed_instance'
  println instance2
  println this.instance2

  if (name == '') {
    block() // The closure can be invoked either by using just the name of the variable i.e. block(), or by specifically calling the 
    // call() method as block.call()
  }
}

def defineVariables() {
  instance2 = 'instance2'
  this.instance = 'instance1'
  
}

def disconnect(String name, Closure block) {
  def jobname = 'JOB2' // sets up "jobname" as a local variable of this method, not as a property of the singleton.
//  println this.jobname
  println jobname
//   println testname
  println this.testname
  println this.instance
  println this.work
  println work
  if (name == '') {
    block.call()
  }
}

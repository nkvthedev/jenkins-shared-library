import com.local.Instance

def call(String name, def script) {
  println this // 'this' here refers to the object of the Jenkinsfile class.
  // Any variable defined in the Jenkinsfile using the "def" keyword becomes like a property of a class named Jenkinsfile. There is one object of this
  // Jenkinsfile class created when running a pipeline job and all singleton classes defined inside the vars folder act as methods of this class, and
  // hence these singletons are able to access the properties using either the name of the property or this.<property>.
  println job_name // 'job_name' is not defined in this groovy file, instead it is defined in the Jenkinsfile using "def jobname" and acts as a
  // property of the class Jenkinsfile. This property is therefore also accessible using 'this.job_name' below.
  println this.job_name
  println script.jn
  this.echo "test1"
  echo "test2"
  execute()
  def i = new Instance(this, name)
  println i.name
  i.running_tests()
  i.print_vars()
  i.set_age()
  println i.age
  
  def j = new Instance(this, 'ANOTHER_NAME')
  println j.name
  println j.age

  j.name = 'NEW_NAME'
  println i.name
  println j.name

}

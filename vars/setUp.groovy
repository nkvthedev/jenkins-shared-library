import com.local.Instance

def call(String name, def script) {
  println this // 'this' here refers to the object of the Jenkinsfile class.
  // Methods like println, or any plugin specific method coming after installing a plugin in jenkins server, or other singletons defined inside
  // the vars folder are accessible directly from any singleton class defined inside vars folder, or from the Jenkinsfile itself.
  // Any variable defined in the Jenkinsfile using the "def" keyword becomes like a property of a class named Jenkinsfile. There is one object of this
  // Jenkinsfile class created when running a pipeline job and all singleton classes defined inside the vars folder act like methods of this class, and
  // hence these singletons are able to access the properties using either the name of the property or this.<property>.
  // Likewise the other singletons defined inside the vars folder act as other methods of the one object that gets created for the Jenkinsfile class, 
  // and hence any singleton of the vars folder can directly access any other singleton of the vars folder by just calling it by its name or 
  // using this.<singleton> to invoke the method.
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
  
  param1 = 'param1'
  this.param2 = 'param2'

}

import com.local.Instance

def call(String name, def script) {
  // The relationship between a singleton defined in the vars folder and the Jenkinsfile is like a parent child relationship. Any variables defined
  // in the Jenkinsfile using the 'def' keyword would become like properties of the Jenkinsfile class. All other plugin specific functions or special
  // functions like 'println' act as 'methods' of the Jenkinsfile class. The singleton is therefore able to access those methods and properties either
  // directly through their name or using this.<method> or this.<property>.
  println this // 'this' here refers to the singleton object. This object also has access to the properties that were defined in the Jenkinsfile 
  // by using the def keyword, because Jenkinfile acts as a parent class of the singletons defined inside the vars folder.
  // Likewise the other singletons defined inside the vars folder can directly access any other singleton of the vars folder by just calling it by 
  // its name or using this.<singleton> to invoke the method.
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
  
  param1 = 'param1' // Since param1 is not defined in this method using the def keyword so jenkins refers to the param1 as a "property" of the object
  // created for the Jenkinsfile class. This property must therefore be defined within the Jenkinsfile using the def keyword.
  this.param2 = 'param2'

}

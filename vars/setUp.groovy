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
  println job_name // Since 'job_name' is not assigned a value as such in this singleton and instead is just being used so Groovy looks for the
  // resence of the variable 'job_name' as a property in the jenkinsfile. And if it finds it to be defined as a variable in the jenkinsfile then
  // it used that value in this statement. A property can either be accessed directly like 'job_name' or by using the this keyword like 
  // 'this.job_name' below.
  println this.job_name

  // If 'job_name' was not defined as a property in the parent of this singleton i.e. in the Jenkinsfile class then it would be deinfed as a property
  // of this child singleton class when using it as a variable in the left hand side of a statement like below.
  job_name1 = 'no_name'

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
  
  param1 = 'param1' // Since param1 is not defined in this method using the def keyword so jenkins defines param1 as a "property" of the singleton 
  // object.
  this.param2 = 'param2' // param2 would be defined as a property of this singleton in case it is not defined elsewhere before it's use in this
  // statement.

}

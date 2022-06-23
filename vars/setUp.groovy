import com.local.Instance

def call(String name, def script) {
  println this
  println job_name
//   println this.job_name
//   println script.jn
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

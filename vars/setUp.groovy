import com.local.Instance

def call(String name) {
  println this
  this.echo "test1"
  echo "test2"
  execute()
  def i = new Instance(this, name)
  println i.name
  i.running_tests()
  
  def j = new Instance(this, 'ANOTHER_NAME')
  println j.name

  j.name = 'NEW_NAME'
  println i.name
  println j.name

}

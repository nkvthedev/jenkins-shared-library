import com.local.Instance

def call(String name) {  
  this.echo "test1"
  echo "test2"
  def i = new Instance(this, name)
  println i.name
  
  def j = new Instance(this, 'ANOTHER_NAME')
  println j.name
}

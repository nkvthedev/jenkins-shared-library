import com.local.Instance

def call(String name) {  
  println this
  def i = new Instance(this, name)
  println i.name
  
  def j = new Instance(this, 'ANOTHER_NAME')
  println j.name
}

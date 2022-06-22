import com.local.Instance

def call(String name) {  
  def i = new Instance(this, name)
  println i.name
  println i.default_addr
  println i.default_name
  
  def j = new Instance(this, 'ANOTHER_NAME')
  println i.name
  println i.default_addr
  println i.default_name
}

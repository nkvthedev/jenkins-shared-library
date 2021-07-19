import com.local.Instance

def call(String name) {  
  def i = new Instance(this, name)
  println i.getAddress()
  println i.name
  println i.script
  println i.address

  def j = new Instance(this, 'ANOTHER')
  j.setAddress()
  
  println j.address
  println j.name
  println i.getAddress()
  println j.getAddress()
}

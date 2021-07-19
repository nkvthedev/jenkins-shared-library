import com.local.Instance

def call(String name) {  
  def i = new Instance(this, name)
  println i.getAddress()

  def j = new Instance(this, name)
  j.setAddress()
  
  println i.getAddress()
  println j.getAddress()
}

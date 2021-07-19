import com.local.Instance

def call(String name) {

  println Instance.address
  
  def i = new Instance(this, name)
  println i.getAddress()
  def j = new Instance(this, name)
  j.setAddress()
  println i.getAddress()
}

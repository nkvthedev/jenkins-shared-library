def call(String name, Closure block) {
  if (name == '') {
    block()
  }
}

def disconnect(String name, Closure block) {
  if (name == '') {
    block()
  }
}

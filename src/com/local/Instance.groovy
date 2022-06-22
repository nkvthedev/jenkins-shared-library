package com.local

class Instance {
  def script = null
  def name = ''

  Instance(def script, String input_name) {
    println this
    this.script = script
    this.name = input_name
    this.script.echo this.name
  }
  
  def running_tests() {
    this.script.execute()
  }
}

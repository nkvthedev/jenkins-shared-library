package com.local

class Instance {
  def script = null
  def name = ''

  Instance(def script, String input_name) {
    this.script = script
    this.name = input_name
    echo this.name
  }
  
  def running_tests() {
    this.script.execute()
  }
}

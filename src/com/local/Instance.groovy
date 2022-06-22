package com.local

class Instance {
  def default_name = 'DEFAULT_NAME'
  def default_addr = 'DEFAULT_ADDRESS'
  def script = null

  Instance(def script, String input_name) {
    this.script = script
    this.name = input_name
  }
  
  def getAddress() {
    return this.default_addr
  }
  
  def setAddress() {
    this.default_addr = 'NEW_ADDRESS'
  }
}

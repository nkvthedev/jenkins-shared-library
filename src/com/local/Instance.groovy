package com.local

class Instance {
  def name = 'DEFAULT'
  def address = 'DEFAULT_ADDRESS'
  def script = null

  Instance(def script, String input_name) {
    this.script = script
    this.name = input_name
    this.defaultname = name
  }
  
  def getAddress() {
    return this.address
  }
  
  def setAddress() {
    this.address = 'NEW_ADDRESS'
  }
}

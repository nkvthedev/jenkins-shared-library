package com.local

class Instance {

  def address = 'DEFAULT_ADDRESS'


  Instance(def script, String name) {
    this.script = script
    this.name = name
  }
  
  def getAddress() {
    return address
  }
  
  def setAddress() {
    address = 'NEW_ADDRESS'
  }
}

package com.local

Class Instance {
  def name = 'DEFAULT'
  def address = 'DEFAULT_ADDRESS'

  Instance(def script, String name) {
    this.script = script
    this.name = name
  }
  
  def getAddress() {
    return this.address
  }
  
  def setAddress() {
    address = 'NEW_ADDRESS'
  }
}

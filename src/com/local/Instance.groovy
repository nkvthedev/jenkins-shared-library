package com.local

class Instance {
  def name = 'DEFAULT'
  def address = 'DEFAULT_ADDRESS'
  def script = null

  Instance(def script, String name=name) {
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

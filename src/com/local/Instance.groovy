package com.local

Class Instance {
  def name = 'DEFAULT'
  def address = 'DEFAULT_ADDRESS'

  Instance(def script, String name) {
    this.name = name
  }
  
  def getAddress() {
    return this.address
  }
}

package com.local

class Instance {
  // All properties of the class must be defined here.
  def script = null
  def name = ''
  def age = null

  Instance(def script, String input_name) {
    this.script = script
    this.name = input_name
  }

  def set_age() {
    this.age = 20
    def addr = 'ABCD'
  }

  def running_tests() {
    this.script.execute()
  }
}

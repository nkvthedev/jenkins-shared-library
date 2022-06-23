package com.local

class Instance {
  // All properties of the class must be defined here.
  def script = null
  def name = ''
  def age = null

  Instance(def script, String input_name) {
    this.script = script
    this.name = input_name // OR name = input_name (would also set the property named as "name")
  }

  def set_age() {
    this.age = 20
    // age = 20 would also setup the property "age" of this class with value 20.
    // addr = 'ABCD' would throw an error because "addr" has not be defined as a "property" of the class after the line 3 above.
    def addr = 'ABCD' // When using the def keyword you are just setting up a local variable for the method, not a property of the class.
  }

  def running_tests() {
    this.script.execute()
  }
  
  def print_vars() {
    this.script.job_name
  }
}

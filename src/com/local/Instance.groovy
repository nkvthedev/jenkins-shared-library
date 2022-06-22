package com.local

class Instance {
  def script = null
  def name = ''
  def age = null

  Instance(def script, String input_name) {
    this.script = script
    this.name = input_name
  }

  def set_age() {
    this.age = 20
  }

  def running_tests() {
    this.script.execute()
  }
}

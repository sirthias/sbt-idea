package org.example

import net.lag.configgy.Config

class NameConfigured(config: Config) {
  val name: String = config("name")
}
package org.example

import net.lag.configgy.Config
import org.scalatest.testng.TestNGSuite
import org.scalatest.matchers.ShouldMatchers
import org.testng.annotations.Test

class NameConfiguredTest extends TestNGSuite with ShouldMatchers {

  @Test
  def testConfiggyConfiguration() {
    val config = Config.fromResource("test.conf", getClass.getClassLoader)
    new NameConfigured(config).name should equal ("Mathias")
  }

}
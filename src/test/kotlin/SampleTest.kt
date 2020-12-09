import io.kotlintest.specs.StringSpec
import io.kotlintest.shouldBe
//import io.kotlintest.TestCase
//import io.kotlintest.TestResult

class SampleTest : StringSpec() {
  init {
    "canary test should pass" {
      true shouldBe true
    }
    
    "add should return sum" {
      Sample().add(1, 2) shouldBe 3
    }
  }
}

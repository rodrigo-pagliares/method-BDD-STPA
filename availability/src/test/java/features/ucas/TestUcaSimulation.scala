package features.ucas

import io.gatling.core.Predef._
import com.intuit.karate.gatling.PreDef._

import scala.concurrent.duration._
import scala.language.postfixOps

class TestUcaSimulation extends Simulation{
  val getUca = scenario("uca").exec(karateFeature("classpath:features/ucas/uca.feature"))

  setUp(
    getUca.inject(rampUsers(10) during (5 seconds))
  )
}

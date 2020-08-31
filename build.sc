import mill._, scalalib._

trait BaseProblem extends ScalaModule {
  def scalaVersion = "2.13.1"
}

object problem01 extends BaseProblem
object problem02 extends BaseProblem
object problem03 extends BaseProblem
object problem04 extends BaseProblem
object problem05 extends BaseProblem
object problem06 extends BaseProblem {
  def scalaVersion = "2.13.1"
  def moduleDeps = Seq(problem05)
}
object problem07 extends BaseProblem
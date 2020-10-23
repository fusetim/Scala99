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
  def moduleDeps = Seq(problem05)
}
object problem07 extends BaseProblem
object problem08 extends BaseProblem
object problem09 extends BaseProblem
object problem10 extends BaseProblem {
  def moduleDeps = Seq(problem04, problem09)
}
object problem11 extends BaseProblem {
  def moduleDeps = Seq(problem10)
}
object problem12 extends BaseProblem
object problem13 extends BaseProblem
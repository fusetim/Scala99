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
object problem14 extends BaseProblem
object problem15 extends BaseProblem
object problem16 extends BaseProblem
object problem17 extends BaseProblem
object problem18 extends BaseProblem
object problem19 extends BaseProblem
object problem20 extends BaseProblem
object problem21 extends BaseProblem
object problem22 extends BaseProblem
object problem23 extends BaseProblem {
  def moduleDeps = Seq(problem20)
}
object problem24 extends BaseProblem {
    def moduleDeps = Seq(problem22, problem23)
}
object problem25 extends BaseProblem {
  def moduleDeps = Seq(problem23)
}
object problem26 extends BaseProblem
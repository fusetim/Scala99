import mill._, scalalib._

object problem01 extends ScalaModule {
  def scalaVersion = "2.13.1"
}

object problem02 extends ScalaModule {
  def scalaVersion = "2.13.1"
}

object problem03 extends ScalaModule {
  def scalaVersion = "2.13.1"
}

object problem04 extends ScalaModule {
  def scalaVersion = "2.13.1"
}

object problem05 extends ScalaModule {
  def scalaVersion = "2.13.1"
}

object problem06 extends ScalaModule {
  def scalaVersion = "2.13.1"
  def moduleDeps = Seq(problem05)
}
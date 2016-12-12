import sbt.Keys._

lazy val buildSettings = Seq(
    scalaVersion := "2.11.8",
    crossScalaVersions := Seq("2.11.8"),
    organization := "com.mikla",
    resolvers += Resolver.jcenterRepo
)

lazy val sourceSettings = buildSettings

lazy val scalatestVersion = "3.0.1"

lazy val coreDependencies = libraryDependencies ++= Seq(
    "org.scalatest" %%% "scalatest" % scalatestVersion % "test"
)

lazy val shared = (crossProject in file("shared"))
  .settings(sourceSettings: _*)
  .settings(name := "shared")
  .settings(coreDependencies)
  .jsSettings(
      jsEnv := PhantomJSEnv().value,
      scalaJSStage in Test := FastOptStage
  )

lazy val sharedJVM = shared.jvm
lazy val sharedJS = shared.js


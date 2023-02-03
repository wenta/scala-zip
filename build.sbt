name := "scala-zip"

organization := "com.github"

version := "1.2.1"

scalaVersion := "2.13.6"

libraryDependencies += "org.specs2" %% "specs2-core" % "4.7.1" % Test

publishTo := Some("GitHub Carl Data Apache Maven Packages" at "https://maven.pkg.github.com/wenta/scala-zip")
publishMavenStyle := true
credentials += Credentials(
  "GitHub Package Registry",
  "maven.pkg.github.com",
  "wenta",
  System.getenv("GITHUB_TOKEN")
)
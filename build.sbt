name := """ginger"""
organization := "com.yp.ginger"
version := "0.1" // 1.0-SNAPSHOT"

// set the main Scala source directory to be <base>/app
scalaSource in Compile := baseDirectory.value / "app"
// set the Scala test source directory to be <base>/test
scalaSource in Test := baseDirectory.value / "test"


lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.12.8"

libraryDependencies ++= Seq(compilerPlugin("com.github.ghik" %% "silencer-plugin" % "1.4.1"),
						"com.github.ghik" %% "silencer-lib" % "1.4.1" % Provided)

libraryDependencies += guice
libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "4.0.3" % Test
//libraryDependencies += "com.github.ghik" %% "silencer-lib" % "1.4.1" % Provided
libraryDependencies += "oracle" % "ojdbc6" % "11.2.0.4.0"

libraryDependencies += "io.swagger" %% "swagger-play2" % "1.7.1"
libraryDependencies += "de.siegmar" % "logback-gelf" % "2.1.0"
//libraryDependencies += "io.swagger" %% "swagger-play2" % "1.5.3"
//libraryDependencies += "io.swagger" %% "swagger-play2" % "1.0.5"

//libraryDependencies += "io.swagger" %% "swagger-play2" % "1.6.2-SNAPSHOT"
//libraryDependencies += "io.swagger" %% "swagger-play2" % "1.7.1"

//compilerPlugin("com.github.ghik" %% "silencer-plugin" % silencerVersion),
//				"com.github.ghik" %% "silencer-lib" % "1.4.1" % Provided

scalacOptions ++= Seq(
  "-encoding", "UTF-8",       // yes, this is 2 args
  "-language:existentials",
  "-language:higherKinds",
  "-language:implicitConversions",
   "-deprecation",
   "-feature",
  //"-language:reflectiveCalls",     // required for avoid reflection warnings
  "-unchecked",
  // "-Yno-adapted-args",   // PENDING: errors causes build failure
  "-Ywarn-dead-code",
  "-Ywarn-numeric-widen",
  "-Ywarn-value-discard",
  "-Xlog-reflective-calls",
  "-P:silencer:pathFilters=target/.*",
  "-Xlint:_"
)

//"-P:silencer:pathFilters=target/.*",
//scalacOptions += s"-P:silencer:sourceRoots=${sourceDirectories.value.map(_.getCanonicalPath).mkString(";")}"
//scalacOptions += "-P:silencer:sourceRoots=target/.*"

// Adds additional packages into Twirl
//TwirlKeys.templateImports += "com.yp.ginger.controllers._"

// Adds additional packages into conf/routes
// play.sbt.routes.RoutesKeys.routesImport += "com.yp.ginger.binders._"

// Check everything at compile time only
wartremoverWarnings in (Compile, compile) ++= Warts.all

//addCommandAlias("devbuild", ";dependencyUpdates;tag-list;clean;doc;coverage;test;coverageReport;openDoc;openCoverageReport")
addCommandAlias("devbuild", ";dependencyUpdates;tag-list;clean;doc;coverage;test;coverageReport;")
//addCommandAlias("devbuild", "clean compile doc coverage test coverageReport openCoverageReport")
addCommandAlias("mybuild", ";dependencyUpdates;tag-list;clean;doc")
addCommandAlias("mytest", ";test")

// Add Swagger Plugin
//lazy val root = (project in file(".")).enablePlugins(PlayScala, SwaggerPlugin) //enable plugin

// BEGIN sbt-scoverage
coverageEnabled := true
coverageMinimum := 9
coverageFailOnMinimum := true
coverageHighlighting := true
coverageExcludedPackages := "script.*;clients.script_extensions.*;<empty>;com.yp.scratch.*;swagger.*;BuildInfo\\*"

lazy val openCoverageReport = taskKey[Unit]("Open Coverage Report")

openCoverageReport := {
  // "open target/scala-2.13/scoverage-report/index.html" !
	"open target/scala-2.13/scoverage-report/index.html" 
}

// END sbt-scoverage



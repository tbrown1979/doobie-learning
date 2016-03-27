scalaVersion := "2.11.6"
libraryDependencies ++= {
  Seq(
    "org.tpolecat" %% "doobie-core" % "0.2.3",
    "org.tpolecat" %% "doobie-contrib-h2" % "0.2.3",
    "org.tpolecat" %% "doobie-contrib-specs2" % "0.2.3"
  )
}

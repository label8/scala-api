scalaVersion := "2.11.8"

libraryDependencies ++= {
  val akkaV = "10.0.3"
  val slickV = "3.1.1"
  Seq(
    "com.typesafe.akka" %% "akka-http" % akkaV
    , "com.typesafe.akka" %% "akka-http-spray-json" % akkaV
    , "com.typesafe.slick" %% "slick" % slickV
    , "com.typesafe.slick" % "slick-hikaricp_2.11" % slickV
    , "mysql" % "mysql-connector-java" % "5.1.38"
    , "org.slf4j" % "slf4j-nop" % "1.6.4"

  )
}
name := "hiking-spark"

version := "0.1"

scalaVersion := "2.11.0"

// https://mvnrepository.com/artifact/org.apache.spark/spark-core
libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % "2.4.2",
  "org.apache.spark" %% "spark-sql" % "2.4.3"
)
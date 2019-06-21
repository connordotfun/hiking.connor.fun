import org.apache.spark.sql.SparkSession

object HikingApp {
  def main(args: Array[String]): Unit = {

    val spark = SparkSession.builder.getOrCreate()
    println("Hello World")

  }
}

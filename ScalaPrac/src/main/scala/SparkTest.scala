import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.functions.explode

object SparkTest extends App {

  val spark = SparkSession.builder().appName("App on jason").master("local")getOrCreate()
  spark.sparkContext.setLogLevel("ERROR")

  val jdata = spark.read.option("multiline",true).json("C:\\Users\\bogineni.damodhar\\IdeaProjects\\ScalaPrac\\src\\main\\resources\\data.json")
//  val jdata1 = spark.read.option("multiline",true).option("mode", "PERMISSIVE").json("C:\\Users\\bogineni.damodhar\\IdeaProjects\\ScalaPrac\\resources\\data.json")
import spark.implicits._
//  jdata.show()
//  jdata1.show()
  val jdataDf = jdata.withColumn("Student_Name_Section",explode($"students")).drop("students")
  jdataDf.select(jdataDf("institution"), jdataDf("name"), jdataDf("Student_Name_Section.name")alias("Name"),jdataDf("Student_Name_Section.section")alias("Section"))
  jdataDf.select(jdataDf("Student_Name_Section.name")alias("Name")).createOrReplaceTempView("Students")
  spark.sql( "Select Name from(Select Name, ROW_NUMBER() OVER (PARTITION BY Name ORDER BY Name) as num from Students) where num = 2")show()  /* TO GET DUPLICATES*/
  spark.sql( "Select Name from(Select Name, ROW_NUMBER() OVER (PARTITION BY Name ORDER BY Name) as num from Students) where num = 1")show()  /* TO GET ALL STUDENTS WITH OUT DUPLICATE*/
    spark.sql( "Select Name, ROW_NUMBER() OVER (PARTITION BY Name ORDER BY Name ASC) as num from Students")show()



}

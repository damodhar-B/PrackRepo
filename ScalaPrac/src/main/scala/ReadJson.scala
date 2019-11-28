

import scala.collection.mutable.ListBuffer
import scala.io.Source

object jsonparse extends App {
  for (line <- Source.fromFile("src/main/resources/data2.json").getLines) {
    val data = line.split("\"students\":")(1)
    val data1 = data.substring(0, data.length - 1).split("""\}\,\{""")
    var data2 = new ListBuffer[String]()
    for(x <- 0 until data1.length){
      if(x == 0){
        data2 += data1(x).substring(2)
      }
      else if (x == data1.length-1){
        data2 += data1(x).substring(0,data1(x).length-2)
      }
      else {
        data2 += data1(x)
      }
    }
    val data3 = data2.toList.map(x => x.split(",")(0)).groupBy(x => x).map(x => (x._1, x._2.length)).filter(x => x._2 > 1).map(x => x._1.split(":")(1))
    println(data3.map(x => x.substring(1, x.length - 1)))


  }
}

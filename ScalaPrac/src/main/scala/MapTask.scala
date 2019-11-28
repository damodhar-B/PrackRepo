import scala.collection.mutable.Map

object MapTask extends App {
  val map1: Map[String, String] = Map(("PD","Plain Donut"),("SD","Strawberry Donut"),("CD","Chocolate Donut"))
  val map2: Map[String, String] = Map("KD" -> "Krispy Kreme Donut", "OD"->"Optimized Donut")
  map1 += ("KD" -> "Krispy Kreme Donut")

  println(map1)
  println(map1("SD"))

  map1 ++= map2

  println(map1)

  map1 -= "OD"
  println( map1)

  map1 -= "KD"
  println( map1)

}

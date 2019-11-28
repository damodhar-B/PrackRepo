object FunOnMap extends App {

  val map = Map.empty[String, String]

  //println("Step 1: How to initialize a Map with 3 elements")
  val map1: Map[String, String] = Map(("PD","Plain Donut"),("SD","Strawberry Donut"),("CD","Chocolate Donut"))
  val map2: Map[String, String] = Map("KD" -> "Krispy Kreme Donut", "OD"->"Optimized Donut")

  println(map1 + ("KD" -> "Krispy Kreme Donut"))
  println("PRINTING ONE MAP ELEMENT   "+map2("OD"))


  val map3 = map1 ++ map2

  println(map3 - ("KD"))

}

object CallByName extends App {

  def callby(i: Int) = {
    println(s"damu deposited on 1st day  -- $i")
    println(s"damu deposited on 2nd day  -- $i")
    println(s"damu deposited on 3rd day  -- $i")
    println(s"damu deposited on 4th day  -- $i")
    println(s"damu deposited on 5th day  -- $i")
  }

  var amt = 2
  callby{amt += 1; amt}

  println()
  println()
  println("USING CALL BY NAME")

  def callByName(i: =>Int) = {
    println(s"damu deposited on 1st day and total -- $i")
    println(s"damu deposited on 2nd day and total -- $i")
    println(s"damu deposited on 3rd day and total -- $i")
    println(s"damu deposited on 4th day and total -- $i")
    println(s"damu deposited on 5th day and total -- $i")
  }

  var amnt = 0
  callByName{amnt += 1; amnt}

}

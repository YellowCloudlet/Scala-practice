package home_app

object FirstHometaskApp extends  App with Math {

  implicit val const: Double = 4 //const
  val a = 1
  val b = 2
  val c = 1
  println(s"Вычисление корней квадратного уравнения a(_)X^2 + b(_)X + c(_)")

  val result: Double = discriminant(Some(a))(Some(b))(Some(c))
  //println(s"Вычисление дискриминанта... ${scala.math.sqrt(result)}")

  val tempRoots:Double = result

  val rootNumber = rootNumberFunction(tempRoots)
  println(rootNumber)

  val exit:Any =  rootCalculation(Some(a))(Some(b))(Some(c))(result)
}


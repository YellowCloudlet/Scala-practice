package home_app

trait Math {

  def discriminant(a: Option[Int])(b: Option[Int])(c: Option[Int])(implicit const: Double): Double = b.getOrElse(0) * b.getOrElse(0) - const * a.getOrElse(0) * c.getOrElse(0)

  def rootNumberFunction(roots: Double): Any = if (roots > 0) print("2 different roots") else if (roots < 0) print("no roots") else print("2 equivalent roots")

  case class B(x: Option[Int], y: Option[Int])

  def rootCalculation(a: Option[Int])(b: Option[Int])(c: Option[Int])(d: Double)(implicit const: Double): Any = {
    val firstParameter = a.getOrElse(0)
    val secondPatameter = b.getOrElse(0)
    val thirdParameter = c.getOrElse(0)
    val result: Double = discriminant(Some(2))(Some(10))(Some(2))
    println(s"Вычисление дискриминанта... ${scala.math.sqrt(result)}")
  if (firstParameter == 0) print("Первый параметр не может быть нулевым!!! ")
  else if (d > 0) print(s"1'st root is ${(-secondPatameter + result) / 2 * firstParameter } , 2'd root is ${(-secondPatameter - result) / 2 * firstParameter }") //return Some(x1,x2)
  else if (d < 0) print(s"no roots found")
  else print(s"the root is ${(-secondPatameter + result) / 2 * firstParameter}")
}
}
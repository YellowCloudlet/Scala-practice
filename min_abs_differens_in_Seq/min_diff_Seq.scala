var i = 0 
def min_diff_Seq(s: Seq[Int], minDiff: Int = Int.MaxValue): Int = {
        s.headOption match {
          case Some(h) =>
            s.tail match {
              case Nil =>
                minDiff
              case thead :: ttail =>
                val diff = Math.abs(h - thead)
                i = i + 1
                if (diff == 0) {
                  0
                } else {
                  val newMinDiff = if (diff < minDiff) {
                    diff
                  } else {
                    minDiff
                  }
                  if (ttail == Nil) {
                    newMinDiff
                  } else {
                    w(s.tail, newMinDiff)
                  }
                }
            }
          case None => minDiff
        }
      }

val test = Seq(2, 6, 7, 8, 12, 12, 18, 1, 3)
println(min_diff_Seq(test))
//return mustBe 0

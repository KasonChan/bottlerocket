package demo

import show.{Show, Shows}

/**
 * Created by kasonchan on 10/2/15.
 */
object Demo extends Shows {

  def main(args: Array[String]) {
    // Generate container containing 3 videos, 1 image and 2 video ads
    val container1 = generateContainer(3, 1, 2)

    printContainer(container1)
    println()

    val show1 = Show("s1", "Show 1", "This is the show 1.", List(container1))

    printShow(show1)
  }

}

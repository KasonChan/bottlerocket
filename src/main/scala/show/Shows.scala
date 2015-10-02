package show

import container.Containers

/**
 * Created by kasonchan on 10/2/15.
 */
trait Shows extends Containers {

  /**
   * Print show
   * @param show The show to be printed: Show
   */
  def printShow(show: Show) = {
    println("ID: " + show.id)
    println("Name: " + show.name)
    println("Description: " + show.description)
    println()
    for (c <- show.containers) {
      printContainer(c)
    }
  }

}

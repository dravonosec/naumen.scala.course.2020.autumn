import scala.collection.mutable

class Table (height:Int , width:Int) {
  private val table = mutable.Seq.fill[Cell] (width, height) {new EmptyCell}

  def getCell (ix: Int, iy: Int): Option[Cell] = {
    if (iy <= height && ix <= width && iy >= 0 && ix >= 0)
      return Option(table(ix)(iy))
    None
  }

  def setCell (ix: Int, iy: Int, cell: Cell):Unit = {
    if (iy <= height && ix <= width && iy >= 0 && ix >= 0)
      table(ix)(iy) = cell}
}
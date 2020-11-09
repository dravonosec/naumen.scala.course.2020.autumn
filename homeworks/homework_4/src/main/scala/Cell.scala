trait Cell {

}

class EmptyCell extends Cell {
  override def toString: String = "empty"
}

class NumberCell (number: Int) extends Cell {
  override def toString: String = number.toString
}

class StringCell (str: String) extends Cell {
  override def toString: String = str
}

class ReferenceCell (ix: Int, iy: Int, table: Table) extends Cell {
  override def toString: String = {
    val refCell = getRefCell
    refCell match {
      case Some(cell: ReferenceCell) => {
        if (cell.getRefCell.get == this) "cyclic"
        else cell.getRefCell.get.toString
      }
      case Some(cell: Cell) => cell.toString
      case None => "outOfRange"
    }
  }

  def getRefCell: Option[Cell] = table.getCell(ix, iy)
}
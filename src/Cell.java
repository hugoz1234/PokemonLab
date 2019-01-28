package src;

public class Cell {
  private CellData data;

  public Cell(CellData data){
    this.data = data;
  }

  @Override
  public String toString(){
    if (this.data != null){
      return this.data.toString();
    } else {
      return " ";
    }
  }
}

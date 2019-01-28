package src;

public class Location {
  private int row;
  private int column;

  public Location(int row, int column){
    this.row = row;
    this.column = column;
  }

  public int getRow(){
    return this.row;
  }

  public int getColumn(){
    return this.column;
  }
}

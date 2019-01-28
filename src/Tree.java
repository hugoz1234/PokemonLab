package src;

public class Tree extends CellData{
  private String type = "tree";
  private Location location;

  public Tree(Location location){
    this.location = location;
  }

  @Override
  public String toString(){
    return "*";
  }
}

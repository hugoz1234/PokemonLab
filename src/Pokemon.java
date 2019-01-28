package src;

public class Pokemon extends CellData{
  private String name;
  private String type = "pokemon";
  private Location location;

  public Pokemon(String name){
    this.name = name;
  }
}

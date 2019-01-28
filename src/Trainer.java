package src;

import java.util.*;

public class Trainer extends CellData{
  private String name;
  private String type = "trainer";
  private List<Pokemon> pokemon;
  private Location location;

  public Trainer(String name, Location location){
    this.name = name;
    this.location = location;
  }

  public Location getLocation(){
    return this.location;
  }

  @Override
  public String toString(){
    return ":)";
  }
}

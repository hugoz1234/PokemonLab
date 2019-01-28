package src;

import java.util.*;

public class World {
  private String foo;
  private ArrayList<ArrayList<Cell>> map;
  private int size;
  private Trainer trainer;

  public World (int size, String trainerName){
    this.size = size;
    this.map = buildMap(size, trainerName);
  }

  /*
    builds map to the following spec:
      - size x size map
      - peripheral spots are trees
      - TODO: random trees
  */
  private ArrayList<ArrayList<Cell>> buildMap(int size, String trainerName){
    ArrayList<ArrayList<Cell>> map = new ArrayList<ArrayList<Cell>>();
    for(int i = 0; i < size; i++){
      ArrayList<Cell> row = new ArrayList<Cell>();
      for(int j = 0; j < size; j++){
        Location location = new Location(i, j);
        if (i == 0 || j == 0 || i == size - 1 || j == size - 1){
          Tree tree = new Tree(location);
          row.add(new Cell(tree));
        } else if (i == size/2 && j == size/2){
          Trainer trainer = new Trainer(trainerName, location);
          this.trainer = trainer;
          row.add(new Cell(trainer));
        } else {
          row.add(new Cell(null));
        }
      }
      map.add(row);
    }
    return map;
  }

  public void printTheWorld(){
    for(int i = 0; i < this.map.size() ; i++){
      ArrayList<Cell> row = this.map.get(i);
      System.out.println(row.toString());
    }
  }

  public Location getTrainerLocation(){
    return this.trainer.getLocation();
  }

  public void printTrainerLocation(){
    Location location = this.getTrainerLocation();
    System.out.println("Trainer's location: row " + location.getRow() + ", column " + location.getColumn());
  }

}

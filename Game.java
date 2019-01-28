import java.util.*;
import src.*;

public class Game {
  public static void main(String[] args){
    boolean inGame = true;
    int worldSize = 20;
    System.out.println("hello, what is your trainer's name?");
    Scanner scanner = new Scanner(System.in);
    String name = scanner.next();
    World world = new World(worldSize, name);
    while (inGame){
      System.out.println(name + ", this is the world");
      world.printTheWorld();
      inGame = false;
    }
  }
}

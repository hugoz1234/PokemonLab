Pokemon Mega-Project

Please read over all instructions very carefully before you begin.

This project is due on Feb 11, 2019 before 11:59 pm. Submit at http://laces.rocks/submit-unit5. You should work with a partner.

In this project, we are building a Pokemon game. There will be a map and your character will be able to walk around the map. You will randomly encounter Pokemon, which you will battle. This will be the biggest project you've done yet. Expect to write ~250 lines of beautiful code.

The World
The map should be a 20x20 grid. Each cell can be blank, contain the player, contain a wild Pokemon, or contain a tree. Design a World class to model this. Think about what private data members it might need. Using what you've learned about encapsulation, consider what public methods the World class should expose.

To prevent the player from escaping the map, make sure the first and last rows and columns are all trees. Also scatter a few trees randomly around the map (see your notes for how to generate random numbers between 0 and 19).

The Trainer
Your Trainer class should be fairly similar to the one you designed on January 25. However, now it should also store its location.

Gameplay
When your game starts, it should ask you for your name. It should then instantiate a Trainer object and give it a starting Pokemon. The game should also randomly generate 18 wild Pokemon and place them in random locations in the world (one in each row except the first and last, and in a random column).

Normally, the game should be in Exploration Mode. It should repeatedly print the current World and then print "Ash, enter a direction (N, W, S, or E) to move: ". Then, one of 3 things can happen: the player can fail to move (because of invalid input or because they tried to move into a tree), they can move normally, or they move on top of a wild Pokemon (which starts a battle).

If you moved on top of a wild Pokemon, the game switches to Battle Mode. See below for more details on this.

If all the Trainer's Pokemon die, the game is over and the player loses. If all the wild Pokemon are captured, the game is over and the player wins. 

Battles
Remember when we wrote a Pokemon battle simulator many months ago? Now, we're taking it to the next level. In battle mode, the game asks you to pick a Pokemon from your collection. It then repeatedly prints out the remaining HP of your Pokemon and the wild one, and asks you if you want to Run Away, Attack, or Change Pokemon. Running away ends the battle and the wild Pokemon should disappear. Attacking causes your Pokemon to attack the wild one and then the wild one attacks your Pokemon.  

If your Pokemon dies, then you must choose to change Pokemon or Run Away.

TODO: add a lot more details here.


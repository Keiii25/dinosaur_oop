# dinosaur_oop
• A dinosaur rogue game developed for an university assignment. 
• The project emphasised on objected oriented programming and design principles. 
• A HD was received for this project.

Features: 
1. Grass
Here are the rules for growing plants:
• At the beginning of the game, each square of dirt has a small chance to grow grass.
• On any turn, any square of dirt that is next to at least two squares of grass has a larger chance to grow grass
• On any turn, any square of dirt that is next to a tree has a small (again, say 2%) chance for grass
to grow in it.
• On any turn, any tree has a small (say, 5%) chance to drop a fruit. Dropped fruit will sit on the same square as the tree. Fruit left on the ground will rot away in 20 turns.
The player can interact with plants in the following ways:
• If the player is standing on grass, they can harvest it, giving hay.
• The player can pick up fruit that is lying on the ground. Fruit in the player’s inventory does not rot.
• The player can try to pick fruit from a tree in the same square. This has a chance of failing .

2. Hungry dinosaurs
• A dinosaur that is hungry should move towards a food source and eat it. Stegosaurs are herbivores and
can eat leaves, fruits, and grasses1
• A stegosaur start out with a “food level” of 50 out of a maximum of 100. This decrease by 1 on every turn. If the food level gets to zero, the stegosaur becomes unconscious and cannot move or act unless it is fed. After 20 turns of unconsciousness, the stegosaur dies.
• Grazing on grass increase the stegosaur’s food level by 5. When a stegosaur grazes on a square of grass, the ground at that location should go back to being bare dirt.
• If the player is standing next to a stegosaur and holding fruit or hay, they should be able to feed it to the stegosaur. Fruit should increase the stegosaur’s food level by 30, and hay should increase it by 20.

3. Breeding
• If a stegosaur is sufficiently well-fed, i.e. has a food level over 50, it has a chance to breed. A stegosaur that wants to breed will try to move towards another stegosaur of the opposite sex, if there is one nearby.
• Once in an adjacent square, the stegosaurs will mate. Ten turns later, the female of the pair will lay a stegosaur egg.
• Stegosaur eggs will hatch after a while (experiment to find a length of time that works well), into a baby stegosaur. Baby dinosaurs are hungry: its starting food level should only be 10. Baby stegosaurs cannot breed.
• After 30 turns, the baby stegosaur should grow into an adult.

4. Eco points and purchasing
This game uses “eco points” for currency. Eco points are gained whenever any of the following happens:
• grass grows or is harvested (1 point)
• hay is fed to a dinosaur (10 points)
• fruit is fed to a dinosaur (15 points)
• a stegosaur hatches (100 points)
• an allosaur hatches (1000 points)
You must place a vending machine on the map. This vending should sell:
• hay, fruit, vegetarian meal kit, carnivore meal kit, stegosaur eggs, allosaur eggs, laser gun 
• Vegetarian and carnivore meal kits are items that the player can feed to a vegetarian or carnivorous dinosaur. The meal kit will fill the target dinosaur up to it maximum food level and then disappear.
• The laser gun is a weapon that does enough damage to kill a stegosaur in one or two hits. The player can use this to ensure that the stegosaurs do not grow too quickly for the available food supply, and to create food for allosaurs.

5. Allosaurs
Like stegosaurs, allosaurs must be able to feed, breed, and grow. But unlike stegosaurs, Allosaurs are carnivores – they eat meat. If they go near a stegosaur, they will attack it. If they go near a dead stegosaur, they will move toward it and eat it.
Allosaurs do not appear on the map at the start of the game. Their eggs can be purchased from the vending machine for 1000 points each. Adult Allosaurs have a maximum food level of 100. They can eat dead Allosaurs for an increase of 50 in their food level, or eggs for an increase of 10.

6. Thirst and water
As well as hunger, dinosaurs also experience thirst. As with hunger, animals should lose one point of water each turn. When the water level gets low, the animal should water to drink on the map. Land-based creatures cannot enter water, and trees cannot grow there. 

7. Agilisaurus
• Agilisaurus is a small omnivorous dinosaur – it can eat fruits, grass, hay, any kind of meal kit, and meat. It can seek out corpses, but is not large enough to attack an Allosaur or Stegosaur. 
• Allosaurs will hunt, kill, and eat Agilisaurus, although they are not worth a large amount of food value as they are small.
• Agilisaurus eggs is available for purchase in the vending machine for a suitable amount of ecopoints.

8. Archaeopteryx
• Archaeopteryx can fly and traverse water squares.
• Archaeopteryx are carnivorous, and will scavenge and attack other dinosaurs for food.

9. Second map
When you go north from the existing map, you should end up at the south edge of the new map.
• the game begin with a menu that allows the player to select a game mode to play: Challenge or Sandbox
• selecting Challenge starts a Challenge game, and selecting Sandbox starts a Sandbox game
• this menu should also allow the player to quit
• when starting a Challenge game, the player can choose a number of moves and a number of eco
points
• in a Challenge game, the player wins if they get the specified number of eco points within the
specified number of moves, and loses if they do not (i.e. if they do not earn enough, or if they
have spent too much)
• in a Sandbox game, the game plays as normal
• when playing a Challenge or Sandbox game, the player can choose to quit
• winning, losing, or quitting should give the player the option to play another game (choosing
Challenge or Sandbox) or close the program

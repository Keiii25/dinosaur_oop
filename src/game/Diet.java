package game;

import edu.monash.fit2099.engine.Actor;
import edu.monash.fit2099.engine.Ground;
import edu.monash.fit2099.engine.Item;

public class Diet{

    private Actor actor;
    private Item item;
    private Ground ground;

    public Diet(Actor actor, Item item) {
        this.actor = actor;
        this.item = item;
    }

    public Diet(Actor actor, Ground ground) {
        this.actor = actor;
        this.ground = ground;
    }

    public boolean diet() {
        if (item != null) {
            if ((item.hasCapability(TypeOfFood.HERBIVOROUS) && actor.hasCapability(DinosaurCapability.HERBIVORE)) || (item.hasCapability(TypeOfFood.CARNIVOROUS) && actor.hasCapability(DinosaurCapability.CARNIVORE))) {
                return true;
            }
        } else if (ground != null) {
            if ((ground.hasCapability(TypeOfFood.HERBIVOROUS) && actor.hasCapability(DinosaurCapability.HERBIVORE)) || (ground.hasCapability(TypeOfFood.CARNIVOROUS) && actor.hasCapability(DinosaurCapability.CARNIVORE))) {
                return true;
            }
        }
        return false;
    }
}

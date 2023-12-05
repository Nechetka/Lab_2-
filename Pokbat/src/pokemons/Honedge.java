package pokemons;

import attack.PhysicalMoves.Facade;
import attack.SpecialMoves.FlashCannon;
import ru.ifmo.se.pokemon.*;

public class Honedge extends Pokemon {
    public Honedge(String name, int level){
        super(name, level);
        this.setStats(45,80,100,35,37,28);
        this.setType(Type.STEEL, Type.GHOST);
        this.addMove(new FlashCannon());
        this.addMove(new Facade());
    }
}

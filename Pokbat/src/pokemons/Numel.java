package pokemons;

import attack.PhysicalMoves.Facade;
import attack.SpecialMoves.Flamethrower;
import attack.SpecialMoves.Thunder;
import attack.StatusMoves.Confide;
import attack.StatusMoves.Rest;
import ru.ifmo.se.pokemon.*;

public class Numel extends Pokemon {
    public Numel (String name, int level){
        super(name, level);
        this.setStats(60,60,40,65,45,35);
        this.setType(Type.FIRE, Type.GROUND);
        this.addMove(new Rest());
        this.addMove(new Confide());
        this.addMove(new Flamethrower());
    }
}

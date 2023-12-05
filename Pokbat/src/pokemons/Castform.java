package pokemons;
import attack.SpecialMoves.Thunder;
import attack.StatusMoves.Amnesia;
import attack.StatusMoves.Confide;
import attack.StatusMoves.CosmicPower;
import ru.ifmo.se.pokemon.*;
public class Castform extends Pokemon{
    public Castform (String name, int level){
        super(name, level);
        this.setStats(70,70,70,70,70,70);
        this.setType(Type.NORMAL);
        this.addMove(new Amnesia());
        this.addMove(new Confide());
        this.addMove(new CosmicPower());
        this.addMove(new Thunder());
    }
}

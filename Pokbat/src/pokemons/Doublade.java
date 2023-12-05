package pokemons;

import attack.PhysicalMoves.Tackle;

public class Doublade extends Honedge{
    public Doublade(String name, int level){
        super(name, level);
        this.setStats(59,110,150,45,49,35);
        this.addMove(new Tackle());

    }
}

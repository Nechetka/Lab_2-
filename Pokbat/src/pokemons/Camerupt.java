package pokemons;

import attack.PhysicalMoves.StoneEdge;

public class Camerupt extends Numel  {
    public Camerupt (String name, int level){
        super(name, level);
        this.setStats(70,100,70,105,75,40);
        this.addMove(new StoneEdge());
    }
}

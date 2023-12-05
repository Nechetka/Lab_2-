package pokemons;

import attack.PhysicalMoves.IronHead;

public class Aegislash_Blade extends Doublade{
    public Aegislash_Blade(String name, int level){
        super(name, level);
        this.setStats(60,150,140,150,140,60);
        this.addMove(new IronHead());
    }
}

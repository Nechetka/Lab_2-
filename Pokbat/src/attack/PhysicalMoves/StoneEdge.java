package attack.PhysicalMoves;

import ru.ifmo.se.pokemon.*;

public class StoneEdge extends PhysicalMove {
    public StoneEdge(){
        super(Type.ROCK,100,80);
    }

    @Override
    protected double calcCriticalHit(Pokemon var1, Pokemon var2) {
        if (var1.getStat(Stat.SPEED)*3.0 / 512.0 > Math.random()) {
            System.out.print("critical");
            return 2.0;
        } else {
            return 1.0;
        }
    }

    @Override
    protected String describe(){
        return "да настанет эра краёв камней!";
    }
}

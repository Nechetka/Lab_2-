package attack.PhysicalMoves;

import ru.ifmo.se.pokemon.*;

public class Facade extends PhysicalMove {
    public Facade(){
            super(Type.NORMAL,70,100);
    }

    @Override
    protected double calcBaseDamage(Pokemon var1, Pokemon var2) {
        double bust = 1.0;
        if (Status.BURN.equals(var1.getCondition()) |
                Status.PARALYZE.equals(var1.getCondition()) |
                Status.POISON.equals(var1.getCondition())) {
            bust = 2.0;
            System.out.println("double attack under the status");
        }
        return (0.4 * (double) var1.getLevel() + 2.0) * (this.power * bust) / 150.0;
    }

    @Override
    protected String describe() {
        return "атакует с помощью Facade(в состояниях сильней)";
    }
}

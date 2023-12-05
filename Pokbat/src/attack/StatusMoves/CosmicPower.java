package attack.StatusMoves;

import ru.ifmo.se.pokemon.*;

public class CosmicPower extends StatusMove {
    public CosmicPower(){
        super(Type.PSYCHIC,0,100);
    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        p.setMod(Stat.SPECIAL_DEFENSE, 1);
        p.setMod(Stat.DEFENSE,1);
    }

    @Override
    protected String describe(){
        return "взывает к космосу за помощью";
    }
}

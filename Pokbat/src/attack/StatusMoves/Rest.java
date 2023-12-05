package attack.StatusMoves;

import ru.ifmo.se.pokemon.*;

public class Rest extends StatusMove {
    public Rest(){
        super(Type.PSYCHIC,0,100);
    }

    @Override
    protected void applySelfEffects(Pokemon p){
        p.restore();
        p.setCondition(new Effect().condition(Status.SLEEP).attack(0.0).turns(2));
    }

    @Override
    protected String describe(){
        return "отходит в мир снов (я вернусь...)";
    }
}

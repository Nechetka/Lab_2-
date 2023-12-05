package attack.SpecialMoves;

import area.WeatherStatus;
import ru.ifmo.se.pokemon.*;

import java.util.Objects;

public class Thunder extends SpecialMove {
    public Thunder(){
        super(Type.ELECTRIC,110,  70);
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        if (!p.hasType(Type.ELECTRIC)) {
            Effect var1 = (new Effect()).condition(Status.PARALYZE).attack(0.75).turns(-1).chance(0.3);
            var1.stat(Stat.SPEED, -2);
            p.setCondition(var1);
        }
        super.applyOppEffects(p);
    }

    @Override
    protected boolean checkAccuracy(Pokemon var1, Pokemon var2){
        int accuracyBonus = 0;
        if (Objects.equals(WeatherStatus.getWeather(), "rain")) { accuracyBonus=30; }
        if (Objects.equals(WeatherStatus.getWeather(), "sun")) { accuracyBonus=-20; }
        return (this.accuracy + accuracyBonus) * var1.getStat(Stat.ACCURACY) / var2.getStat(Stat.EVASION) > (Math.random() * 100.0);
    }

    @Override
    protected String describe(){

        return "атакует с помощью Thunder'struck (e-e-e-ee e-e-e-ee)";
    }
}

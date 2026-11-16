package moves.physical;

import ru.ifmo.se.pokemon.*;

public final class Blizzard extends StatusMove {
    public Blizzard(){super(Type.ICE, 110, 0.7);}
    @Override
    protected void applyOppEffects(Pokemon p){
        p.setCondition(new Effect().chance(0.1).condition(Status.FREEZE).attack(0));
    }
    @Override
    protected String describe(){
        return "применяет Blizzard";
    }
}

package moves.special;

import ru.ifmo.se.pokemon.*;

public final class IceBeam extends SpecialMove {
    public IceBeam(){super(Type.ICE, 90, 1.0);}
    @Override
    protected void applyOppEffects(Pokemon p){
        if (!p.hasType(Type.ICE)) {
            p.setCondition(new Effect().chance(1.0).condition(Status.FREEZE).attack(0));
        }
    }
    @Override
    protected String describe(){
        return "применяет IceBeam";
    }
}

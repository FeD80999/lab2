package moves.status;

import ru.ifmo.se.pokemon.*;

public final class Rest extends StatusMove {
    public Rest(){super(Type.PSYCHIC, 0, 1.0);}
    @Override
    protected  void applySelfEffects(Pokemon p){
        p.setCondition(new Effect().condition(Status.SLEEP).turns(2).attack(0));
        p.setMod(Stat.HP, (int) (p.getHP() - p.getStat(Stat.HP)));
    }
    @Override
    protected String describe(){
        return "применяет Rest";
    }
}

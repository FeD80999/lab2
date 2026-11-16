package moves.status;
import ru.ifmo.se.pokemon.*;

public final class NobleRoar extends StatusMove {
    public NobleRoar(){super(Type.NORMAL, 0, 1.0);}
    @Override
    protected void applyOppEffects(Pokemon p){
        p.setMod(Stat.SPECIAL_ATTACK, -1);
        p.setMod(Stat.ATTACK, -1);
    }
    @Override
    protected String describe(){
        return "применяет NobleRoar";
    }
}

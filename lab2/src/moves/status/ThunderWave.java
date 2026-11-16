package moves.status;
import ru.ifmo.se.pokemon.*;

public final class ThunderWave extends StatusMove {
    public ThunderWave(){super(Type.ELECTRIC, 0, 0.9);}
    @Override
    protected void applyOppEffects(Pokemon p) {
        Effect.paralyze(p);
    }
    @Override
    protected String describe(){
        return "применяет ThunderWave";
    }
}

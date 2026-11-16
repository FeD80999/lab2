package moves.physical;
import ru.ifmo.se.pokemon.*;

public final class WildCharge extends PhysicalMove {
    public WildCharge(){super(Type.ELECTRIC, 90, 1.0);}
    @Override
    protected void applySelfDamage(Pokemon self, double damage) {
        self.setMod(Stat.HP, (int) Math.round(damage / 4));
    }
    @Override
    protected String describe(){
        return "применяет WildCharge";
    }
}
package moves.physical;
import ru.ifmo.se.pokemon.*;

public final class TakeDown extends PhysicalMove{
    public TakeDown(){super(Type.NORMAL, 90, 0.85);}
    @Override
    protected void applySelfDamage(Pokemon self, double damage){
        self.setMod(Stat.HP, (int) Math.round(damage / 4));

    }
    @Override
    protected String describe(){
        return "применяет TakeDown";
    }
}

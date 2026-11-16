package pokemon.water;
import ru.ifmo.se.pokemon.*;
import moves.status.Rest;
import moves.physical.Blizzard;
import moves.special.IceBeam;

public class Wailmer extends Pokemon {
    public Wailmer(String name, int level){
        super(name, level);
        setType(Type.WATER);
        setStats(130, 70,35, 70, 35, 60);
        addMove(new Rest());
        addMove(new Blizzard());
        addMove(new IceBeam());
    }
}

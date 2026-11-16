package pokemon.water;
import moves.status.NobleRoar;

public class Wailord extends Wailmer {
    public Wailord(String name, int level){
        super(name, level);
        setStats(170, 90, 45, 90, 45, 60);
        addMove(new NobleRoar());
    }
}


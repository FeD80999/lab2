package pokemon;

import moves.status.CalmMind;
import moves.status.DoubleTeam;
import moves.special.FocusBlast;
import moves.physical.TakeDown;
import ru.ifmo.se.pokemon.*;
public final class Keldeo extends Pokemon {
   public Keldeo(String name, int level) {
       super(name, level);
       setType(Type.WATER,Type.FIGHTING);
       setStats(91, 72, 90, 129, 90, 108);
       addMove(new DoubleTeam());
       addMove(new TakeDown());
       addMove(new CalmMind());
       addMove(new FocusBlast());
   }
}

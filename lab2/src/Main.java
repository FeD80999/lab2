import pokemon.Keldeo;
import pokemon.electro.*;
import pokemon.water.*;
import ru.ifmo.se.pokemon.*;

public class Main {
    public static void main(String[] args) {
        Battle b = new Battle();

        Pokemon p1 = new Keldeo("Денчик", 1);
        Pokemon p2 = new Eelektross("Ромчик", 1);
        Pokemon p3 = new Wailord("Егор", 1);

        Pokemon p4 = new Tynamo("Тёма", 1);
        Pokemon p5 = new Eelektrik("Макс", 1);
        Pokemon p6 = new Wailmer("Витя", 1);

        b.addAlly(p1);
        b.addAlly(p2);
        b.addAlly(p3);

        b.addFoe(p4);
        b.addFoe(p5);
        b.addFoe(p6);

        b.go();
    }
}
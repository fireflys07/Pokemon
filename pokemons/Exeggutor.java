package pokemons;
import ru.ifmo.se.pokemon.Type;

public final class Exeggutor extends Exeggcute {
    public Exeggutor(String name, int level) {
        super(name, level);
        setType(Type.GRASS, Type.PSYCHIC);
        setStats(95, 95, 85, 125, 75, 55);
        addMove(new moves.WoodHammer());
    }
}



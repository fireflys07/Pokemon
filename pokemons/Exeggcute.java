package pokemons;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Exeggcute extends Pokemon {
    public Exeggcute(String name, int level) {
        super(name, level);
        setType(Type.GRASS, Type.PSYCHIC);
        setStats(60, 40, 80, 60, 45, 40);
        addMove(new moves.DreamEater());
        addMove(new moves.LeafStorm());
        addMove(new moves.Swagger());
    }
}



package pokemons;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public final class Flygon extends Pokemon {

    public Flygon(String name, int level) {
        super(name, level);
        setType(Type.GRASS, Type.FIGHTING);
        setStats(91, 90, 72, 90, 129, 108);
        addMove(new moves.DoubleTeam());
        addMove(new moves.TakeDown());
        addMove(new moves.WorkUp());
        addMove(new moves.DoubleKick());

    }
}
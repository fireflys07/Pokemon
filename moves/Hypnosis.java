package moves;
import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public final class Hypnosis extends StatusMove {
    public Hypnosis() {
        super(Type.PSYCHIC, 0, 60);
    }

    @Override
    protected void applyOppEffects(Pokemon target) {
        Effect.sleep(target);
    }

    @Override
    protected String describe() {
        return "применяет Hypnosis";
    }
}



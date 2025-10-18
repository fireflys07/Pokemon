package moves;
import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public final class Rest extends StatusMove {
    public Rest() {
        super(Type.PSYCHIC, 0, 100);
    }

    @Override
    protected void applySelfEffects(Pokemon self) {
        // Simplified: user falls asleep; healing is handled by simulator's sleep recovery over time
        Effect.sleep(self);
    }

    @Override
    protected String describe() {
        return "использует Rest";
    }
}



package moves;
import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public final class Thunderbolt extends SpecialMove {
    public Thunderbolt() {
        super(Type.ELECTRIC, 90, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon target) {
        if (Math.random() < 0.1) {
            Effect.paralyze(target);
        }
    }

    @Override
    protected String describe() {
        return "бьёт Thunderbolt";
    }
}



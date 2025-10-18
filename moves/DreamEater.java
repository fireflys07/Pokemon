package moves;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Status;
import ru.ifmo.se.pokemon.Type;

public final class DreamEater extends SpecialMove {
    public DreamEater() {
        super(Type.PSYCHIC, 100, 100);
    }

    @Override
    protected boolean checkAccuracy(Pokemon att, Pokemon def) {
        if (def.getCondition() != Status.SLEEP) {
            return false;
        }
        return super.checkAccuracy(att, def);
    }

    @Override
    protected String describe() {
        return "использует Dream Eater";
    }
}



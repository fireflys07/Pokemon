package moves;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

public final class DoubleKick extends PhysicalMove {
    public DoubleKick() {
        super(Type.FIGHTING, 30, 100);
    }

    @Override
    protected String describe() {
        return "бьёт Double Kick";
    }
}



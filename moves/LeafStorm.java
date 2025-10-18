package moves;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public final class LeafStorm extends SpecialMove {
    public LeafStorm() {
        super(Type.GRASS, 130, 90);
    }

    @Override
    protected void applySelfEffects(Pokemon self) {
        self.setMod(Stat.SPECIAL_ATTACK, -2);
    }

    @Override
    protected String describe() {
        return "запускает Leaf Storm";
    }
}



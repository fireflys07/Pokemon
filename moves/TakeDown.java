package moves;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public final class TakeDown extends PhysicalMove {
    public TakeDown() {
        super(Type.NORMAL, 90, 85);
    }

    @Override
    protected void applySelfDamage(Pokemon self, double damage) {
        self.setMod(ru.ifmo.se.pokemon.Stat.HP, (int) Math.round(damage / 4));
    }

    @Override
    protected String describe() {
        return "атакует Take Down";
    }
}



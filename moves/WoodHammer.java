package moves;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public final class WoodHammer extends PhysicalMove {
    public WoodHammer() {
        super(Type.GRASS, 120, 100);
    }

    @Override
    protected void applySelfDamage(Pokemon self, double damage) {
        self.setMod(ru.ifmo.se.pokemon.Stat.HP, (int) Math.round(damage / 3));
    }

    @Override
    protected String describe() {
        return "атакует Wood Hammer";
    }
}



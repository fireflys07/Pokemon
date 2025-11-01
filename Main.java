import ru.ifmo.se.pokemon.*;

public class Main {
    public static void main(String[] args) {
        Battle b = new Battle();

        // Team A
        Pokemon virizion = new pokemons.Virizion("Virizion", 60);
        Pokemon exeggcute = new pokemons.Exeggcute("Exeggcute", 30);
        Pokemon exeggutor = new pokemons.Exeggutor("Exeggutor", 50);
        Pokemon p1 = new Pokemon("test",10);


        // Team B
        Pokemon ralts = new pokemons.Ralts("Ralts", 15);
        Pokemon kirlia = new pokemons.Kirlia("Kirlia", 25);
        Pokemon gardevoir = new pokemons.Gardevoir("Gardevoir", 45);
        Pokemon p2 = new Pokemon("test2",10);

        b.addAlly(virizion);
        b.addAlly(exeggcute);
        b.addAlly(exeggutor);
        //b.addAlly(p1);



        b.addFoe(ralts);
        b.addFoe(kirlia);
        b.addFoe(gardevoir);
        //b.addFoe(p2);



        b.go();
    }
}

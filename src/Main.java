public class Main {
    public static void main(String[] args) {
        // Opret skov og by og tilføj Pokémoner
        Forest forest = new Forest();
        forest.addPokemon(new Pokemon("Pikachu", "Electric", 10));
        forest.addPokemon(new Pokemon("Charmander", "Fire", 12));
        forest.addPokemon(new Pokemon("Squirtle", "Water", 8));
        forest.addPokemon(new Pokemon("Bulbasaur", "Grass", 7));
        forest.addPokemon(new Pokemon("Mewtwo", "Psychic", 99));

        City city = new City();
        city.addPokemon(new Pokemon("Jigglypuff", "Normal", 22));


        // Vis alle Pokémoner i skoven og byen
        forest.showAllPokemon();
        city.showAllPokemon();

        // Opret en træner
        Trainer ash = new Trainer("Ash");

        // Træneren søger efter en Pokémon baseret på navn
        ash.searchForPokemon(forest, "name", "Mewtwo");

        // Træneren søger efter en Pokémon baseret på type
        ash.searchForPokemon(city, "type", "Normal");

        // Prøver at søge efter en ikke-eksisterende Pokémon
        ash.searchForPokemon(forest, "name", "Charizard");
    }
}

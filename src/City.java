public class City extends Forest {

    @Override
    public void showAllPokemon() {
        System.out.println("\nPokémon i byen:");
        for (Pokemon p : this.getPokemonList()) {
            System.out.println(p);
        }
    }
}

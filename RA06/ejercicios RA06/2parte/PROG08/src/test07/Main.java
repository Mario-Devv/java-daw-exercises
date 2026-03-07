package test07;

import java.util.LinkedHashSet;
import java.util.Set;

public class Main {

        public static void main(String[] args)
        {
            // Crear cinco Pokémon diferentes
            Pokemon pikachu = new Pokemon("Pikachu", "Eléctrico", 35, 5);
            Pokemon charmander = new Pokemon("Charmander", "Fuego", 39, 5);
            Pokemon squirtle = new Pokemon("Squirtle", "Agua", 44, 5);
            Pokemon bulbasaur = new Pokemon("Bulbasaur", "Planta", 45, 5);
            Pokemon eevee = new Pokemon("Eevee", "Normal", 55, 5);

            // Crear HashSet y LinkedHashSet
            Set<Pokemon> equipo1 = new LinkedHashSet<>();
            Set<Pokemon> equipo2 = new LinkedHashSet<>();

            // Añadir Pokémon a HashSet
            equipo1.add(pikachu);
            equipo1.add(charmander);
            equipo1.add(squirtle);

            // Añadir Pokémon a LinkedHashSet
            equipo2.add(squirtle); // Este estará en ambos conjuntos
            equipo2.add(bulbasaur);
            equipo2.add(eevee);

            System.out.println("Pokémons en el Equipo1:");
            Pokemon.mostrarPokemonsIterator(equipo1);

            System.out.println();

            System.out.println("Pokémons en el Equipo2:");
            Pokemon.mostrarPokemonsForEach(equipo2);

    }
}

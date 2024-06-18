package Logica.ClasesPersonajes;

import Logica.Interfaces.IAire;
import Logica.Personaje;

public class MaestroAire extends Personaje implements IAire {

    // constructor
    public MaestroAire() {
    }

    // Implementando metodos abstractos
    @Override
    protected void habilidadAtaque() {
        System.out.println("Maestro aire, ataque rafaga de viento");
    }

    @Override
    protected void habilidadDefensa() {
        System.out.println("Maestro aire, defensa evacion de ataques");
    }

    @Override
    protected void habilidadEspecial() {
        System.out.println("Maestro aire, habilidad tornado");
    }

    // Implementando interfaces
    @Override
    public void rafagaDeViento() {
        System.out.println("Maestro aire: 100");
    }

    @Override
    public void habilidadTornado() {
        System.out.println("Maestro aire: 400");
    }

    @Override
    public void defensaEvacionDeAtaque() {
        System.out.println("Maestro aire: 100");
    }
}

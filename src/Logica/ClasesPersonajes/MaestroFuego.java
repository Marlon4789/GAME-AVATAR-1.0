package Logica.ClasesPersonajes;

import Logica.Interfaces.IFuego;
import Logica.Personaje;

public class MaestroFuego extends Personaje implements IFuego {

    // constructor
    public MaestroFuego() {
    }


    // Implementando metodos abstractos
    @Override
    protected void habilidadAtaque() {
        System.out.println("Maestro fuego, ataque lanza llamas");
    }

    @Override
    protected void habilidadDefensa() {
        System.out.println("Maestro fuego, defensa escudo de hierro");
    }

    @Override
    protected void habilidadEspecial() {
        System.out.println("Maestro fuego, habilidad especial rayo");
    }

    // Implementando interfaces

    @Override
    public void ataqueLanzaLLamas() {
        System.out.println("Maestro fuego: 300");
    }

    @Override
    public void habilidadRayo() {
        System.out.println("Maestro fuego: 100");
    }

    @Override
    public void defensaEscudoDeHierro() {
        System.out.println("Maestro fuego: 200");
    }


}

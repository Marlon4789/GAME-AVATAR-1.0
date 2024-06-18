package Logica2.ClasesPersoanjes;

import Logica2.ClaseAbstractaPersonaje.PersonajePlantilla;
import Logica2.InterfacesPersonajes.IFuego;

public class MaestroFuego extends PersonajePlantilla implements IFuego {

    // constructor
    public MaestroFuego(int id, String nombre, String categoria, int puntos) {
        this.id = id;
        this.nombre = nombre;
        this.categoria = categoria;
        this.puntos = puntos;
    }

    @Override
    protected void ataque() {
        System.out.println("Lanza llamas");
    }

    @Override
    protected void defensa() {
        System.out.println("Escudo de hierro");
    }

    @Override
    public void ataqueEspecialFuego() {
        System.out.println("Super rayo");
    }
}

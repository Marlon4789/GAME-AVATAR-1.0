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

    // getters and setters
    public String getNomnre(){
        return nombre;
    }

    public String getCategoria(){
        return categoria;
    }

    public int getPuntos(){
        return puntos;
    }

    @Override
    public void ataqueEspecialFuego() {
        System.out.println("Super rayo");
    }

    @Override
    public void ataque() {
        System.out.println("Lanza llamas");
    }

    @Override
    public void defensa() {
        System.out.println("Escudo de hierro");
    }
}

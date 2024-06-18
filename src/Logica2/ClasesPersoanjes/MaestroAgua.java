package Logica2.ClasesPersoanjes;

import Logica.Personaje;
import Logica2.ClaseAbstractaPersonaje.PersonajePlantilla;
import Logica2.InterfacesPersonajes.IAgua;

public class MaestroAgua extends PersonajePlantilla implements IAgua {

    // constructor
    public MaestroAgua(int id, String nombre, String categoria, int puntos) {
        this.id = id;
        this.nombre = nombre;
        this.categoria = categoria;
        this.puntos = puntos;
    }

    // Metodos abstractos
    @Override
    protected void ataque() {
        System.out.println("Proyectiles de hielo");
    }

    @Override
    protected void defensa() {
        System.out.println("Escudo de hielo");
    }

    // Interface
    @Override
    public void ataqueEspecialAgua() {
        System.out.println("Sunami");
    }
}

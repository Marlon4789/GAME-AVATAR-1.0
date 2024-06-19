package Logica2.ClasesPersoanjes;

import Logica.Personaje;
import Logica2.ClaseAbstractaPersonaje.PersonajePlantilla;
import Logica2.InterfacesPersonajes.IAgua;

public class MaestroAgua extends PersonajePlantilla implements IAgua {

    // constructor

    public MaestroAgua() {
    }

    public MaestroAgua(int id, String nombre, String categoria, int puntos) {
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

    // Metodos abstractos

    @Override
    public void ataqueEspecialAgua() {
        System.out.println("Sunami");
    }

    @Override
    public void ataque() {
        System.out.println("Proyectil de hielo");
    }

    @Override
    public void defensa() {
        System.out.println("Escudo de hielo");
    }

}

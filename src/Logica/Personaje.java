package Logica;

public abstract class Personaje {
    //Atributos
    protected int id;
    protected String nombre;
    protected String categoria;
    protected String poder;
    protected String ataque;
    protected String puntaje;

    // metodos
    protected abstract void habilidadAtaque();
    protected abstract void habilidadDefensa();
    protected abstract void habilidadEspecial();
}

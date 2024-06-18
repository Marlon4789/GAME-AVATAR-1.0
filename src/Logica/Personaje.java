package Logica;

public abstract class Personaje {
    //Atributos
    protected int id;
    protected String nombre;
    protected String categoria;
    protected int ataque;
    protected int puntaje;

    // metodos
    protected abstract void habilidadAtaque();
    protected abstract void habilidadDefensa();
    protected abstract void habilidadEspecial();
}

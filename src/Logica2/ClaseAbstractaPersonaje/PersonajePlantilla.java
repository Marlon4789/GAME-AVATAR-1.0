package Logica2.ClaseAbstractaPersonaje;

public abstract class PersonajePlantilla {
    protected int id;
    protected String nombre;
    protected String categoria;
    protected int puntos;

    protected abstract void ataque();
    protected abstract void defensa();
}

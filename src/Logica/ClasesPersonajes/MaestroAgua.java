package Logica.ClasesPersonajes;

import Logica.Interfaces.IAgua;
import Logica.Personaje;

public class MaestroAgua extends Personaje implements IAgua {
    @Override
    protected void habilidadAtaque() {
        System.out.println("Maestro agua, ataque proyectil de hielo");
    }

    @Override
    protected void habilidadDefensa() {
        System.out.println("Maetro agua, defensa escudo de hielo");
    }

    @Override
    protected void habilidadEspecial() {
        System.out.println("Maestro agua, habilidad sunami");
    }

    // Implementando Interfaces

    @Override
    public void ataqueProyectilDeHielo() {
        System.out.println("Maestro agua : 100 puntos");
    }

    @Override
    public void habilidadSunami() {
        System.out.println("Maestro agua: 300 puntos");
    }

    @Override
    public void defensaEscudoDeHielo() {
        System.out.println("Maestro agua: 200");
    }
}

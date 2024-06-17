package Logica.ClasesPersonajes;

import Logica.Interfaces.ITierra;
import Logica.Personaje;

public class MaestroTierra extends Personaje implements ITierra {
    @Override
    protected void habilidadAtaque() {
        System.out.println("Maestro tierra, ataque rafaga de rocas");
    }

    @Override
    protected void habilidadDefensa() {
        System.out.println("Maestro tierra, defensa muralla de piedra");
    }

    @Override
    protected void habilidadEspecial() {
        System.out.println("Maestro tierra, habilidad terremoto");
    }

    // Implementando interfaces

    @Override
    public void rafagaDeRocas() {
        System.out.println("Maestro tierra: 100");
    }

    @Override
    public void habilidadTerremoto() {
        System.out.println("Maestro tierra: 300");
    }

    @Override
    public void defensaMurallaDePiedra() {
        System.out.println("Maestro tierra: 200");
    }
}

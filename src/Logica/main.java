package Logica;

import Logica.ClasesPersonajes.MaestroAgua;
import Logica.ClasesPersonajes.MaestroAire;
import Logica.ClasesPersonajes.MaestroFuego;
import Logica.ClasesPersonajes.MaestroTierra;

public class main {
    public static void main(String[] args) {

        MaestroAgua maestroAgua = new MaestroAgua();
        MaestroAire maestroAire = new MaestroAire();
        MaestroFuego maestroFuego = new MaestroFuego();
        MaestroTierra maestroTierra = new MaestroTierra();


        maestroAgua.ataqueProyectilDeHielo();
        maestroAgua.habilidadSunami();
        maestroAgua.defensaEscudoDeHielo();

        maestroFuego.ataqueLanzaLLamas();
        maestroFuego.defensaEscudoDeHierro();
        maestroFuego.habilidadRayo();

        maestroAire.rafagaDeViento();
        maestroAire.defensaEvacionDeAtaque();
        maestroAire.habilidadTornado();

        maestroTierra.rafagaDeRocas();
        maestroTierra.defensaMurallaDePiedra();
        maestroTierra.habilidadTerremoto();

    }
}

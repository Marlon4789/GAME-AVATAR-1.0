package Logica2;

import Logica2.ClasesPersoanjes.MaestroAgua;
import Logica2.ClasesPersoanjes.MaestroFuego;

public class main {
    public static void main(String[] args) {

        MaestroAgua maestroAgua = new MaestroAgua(1, "Katara", "Agua", 800);
        MaestroFuego maestroFuego = new MaestroFuego(2, "Zuko", "Fuego", 700);

        /*
        System.out.println("Nombre: " + maestroAgua.getNomnre());
        System.out.println("Categoria: " + maestroAgua.getCategoria());
        System.out.println("Puntaje: " + maestroAgua.getPuntos());
        */

        if (maestroAgua.getPuntos() > maestroFuego.getPuntos()){
            System.out.println("Maestro agua gano!!!");
            maestroAgua.ataqueEspecialAgua();

        } else if (maestroFuego.getPuntos() > maestroAgua.getPuntos() ) {
            System.out.println("Maestro fuego gano!!!");
        } else if (maestroFuego.getPuntos() == maestroAgua.getPuntos()) {
            System.out.println("Esto es un empate");
        }
        else {
            System.out.println("Algo salio mal, vuelve a intentar");
        }


    }
}

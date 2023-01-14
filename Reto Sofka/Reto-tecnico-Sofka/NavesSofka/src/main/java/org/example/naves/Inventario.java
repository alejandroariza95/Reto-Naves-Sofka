package org.example.naves;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Inventario {
    private  Scanner entradaEscaner = new Scanner (System.in);
    private int respuestaMenu;
    private int respuestaSubMenu;

    NavesVehiculosLanzadera navesVehiculosLanzadera = new NavesVehiculosLanzadera("","","","","","","","");

    NavesNoTripuladas navesNoTripuladas = new NavesNoTripuladas("","","","","","","","");

    NavesEspacialesTripuladas navesEspacialesTripuladas = new NavesEspacialesTripuladas("","","","","","","","");

    public void buscaNave() {

        System.out.println("Tipo de nave") ;
        System.out.println("1) Lanzadera\n2) No tripulada\n3) Tripulada") ;

       respuestaMenu = entradaEscaner.nextInt();

       try {

           switch (respuestaMenu) {
               case 1:
                   System.out.println("1) Falcon IX\n2) Zenit II\n3) Ariane V");
                   respuestaSubMenu = entradaEscaner.nextInt();

                   switch (respuestaSubMenu) {
                       case 1:

                           navesVehiculosLanzadera.mostrarFalcon();
                           break;

                       case 2:
                           navesVehiculosLanzadera.mostrarZenit();
                           break;

                       case 3:
                           navesVehiculosLanzadera.mostrarAriane();
                           break;
                       default:
                           System.out.println("Haz ingresado un dato incorrecto");
                           break;
                   }
                   break;
               case 2:
                   System.out.println("1) Helios I\n2) Venera IX\n3) Soho");
                   respuestaSubMenu = entradaEscaner.nextInt();

                   switch (respuestaSubMenu) {
                       case 1:
                           navesNoTripuladas.mostrarHelios();
                           break;

                       case 2:
                           navesNoTripuladas.mostrarVenera();
                           break;

                       case 3:
                           navesNoTripuladas.mostrarSoho();
                           break;
                       default:
                           System.out.println("Haz ingresado un dato incorrecto");
                           break;
                   }
                   break;

               case 3:

                   System.out.println("1) Apolo\n 2) Salyut\n 3) Shenzou");
                   respuestaSubMenu = entradaEscaner.nextInt();

                   switch (respuestaSubMenu) {
                       case 1:
                           navesEspacialesTripuladas.mostrarApolo();
                           break;

                       case 2:
                           navesEspacialesTripuladas.mostrarSalyut();
                           break;

                       case 3:
                           navesEspacialesTripuladas.mostrarShenzou();
                           break;
                       default:
                           System.out.println("Haz ingresado un dato incorrecto");
                           break;
                   }
               default:
                   System.out.println("Haz ingresado un dato incorrecto");
                   break;
           }

        System.out.println("Se ha finalizado la busqueda");
        System.out.println("");

       } catch (InputMismatchException ex){
           System.out.println("Opcion invalida, retorno al menu principal");
           System.out.println("");
       }

       }

}

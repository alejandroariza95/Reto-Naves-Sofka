package org.example.main;

import org.example.naves.*;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu{

    //llamada de metodos abstactos
    static void imprimirAcciones(Naves naves){

        System.out.println(naves.despegar() + "\n" + naves.ponerEnOrbita()+ "\n" + naves.aterrizar());

    }

    public static void main(String[] args) {

        //Menu principal y lanzamiento de prueba

        Scanner entradaScanner =  new Scanner(System.in);

        int respuesta = 0;

        int respuestaTest;

        Inventario inven = new Inventario() ;

        CrearNave crear = new CrearNave("","","","","","","","") ;

        NavesVehiculosLanzadera navesVehiculosLanzadera = new NavesVehiculosLanzadera("","","","","","","","");

        NavesNoTripuladas navesNoTripuladas = new NavesNoTripuladas("","","","","","","","");

        NavesEspacialesTripuladas navesEspacialesTripuladas = new NavesEspacialesTripuladas("","","","","","","","");

            try {

                while(respuesta != 4) {

                    System.out.println("Bienvenidos");
                    System.out.println("Que deseas hacer");
                    System.out.println("1) Crear nave\n2) Buscar nave\n3) Lanzamiento de prueba \n4) Salir");

                    respuesta = entradaScanner.nextInt();

                    if (respuesta == 1) {
                        crear.crearNave();
                    } else if (respuesta == 2) {
                        inven.buscaNave();
                    } else if (respuesta == 3) {
                        //Lanzamiento de prueba
                        System.out.print("Selecciona el tipo de nave que deseas utilizar");
                        System.out.print("\n1) Lanzadera\n2) No tripulada\n3) Tripulada\n");
                        respuestaTest = entradaScanner.nextInt();

                        switch (respuestaTest){

                            case 1:
                                imprimirAcciones(navesVehiculosLanzadera);
                                break;

                            case 2:
                                imprimirAcciones(navesNoTripuladas);
                                break;

                            case 3:
                                 imprimirAcciones(navesEspacialesTripuladas);
                                break;

                            default:
                                System.out.println("Haz ingresado un dato incorrecto");
                        }

                        System.out.println("");

                    }
                    //Finalización del programa
                    else if (respuesta == 4) {
                        System.out.print("El programa ha finalizado");
                        break;
                    } else System.out.println("Haz ingresado un dato incorrecto");

                }
            }
            //Catch de error
            catch (InputMismatchException ex){
                System.out.println("Opcion invalida, programa finalizado");
        }

    }
}

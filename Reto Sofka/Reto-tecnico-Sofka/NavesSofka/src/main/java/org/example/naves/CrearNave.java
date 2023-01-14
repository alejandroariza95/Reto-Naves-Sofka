package org.example.naves;

import java.util.Scanner;

public class CrearNave extends Naves {

    private Scanner entradaEscaner = new Scanner (System.in);

    public CrearNave(String nombre,String motor, String capacidad, String peso, String altura, String combustible, String pais, String potencia) {
        super(nombre, motor, capacidad, peso, altura, combustible, pais, potencia);
    }

    public void crearNave() {

        String tipoNave;

        Naves nave = new Naves(nombre,motor,capacidad,peso,altura,"NA",pais,"NA");

                System.out.println("Ingrese el nombre de la nave");
                nave.setNombre(entradaEscaner.next());

                System.out.println("Indica que tipo de nave es");
                tipoNave = entradaEscaner.next();

                System.out.println("Indica el tipo de motor");
                nave.setMotor(entradaEscaner.next());

                System.out.println("Ingrese la capacidad de carga de la nave en Kg");
                nave.setCapacidad(entradaEscaner.next());

                System.out.println("Ingrese el peso de la nave en Kg");
                nave.setPeso(entradaEscaner.next());

                System.out.println("Ingrese la altura de la nave en metros");
                nave.setAltura(entradaEscaner.next());

                System.out.println("Pais origen del cohete");
                nave.setPais(entradaEscaner.next());

                System.out.println("Haz ingresado los datos correctamente");
                System.out.println("");

                System.out.println("Datos de la nueva nave");
                System.out.println("Nombre: "+nave.getNombre());
                System.out.println("Tipo de Nave: "+tipoNave);
                System.out.println("Motor: "+nave.getMotor());
                System.out.println("Capacidad: "+nave.getCapacidad());
                System.out.println("Peso: "+nave.getPeso());
                System.out.println("Altura: "+nave.getAltura());
                System.out.println("Pais de origen: "+nave.getPais());
                System.out.println("");

    }

}

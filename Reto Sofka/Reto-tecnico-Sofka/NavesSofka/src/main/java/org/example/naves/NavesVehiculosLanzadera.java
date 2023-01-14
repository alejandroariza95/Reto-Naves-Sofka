package org.example.naves;

import org.example.naves.Naves;

public class NavesVehiculosLanzadera extends Naves {

    private Naves falcon = new Naves("Falcon IX","motor complejo", "22.800 Kg", "549.054 Kg", "70 m", "LOX/RP-1", "EE.UU.", "7.607 kN");
    private Naves zenit = new Naves("Zenit II","motor medio", "13.740 Kg", "462.200 Kg", "59.6 m", "LOX/RP-1", "Ucrania", "8.180 kN");
    private Naves ariane = new Naves("Ariane V","motor simple", "16.000 Kg", "777.000 Kg", "59 m", "LH2-LOX", "Union Europea", "6.470 kN");

    public NavesVehiculosLanzadera(String nombre, String motor, String capacidad, String peso, String altura, String combustible, String pais, String potencia) {
        super(nombre, motor, capacidad, peso, altura, combustible, pais, potencia);
    }

    //Sobreescritura de metodos
    @Override
    public String despegar() {
        return "Despegue";
    }

    @Override
    public String ponerEnOrbita() {
        return "Paquete en camino";
    }

    @Override
    public String aterrizar() {
        return "Paquete entregado";
    }

    //Metodos de clase
    public void mostrarFalcon() {

        System.out.println( "NVL " + falcon.getNombre() + "altura: " + falcon.getAltura() + " " + "capacidad: " + falcon.getCapacidad() + " " + "Combustible: " + falcon.getCombustible() + " " + "Pais: " + falcon.getPais() + " " + "Motor: " + falcon.getMotor() + " " + "Peso: " + falcon.getPeso() + " " + "Potencia: " + falcon.getPotencia() + " ");
    }

    public void mostrarZenit() {
        System.out.println( "NVL " + zenit.getNombre() + "altura: " + zenit.getAltura() + " " + "capacidad: " + zenit.getCapacidad() + " " + "Combustible: " + zenit.getCombustible() + " " + "Pais: " + zenit.getPais() + " " + "Motor: " + zenit.getMotor() + " " + "Peso: " + zenit.getPeso() + " " + "Potencia: " + zenit.getPotencia() + " ");
    }

    public void mostrarAriane() {
        System.out.println( "NVL " + ariane.getNombre() + "altura: " + ariane.getAltura() + " " + "capacidad: " + ariane.getCapacidad() + " " + "Combustible: " + ariane.getCombustible() + " " + "Pais: " + ariane.getPais() + " " + "Motor: " + ariane.getMotor() + " " + "Peso: " + ariane.getPeso() + " " + "Potencia: " + ariane.getPotencia() + " ");
    }
}

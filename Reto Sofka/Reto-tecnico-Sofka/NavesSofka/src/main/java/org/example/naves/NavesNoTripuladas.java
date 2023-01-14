package org.example.naves;

public class NavesNoTripuladas extends Naves {

    //Creación de naves
    private Naves helios = new Naves("Helios I","motor complejo", "73.400 Kg", "441.080 Kg", "70 m", "Sólido+líquido", "EE.UU.", "5.670 kN");
    private Naves venera = new Naves("Venera IX","motor medio", "13.740 Kg", "83.6 Kg", "N/A", "N/A", "Rusia", "N/A");
    private Naves soho = new Naves("Soho","motor simple", "N/A", "1.850 Kg", "N/A", "N/A", "Europea", "1.500 Vatios");

    public NavesNoTripuladas(String nombre, String motor, String capacidad, String peso, String altura, String combustible, String pais, String potencia) {
        super(nombre, motor, capacidad, peso, altura, combustible, pais, potencia);
    }

    //Sobreescritura de metodos
    @Override
    public String despegar() {
        return "Envío";
    }

    @Override
    public String ponerEnOrbita() {
        return "Despliegue de satelite";
    }

    @Override
    public String aterrizar() {
        return "Contacto tierra";
    }

    //Metodos de clase
    public void mostrarHelios() {

        System.out.println( "NNT " + "Helios I " + "altura: " + helios.getAltura() + " " + "capacidad: " + helios.getCapacidad() + " " + "Combustible: " + helios.getCombustible() + " " + "Pais: " + helios.getPais() + " " + "Motor: " + helios.getMotor() + " " + "Peso: " + helios.getPeso() + " " + "Potencia: " + helios.getPotencia() + " ");
    }

    public void mostrarVenera() {
        System.out.println( "NNT " + "Venera IX " + "altura: " + venera.getAltura() + " " + "capacidad: " + venera.getCapacidad() + " " + "Combustible: " + venera.getCombustible() + " " + "Pais: " + venera.getPais() + " " + "Motor: " + venera.getMotor() + " " + "Peso: " + venera.getPeso() + " " + "Potencia: " + venera.getPotencia() + " ");
    }

    public void mostrarSoho() {
        System.out.println( "NNT " + "Soho " + "altura: " + soho.getAltura() + " " + "capacidad: " + soho.getCapacidad() + " " + "Combustible: " + soho.getCombustible() + " " + "Pais: " + soho.getPais() + " " + "Motor: " + soho.getMotor() + " " + "Peso: " + soho.getPeso() + " " + "Potencia: " + soho.getPotencia() + " ");
    }

}

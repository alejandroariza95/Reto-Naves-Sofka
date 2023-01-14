package org.example.naves;

public class NavesEspacialesTripuladas extends Naves {
    private Naves apolo = new Naves("Apolo", "motor complejo", "1.524 m³", "4.170", "8.5 m", "N/A", "EE.UU.", "689 kN");
    private Naves salyut = new Naves("Salyut", "motor medio", "90 m³", "19.824 kg", "16 m", "N/A", "Rusia", "4,5 kW");
    private Naves shenzou = new Naves("Shenzou", "motor simple", "N/A", "7840 kg", "9.25 m", "N/A", "China", "1,5 kW");

    public NavesEspacialesTripuladas(String nombre, String motor, String capacidad, String peso, String altura, String combustible, String pais, String potencia) {
        super(nombre, motor, capacidad, peso, altura, combustible, pais, potencia);
    }

    //Metodos de clase
    public void mostrarApolo() {

        System.out.println( "NET " + apolo.getNombre() + "altura: " + apolo.getAltura() + " " + "capacidad: " + apolo.getCapacidad() + " " + "Combustible: " + apolo.getCombustible() + " " + "Pais: " + apolo.getPais() + " " + "Motor: " + apolo.getMotor() + " " + "Peso: " + apolo.getPeso() + " " + "Potencia: " + apolo.getPotencia() + " ");
    }

    public void mostrarSalyut() {
        System.out.println( "NET " + salyut.getNombre() + salyut.getAltura() + " " + "capacidad: " + salyut.getCapacidad() + " " + "Combustible: " + salyut.getCombustible() + " " + "Pais: " + salyut.getPais() + " " + "Motor: " + salyut.getMotor() + " " + "Peso: " + salyut.getPeso() + " " + "Potencia: " + salyut.getPotencia() + " ");
    }

    public void mostrarShenzou() {
        System.out.println( "NET " + shenzou.getNombre() + "altura: " + shenzou.getAltura() + " " + "capacidad: " + shenzou.getCapacidad() + " " + "Combustible: " + shenzou.getCombustible() + " " + "Pais: " + shenzou.getPais() + " " + "Motor: " + shenzou.getMotor() + " " + "Peso: " + shenzou.getPeso() + " " + "Potencia: " + shenzou.getPotencia() + " ");
    }

    //Sobreescritura de metodos
    @Override
    public String despegar() {
        return "Ignición";
    }

    @Override
    public String ponerEnOrbita() {
        return "Orbitación";
    }

    @Override
    public String aterrizar() {
        return "Devuelta a casa";
    }

}

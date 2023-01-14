package org.example.naves;

public class Naves {

    //Super clase

    protected String nombre ;

    protected String motor ;

    protected String capacidad ;

    protected String peso ;

    protected String altura ;

    protected String combustible ;

    protected String pais ;

    protected String potencia ;

    //Constructor
    public Naves (String nombre, String motor, String capacidad, String peso, String altura, String combustible, String pais, String potencia){

        this.nombre = nombre ;
        this.altura = altura ;
        this.motor = motor ;
        this.capacidad = capacidad ;
        this.combustible = combustible ;
        this.peso = peso ;
        this.pais = pais ;
        this.potencia = potencia ;
    }

    //Metodos abstractos
    public String despegar() {
        return "";
    }
    public String ponerEnOrbita() {
        return "";
    }
    public String aterrizar() {
        return "";
    }

    //Getters and setters

    public String getNombre() {return nombre;}
    public String getMotor() {
        return motor;
    }

    public String getCapacidad() {
        return capacidad;
    }

    public String getPeso() {
        return peso;
    }

    public String getAltura() {
        return altura;
    }

    public String getCombustible() {
        return combustible;
    }

    public String getPais() {
        return pais;
    }

    public String getPotencia() {
        return potencia;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }


}

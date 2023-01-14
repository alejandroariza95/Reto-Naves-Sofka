import junit.framework.TestCase;
import org.example.naves.NavesEspacialesTripuladas;
import org.example.naves.NavesNoTripuladas;
import org.example.naves.NavesVehiculosLanzadera;

public class Test extends TestCase {

    private NavesEspacialesTripuladas navesEspacialesTripuladas;
    private NavesNoTripuladas navesNoTripuladas;
    private NavesVehiculosLanzadera navesVehiculosLanzadera;

    public void escenario1() {
        navesEspacialesTripuladas = new NavesEspacialesTripuladas("","","","","","","","");
    }

    public void escenario2() {
        navesNoTripuladas = new NavesNoTripuladas("","","","","","","","");
    }

    public void escenario3() {
        navesVehiculosLanzadera = new NavesVehiculosLanzadera("","","","","","","","");
    }

    public void testNavesEspacialesTripuladas(){
        escenario1();
        assertEquals(navesEspacialesTripuladas.despegar(),"Ignición");
        assertEquals(navesEspacialesTripuladas.ponerEnOrbita(),"Orbitación");
        assertEquals(navesEspacialesTripuladas.aterrizar(),"Devuelta a casa");
    }

    public void testNavesNoTripuladas(){
        escenario2();
        assertEquals(navesNoTripuladas.despegar(),"Envío");
        assertEquals(navesNoTripuladas.ponerEnOrbita(),"Despliegue de satelite");
        assertEquals(navesNoTripuladas.aterrizar(),"Contacto tierra");
    }

    public void testNavesVehiculosLanzadera(){
        escenario3();
        assertEquals(navesVehiculosLanzadera.despegar(),"Despegue");
        assertEquals(navesVehiculosLanzadera.ponerEnOrbita(),"Paquete en camino");
        assertEquals(navesVehiculosLanzadera.aterrizar(),"Paquete entregado");
    }

}

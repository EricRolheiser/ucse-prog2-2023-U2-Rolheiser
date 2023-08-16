import org.example.AvionComercial;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AvionComercialTest {

    @Test
    public void testVolar(){
        AvionComercial avionComercial = new AvionComercial(1000, 100);
        int distancia = 500;
        int combustibleNecesario = avionComercial.volar(distancia);
        int combustibleEsperado = 50000;
        assertEquals(combustibleEsperado, combustibleNecesario);
    }

    @Test
    public void testConsumoCombustible(){
        AvionComercial avionComercial = new AvionComercial(1000, 100);
        int consumoCombustible = avionComercial.getConsumoCombustible();
        int consumoEsperado = 100;
        assertEquals(consumoEsperado, consumoCombustible);
    }

    @Test
    public void testCapacidadCombustible(){
        AvionComercial avionComercial = new AvionComercial(1000, 100);
        int capacidadCombustible = avionComercial.getCapacidadCombustible();
        int capacidadEsperada = 1000;
        assertEquals(capacidadEsperada, capacidadCombustible);
    }
}

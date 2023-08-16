import org.example.AvionPrivado;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AvionPrivadoTest {
    @Test
    public void testVolar(){
        AvionPrivado avionPrivado = new AvionPrivado(1000, 100);
        int distancia = 500;
        int combustibleNecesario = avionPrivado.volar(distancia);
        int combustibleEsperado = 50500;
        assertEquals(combustibleEsperado, combustibleNecesario);
    }

    @Test
    public void testConsumoCombustible(){
        AvionPrivado avionPrivado = new AvionPrivado(1000, 100);
        int consumoCombustible = avionPrivado.getConsumoCombustible();
        int consumoEsperado = 100;
        assertEquals(consumoEsperado, consumoCombustible);
    }

    @Test
    public void testCapacidadCombustible(){
        AvionPrivado avionPrivado = new AvionPrivado(1000, 100);
        int capacidadCombustible = avionPrivado.getCapacidadCombustible();
        int capacidadEsperada = 1000;
        assertEquals(capacidadEsperada, capacidadCombustible);
    }

}

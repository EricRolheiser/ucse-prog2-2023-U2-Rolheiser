import org.example.Avion;
import org.example.AvionComercial;
import org.example.AvionPrivado;
import org.example.CalculadorCombustible;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadorCombustibleTest {
    @Test
    public void testCalcularCombustibleAvionPrivado() {
        Avion avion = new AvionPrivado(1000, 100);
        CalculadorCombustible calculadorCombustible = CalculadorCombustible.getInstance();
        int resultado = calculadorCombustible.calcularCombustible(avion, 500);
        assertEquals(50500, resultado);
    }

    @Test
    public void testCalcularCombustibleAvionComercial() {
        Avion avion = new AvionComercial(1000, 100);
        CalculadorCombustible calculadorCombustible = CalculadorCombustible.getInstance();
        int resultado = calculadorCombustible.calcularCombustible(avion, 500);
        assertEquals(50000, resultado);
    }


}

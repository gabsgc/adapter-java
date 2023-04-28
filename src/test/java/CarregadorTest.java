import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarregadorTest {
    @Test
    void deveRetornarTomadaTresPinos() {
        Carregador carregador = new Carregador();
        carregador.setTomada("Três Pinos");

        assertEquals("Três Pinos", carregador.getTomada());
    }

    @Test
    void deveRetornarTomadaDoisPinos() {
        Carregador carregador = new Carregador();
        carregador.setTomada("Três Pinos");

        assertEquals("Dois Pinos", carregador.getDoisPinos());
    }
}
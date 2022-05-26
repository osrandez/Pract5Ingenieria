import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SueldoTest {
    Sueldo sueldo = new Sueldo();

    @Test
    void testSueldoC1() {
        double result = sueldo.calculaBruto('E', 7000);
        Assertions.assertEquals(1350, result);
    }

    @Test
    void testSueldoC2() {
        double result = sueldo.calculaBruto('E', 4000);
        Assertions.assertEquals(650, result);
    }

    @Test
    void testSueldoC3() {
        double result = sueldo.calculaBruto('E', 2000);
        Assertions.assertEquals(300, result);
    }

    @Test
    void testSueldoC4() {
        double result = sueldo.calculaBruto('F', 2000);
        Assertions.assertEquals(1000, result);
    }

    @Test
    void testSueldoC5() {
        double result = sueldo.calculaBruto('F', 7000);
        Assertions.assertEquals(1350, result);
    }

    @Test
    void testRetC1() {
        double result = sueldo.calculaRet('F', 7000);
        Assertions.assertEquals(1050, result);
    }

    @Test
    void testRetC2() {
        double result = sueldo.calculaRet('F', 1100);
        Assertions.assertEquals(110, result);
    }

    @Test
    void testRetC3() {
        double result = sueldo.calculaRet('F', 200);
        Assertions.assertEquals(10, result);
    }

    @Test
    void testRetC4() {
        double result = sueldo.calculaRet('E', 140000);
        Assertions.assertEquals(7000, result);
    }

}
import static org.junit.jupiter.api.Assertions.*;

public class BonusServiceTest {

    @org.junit.jupiter.api.Test
    void calculateRegisteredAndUnderLimit() {

        // объект
        BonusService service = new BonusService();

        // данные
        long amount = 1000;
        boolean registered = true;
        long expected = 30;

        // вызов метода
        long actual = service.calculate(amount, registered);

        // сравниваем
        assertEquals(expected, actual);

    }

    @org.junit.jupiter.api.Test
    void calculateForRegisteredAndOverLimit() {
        BonusService service = new BonusService();

        // подготавливаем данные:
        long amount = 1_000_000;
        boolean registered = true;
        long expected = 500;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void calculateUnRegisteredAndUnderLimit() {

        // объект
        BonusService service = new BonusService();

        // данные
        long amount = 1000;
        boolean registered = false;
        long expected = 10;

        // вызов метода
        long actual = service.calculate(amount, registered);

        // сравниваем
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void calculateUnRegisteredAndOverLimit() {

        // объект
        BonusService service = new BonusService();

        // данные
        long amount = 1_000_000_000;
        boolean registered = false;
        long expected = 500;

        // вызов метода
        long actual = service.calculate(amount, registered);

        // сравниваем
        assertEquals(expected, actual);
    }
}


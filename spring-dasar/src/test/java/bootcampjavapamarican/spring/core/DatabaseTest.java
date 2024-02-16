package bootcampjavapamarican.spring.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DatabaseTest {
    @Test
    void testSingleton() {

        var dataBase = Database.getInstance();
        var dataBase1 = Database.getInstance();

        Assertions.assertSame(dataBase,dataBase1);
    }
}

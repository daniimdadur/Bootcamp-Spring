package bootcampjavapamarican.spring.core;

import bootcampjavapamarican.spring.core.data.Foo;
import bootcampjavapamarican.spring.core.data.FooBar;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DependsOnTest {

    private ApplicationContext applicationContext;

    @BeforeEach
    void setUp() {
        applicationContext = new AnnotationConfigApplicationContext(DependsOnConfiguration.class);
        
    }

    @Test
    void testDependsOn() {
        Foo foo = applicationContext.getBean(Foo.class); //dibaca ketika beannya diakses.
    }
}

package bootcampjavapamarican.spring.core;

import bootcampjavapamarican.spring.core.listener.LoginAgainSuccessListener;
import bootcampjavapamarican.spring.core.listener.LoginSuccessListener;
import bootcampjavapamarican.spring.core.listener.UserListener;
import bootcampjavapamarican.spring.core.service.UserService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

public class EventListenerTest {

    @Configuration
    @Import({
            UserService.class,
            LoginSuccessListener.class,
            LoginAgainSuccessListener.class,
            UserListener.class
    })
    public static class TestConfiguration{

    }
    
    private ConfigurableApplicationContext applicationContext;

    @BeforeEach
    void setUp() {
        applicationContext = new AnnotationConfigApplicationContext(TestConfiguration.class);
        applicationContext.registerShutdownHook();
    }

    @Test
    void testListener() {
        UserService userService = applicationContext.getBean(UserService.class);
        userService.login("dani","dani");
        userService.login("dani","salah");
        userService.login("dani","benar");
        userService.login("dani","password");
    }
}

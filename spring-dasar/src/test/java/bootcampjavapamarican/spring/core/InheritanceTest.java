package bootcampjavapamarican.spring.core;

import bootcampjavapamarican.spring.core.service.MerchantService;
import bootcampjavapamarican.spring.core.service.MerchantServiceImp;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class InheritanceTest {

    private ConfigurableApplicationContext applicationContext;

    @BeforeEach
    void setUp() {
        applicationContext = new AnnotationConfigApplicationContext(InheritanceConfiguration.class);
        applicationContext.registerShutdownHook();
    }

    @Test
    void testInheritance() {

        MerchantServiceImp merchantServiceImp = applicationContext.getBean(MerchantServiceImp.class);
        MerchantService merchantService = applicationContext.getBean(MerchantService.class);

        Assertions.assertSame(merchantService,merchantServiceImp);
    }
}

package bootcampjavapamarican.spring.core;

import bootcampjavapamarican.spring.core.client.PaymentGatewayClient;
import bootcampjavapamarican.spring.core.factory.PaymentGatewayFactoryBean;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class FactoryTest {

    private ConfigurableApplicationContext applicationContext;

    @BeforeEach
    void setUp() {
        applicationContext = new AnnotationConfigApplicationContext(FactoryConfiguration.class);
        applicationContext.registerShutdownHook();
    }

    @Test
    void factoryTest() {

        PaymentGatewayClient paymentGatewayFactoryBean = applicationContext.getBean(PaymentGatewayClient.class);

        Assertions.assertNotNull(paymentGatewayFactoryBean);

        Assertions.assertEquals("https://example.com",paymentGatewayFactoryBean.getEndpoint());
        Assertions.assertEquals("public",paymentGatewayFactoryBean.getPublicKey());
        Assertions.assertEquals("private",paymentGatewayFactoryBean.getPrivateKey());
    }
}

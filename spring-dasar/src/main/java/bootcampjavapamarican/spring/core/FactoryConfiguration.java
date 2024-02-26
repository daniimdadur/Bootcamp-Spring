package bootcampjavapamarican.spring.core;

import bootcampjavapamarican.spring.core.factory.PaymentGatewayFactoryBean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({
        PaymentGatewayFactoryBean.class
})
public class FactoryConfiguration {
}

package bootcampjavapamarican.spring.core.configuration;

import bootcampjavapamarican.spring.core.repository.CustomerRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class CustomerConfiguration {

    @Bean
    public CustomerRepository normalCustomerRepository(){
        return new CustomerRepository();
    }

    @Bean
    public CustomerRepository premiumCustomerRepository(){
        return new CustomerRepository();
    }
}

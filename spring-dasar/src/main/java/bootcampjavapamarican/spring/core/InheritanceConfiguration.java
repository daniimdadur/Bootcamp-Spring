package bootcampjavapamarican.spring.core;

import bootcampjavapamarican.spring.core.service.MerchantServiceImp;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(MerchantServiceImp.class)
public class InheritanceConfiguration {

}

package bootcampjavapamarican.spring.core;

import bootcampjavapamarican.spring.core.data.Bar;
import bootcampjavapamarican.spring.core.data.Foo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.config.CustomScopeConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Slf4j
@Configuration
public class ScopeConfiguration {

    @Bean
    @Scope("prototype")//Scope dgn type prototype ketika membuat objek baru maka dia akan membuat objek baru yg berbeda dan sifatnya bukan singleton.
                       //jika scope nya menggunakan singleton maka ketika membuat objek baru dia tidak akan membuat objek yg berbeda, dan hanya akan dibuat satu kali saja.
    public Foo foo(){
        log.info("Create new Foo");
        return new Foo();
    }

    @Bean
    public CustomScopeConfigurer customScopeConfigurer(){
        CustomScopeConfigurer configurer = new CustomScopeConfigurer();
        configurer.addScope("doubleton", new DoubletonScope());
        return configurer;
    }

    @Bean
    @Scope("doubleton")
    public Bar bar(){
        log.info("Create new Bar");
        return new Bar();
    }
}

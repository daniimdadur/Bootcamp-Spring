package bootcampjavapamarican.spring.core;

import bootcampjavapamarican.spring.core.data.Foo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class PrimaryConfiguration {

    // primary bean @ jika kita mengakses bean tanpa menyebut nama beannya, maka otomatis primary nya yg akan dipilih.
    @Primary
    @Bean
    public Foo foo1(){
        return new Foo();
    }

    @Bean
    public Foo foo2(){
        return new Foo();
    }
}

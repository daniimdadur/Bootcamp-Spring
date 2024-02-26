package bootcampjavapamarican.spring.core.configuration;


import bootcampjavapamarican.spring.core.data.Foo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class FooConfiguration {

    @Bean
    @Primary
    public Foo foo(){
        return new Foo();
    }

    @Bean
    public Foo foo1(){
        return new Foo();
    }

    @Bean
    public Foo foo2(){
        return new Foo();
    }
}

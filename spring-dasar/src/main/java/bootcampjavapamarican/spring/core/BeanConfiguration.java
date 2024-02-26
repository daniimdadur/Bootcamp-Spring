package bootcampjavapamarican.spring.core;

import bootcampjavapamarican.spring.core.data.Foo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Slf4j
@Configuration
public class BeanConfiguration { // bean @ sebuah objek yg kita masukan kedalam spring container IoC.

    @Bean
    public Foo foo(){
        Foo foo = new Foo();
        log.info("Create new foo");
        return foo;
    }
}

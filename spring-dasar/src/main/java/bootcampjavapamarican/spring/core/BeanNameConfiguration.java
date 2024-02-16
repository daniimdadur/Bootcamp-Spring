package bootcampjavapamarican.spring.core;

import bootcampjavapamarican.spring.core.data.Foo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class BeanNameConfiguration {

    // primary bean @ jika kita mengakses bean tanpa menyebut nama beannya, maka otomatis primary nya yg akan dipilih.
    @Primary
    @Bean("fooFirst") // mengubah nama bean, jadi tidak menggunakan nama methodnya, dikarenakan nama bean harus unique alias tidak boleh sama.
    public Foo foo1(){
        return new Foo();
    }

    @Bean("fooSecond")
    public Foo foo2(){
        return new Foo();
    }
}

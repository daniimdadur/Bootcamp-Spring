package bootcampjavapamarican.spring.core;

import bootcampjavapamarican.spring.core.data.Bar;
import bootcampjavapamarican.spring.core.data.Foo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Lazy;

@Slf4j
@Configuration
public class DependsOnConfiguration {
    //default bean dibaca dari atas kebawah, kecuali menggunakan annotation @DependsOn, maka akan dibuat terlebih dahulu yg ada di DependsOn tersebut.

    @Lazy //secara default bean akan dibuat ketika applikasi berjalan walaupun tidak diakses, sehingga menyebabkan applikasi akan lambat ketika memulai.
    //untuk menghindari itu kita bisa menggunakan annotation @Lazy, fungsinya bean tidak akan dibuat sampai bean itu diakses.
    @Bean
    @DependsOn({ //bean ini akan dibuat setelah bean yg ada di annotation DependsOn dibuat.
            "bar"
    })
    public Foo foo(){
       log.info("Create new foo");
       return new Foo();
    }

    @Bean
    public Bar bar(){
        log.info("Create new bar");
        return new Bar();
    }
}

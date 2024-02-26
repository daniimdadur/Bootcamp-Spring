package bootcampjavapamarican.spring.core.application;

import bootcampjavapamarican.spring.core.data.Bar;
import bootcampjavapamarican.spring.core.data.Foo;
import bootcampjavapamarican.spring.core.listener.AppStartingListener;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class FooApplication {

    @Bean
    public Foo foo(){
        return new Foo();
    }

//    public static void main(String[] args) {
//        ConfigurableApplicationContext applicationContext = SpringApplication.run(FooApplication.class, args);
//        Foo foo = applicationContext.getBean(Foo.class);
//        System.out.println(foo);
//    }

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(FooApplication.class);
        application.setBannerMode(Banner.Mode.OFF);
        //kita bisa melakukan pengaturan di spring application sebelum application contextnya dibuat.
        //kita bisa menggunakan langsung SpringApplication, atau bisa juga menggunakan SpringApplicationBuilder

        application.setListeners(List.of(new AppStartingListener())); //springApplicationEvent

        ConfigurableApplicationContext applicationContext = application.run(args);

        Foo foo = applicationContext.getBean(Foo.class);
        System.out.println(foo);
    }
}

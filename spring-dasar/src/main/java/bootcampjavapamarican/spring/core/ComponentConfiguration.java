package bootcampjavapamarican.spring.core;

import bootcampjavapamarican.spring.core.data.MultiFoo;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(basePackages = {
        "bootcampjavapamarican.spring.core.service",
        "bootcampjavapamarican.spring.core.repository",
        "bootcampjavapamarican.spring.core.configuration",
})
@Import(MultiFoo.class)
public class ComponentConfiguration {
}

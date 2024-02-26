package bootcampjavapamarican.spring.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {
        "bootcampjavapamarican.spring.core.configuration"
})
public class ScanConfiguration {
}

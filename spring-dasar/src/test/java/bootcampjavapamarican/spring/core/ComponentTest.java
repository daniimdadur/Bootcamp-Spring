package bootcampjavapamarican.spring.core;

import bootcampjavapamarican.spring.core.data.MultiFoo;
import bootcampjavapamarican.spring.core.repository.CategoryRepository;
import bootcampjavapamarican.spring.core.repository.CustomerRepository;
import bootcampjavapamarican.spring.core.repository.ProductRepository;
import bootcampjavapamarican.spring.core.service.CategoryService;
import bootcampjavapamarican.spring.core.service.CustomerService;
import bootcampjavapamarican.spring.core.service.ProductService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ComponentTest {

    private ConfigurableApplicationContext applicationContext;

    @BeforeEach
    void setUp() {
        applicationContext = new AnnotationConfigApplicationContext(ComponentConfiguration.class);
        applicationContext.registerShutdownHook();
    }

    @Test
    void serviceTest() {

        ProductService bean = applicationContext.getBean(ProductService.class);
        ProductService bean1 = applicationContext.getBean("productService",ProductService.class); //menggunakan component scan
        //maka otomatis nama bean nya menjadi huruf kecil diawalnya.

        Assertions.assertSame(bean,bean1);
    }

    //consctructor-based dependency injection
    @Test
    void testConstructorDependencyInjection() {

        ProductService productService = applicationContext.getBean(ProductService.class);
        ProductRepository productRepository = applicationContext.getBean(ProductRepository.class);

        Assertions.assertSame(productRepository,productService.getProductRepository());
    }

    //setter-based dependency injection
    @Test
    void testSetterDependencyInjection() {

        CategoryService categoryService = applicationContext.getBean(CategoryService.class);
        CategoryRepository categoryRepository = applicationContext.getBean(CategoryRepository.class);

        Assertions.assertSame(categoryRepository, categoryService.getCategoryRepository());
    }

    //field-bassed dependency injection
    @Test
    void testFieldDependencyInjection() {

        CustomerService customerService = applicationContext.getBean(CustomerService.class);

        CustomerRepository normalCustomerRepository = applicationContext.getBean("normalCustomerRepository",CustomerRepository.class);
        CustomerRepository premiumCustomerRepository = applicationContext.getBean("premiumCustomerRepository",CustomerRepository.class);

        Assertions.assertSame(normalCustomerRepository, customerService.getNormalCustomerRepository());
        Assertions.assertSame(premiumCustomerRepository, customerService.getPremiumCustomerRepository());
    }

    //object provider
    @Test
    void testObjectProvider() {

        MultiFoo multiFoo = applicationContext.getBean(MultiFoo.class);
        Assertions.assertEquals(3, multiFoo.getFoos().size());
    }
}

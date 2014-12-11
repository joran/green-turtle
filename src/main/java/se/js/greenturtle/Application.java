package se.js.greenturtle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.data.rest.webmvc.config.RepositoryRestMvcConfiguration;

import se.js.greenturtle.util.AccountUtil;

@Configuration
@Import(RepositoryRestMvcConfiguration.class)
@EnableAutoConfiguration
@EnableConfigurationProperties
@ComponentScan
public class Application {
	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(Application.class, args);
		
		AccountRepository accounts = ctx.getBean(AccountRepository.class);
		FooSettings fs = ctx.getBean(FooSettings.class);
		
		for (int i = 0; i < 20; i++) {
			accounts.save(AccountUtil.generateAccount());
		}
		
		System.out.println("----------------------------------------");
		System.out.println("by findAll:");
		for (Account acc : accounts.findAll()) {
			System.out.println(acc);
		}
		
		System.out.println("Yada: " + fs.getYada());
		System.out.println("Bar: " + fs.getBar());
		System.out.println("Baz: " + fs.getBaz());

//		CustomerRepository customers = ctx.getBean(CustomerRepository.class);
//		
//		customers.save(new Customer("Anders", "Andersson"));
//		customers.save(new Customer("Beatice", "Bengtsson"));
//		customers.save(new Customer("Cecilia", "Carlsson"));
//		customers.save(new Customer("David", "Draké"));
//		customers.save(new Customer("Egon", "Ericsson"));
//		customers.save(new Customer("Fabian", "Fransson"));
//		
//		Iterable<Customer> allCustommers = customers.findAll();
//		System.out.println("----------------------------------------");
//		System.out.println("by findAll:");
//		for (Customer customer : allCustommers) {
//			System.out.println(customer);
//		}
		
	}
}

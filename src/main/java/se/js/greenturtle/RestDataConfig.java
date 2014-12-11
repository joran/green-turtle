package se.js.greenturtle;

import java.net.URI;
import java.net.URISyntaxException;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestMvcConfiguration;

/**
 * This is a fix for providing a prefix to all repository rest service endpoints
 * Setting "spring.data.rest.base-uri" in application.properties have no effect.
 * @author joran
 *
 */
@Configuration
@Import(RepositoryRestMvcConfiguration.class)
public class RestDataConfig extends RepositoryRestMvcConfiguration {

    @Override
    protected void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
        super.configureRepositoryRestConfiguration(config);
        try {
            config.setBaseUri(new URI("/api"));
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }

}
package org.toniesteves.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestMvcConfiguration;
import org.toniesteves.model.Purchase;

@Configuration
public class RepositoryConfig extends RepositoryRestMvcConfiguration {
	
    protected void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
        config.exposeIdsFor(Purchase.class);
        config.setSortParamName("q");
    }
}
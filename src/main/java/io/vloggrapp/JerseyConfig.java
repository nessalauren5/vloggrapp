package io.vloggrapp;

import io.vloggrapp.resources.IdeaController;
import org.glassfish.jersey.server.ResourceConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import javax.ws.rs.ApplicationPath;

@Configuration
@ApplicationPath("/api")
public class JerseyConfig extends ResourceConfig {

    Logger logger = LoggerFactory.getLogger(JerseyConfig.class);

    public JerseyConfig() {
        // scan the resources package for our resources
        logger.debug("Registering resources: " + getClass().getPackage().getName() + ".resources");
        packages(getClass().getPackage().getName() + ".resources");
    }
}

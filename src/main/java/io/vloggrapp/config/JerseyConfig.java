package io.vloggrapp.config;

import io.vloggrapp.controller.IdeaController;
import io.vloggrapp.controller.LoginController;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
public class JerseyConfig extends ResourceConfig {

    public JerseyConfig() {
        // scan the resources package for our resources
        register(IdeaController.class);
    }
}

package org.sganslandt.watcher.notifier.sout;

import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import org.sganslandt.watcher.notifier.sout.resources.EventHandlerResource;

public class Application extends io.dropwizard.Application<Configuration> {
    public static void main(String[] args) throws Exception {
        new Application().run(args);
    }

    @Override
    public String getName() {
        return "healthcheck-watcher-sout-notifier";
    }

    @Override
    public void initialize(Bootstrap<Configuration> bootstrap) {

    }

    @Override
    public void run(Configuration configuration, Environment environment) {
        // The Jersey Resource
        final EventHandlerResource healthResource = new EventHandlerResource();

        // Exprose the Jersey Resource
        environment.jersey().register(healthResource);
    }

}
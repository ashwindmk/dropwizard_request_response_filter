package com.ashwin.java;

import com.ashwin.java.api.controller.StudentResource;
import com.ashwin.java.api.di.RequestResponseFilterModule;
import com.ashwin.java.api.filter.StudentFilter;
import io.dropwizard.Application;
import io.dropwizard.setup.Environment;

public class RequestResponseFilterApplication extends Application<RequestResponseFilterConfiguration> {
    public static void main(String[] args) throws Exception {
        new RequestResponseFilterApplication().run(args);
    }

    @Override
    public void run(RequestResponseFilterConfiguration config, Environment env) throws Exception {
        env.jersey().getResourceConfig().register(new RequestResponseFilterModule());
        env.jersey().register(StudentFilter.class);
        env.jersey().register(StudentResource.class);
    }
}

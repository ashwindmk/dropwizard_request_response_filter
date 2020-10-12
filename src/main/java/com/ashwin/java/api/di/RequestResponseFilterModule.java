package com.ashwin.java.api.di;

import com.ashwin.java.api.controller.StudentResource;
import com.ashwin.java.domain.service.StudentService;
import org.glassfish.jersey.internal.inject.AbstractBinder;

import javax.inject.Singleton;

public class RequestResponseFilterModule extends AbstractBinder {
    @Override
    protected void configure() {
        bind(StudentService.class).to(StudentService.class).in(Singleton.class);
        bind(StudentResource.class).to(StudentResource.class).in(Singleton.class);
    }
}

package com.ashwin.java.api.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.ext.Provider;
import java.io.IOException;

@Provider
public class StudentRequestFilter implements ContainerRequestFilter {
    private static final Logger logger = LoggerFactory.getLogger(StudentRequestFilter.class);

    @Override
    public void filter(ContainerRequestContext requestContext) throws IOException {
        logger.info("filter( requestContext.method: " + requestContext.getMethod() + ", requestContext.headers: " + requestContext.getHeaders() + " )");
    }
}

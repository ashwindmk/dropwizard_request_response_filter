package com.ashwin.java.api.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.container.ContainerResponseFilter;
import javax.ws.rs.ext.Provider;
import java.io.IOException;

@Provider
public class StudentResponseFilter implements ContainerResponseFilter {
    private static final Logger logger = LoggerFactory.getLogger(StudentResponseFilter.class);

    @Override
    public void filter(ContainerRequestContext requestContext, ContainerResponseContext responseContext) throws IOException {
        logger.info("filter( responseContext.entity: " + responseContext.getEntity() + " )");
    }
}

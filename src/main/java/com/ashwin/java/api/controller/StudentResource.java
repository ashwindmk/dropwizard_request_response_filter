package com.ashwin.java.api.controller;

import com.ashwin.java.domain.service.StudentService;
import com.codahale.metrics.annotation.Timed;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/student")
public class StudentResource {
    private static final Logger logger = LoggerFactory.getLogger(StudentResource.class);
    private StudentService studentService;

    @Inject
    public StudentResource(StudentService studentService) {
        this.studentService = studentService;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    @Timed
    public Response getById(@PathParam("id") Long id) {
        logger.info("getById( id: " + id + " )");
        return Response.ok(this.studentService.getById(id)).build();
    }
}

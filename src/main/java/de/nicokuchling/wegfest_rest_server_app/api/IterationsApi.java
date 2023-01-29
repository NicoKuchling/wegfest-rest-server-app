package de.nicokuchling.wegfest_rest_server_app.api;

import de.nicokuchling.wegfest_rest_server_app.model.*;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import de.nicokuchling.wegfest_rest_server_app.model.Iteration;

import java.util.List;
import java.util.Map;

import java.io.InputStream;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/iterations")


@io.swagger.annotations.Api(description = "the iterations API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2023-01-29T17:42:09.387959900+01:00[Europe/Berlin]")
public interface IterationsApi  {

    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "Erstellt eine neue Iteration", notes = "Persistiert die Iteration mit den übergebenen Attributen in der Datenbank", response = Void.class, tags={ "Iterations", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 201, message = "Iteration Created Successfully", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request", response = String.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authorization Information is Missing or Invalid", response = Void.class) })
    public Response createIteration(@ApiParam(value = "" ,required=true) @NotNull @Valid Iteration iteration,@Context SecurityContext securityContext);
    @DELETE
    @Path("/{id}")
    
    
    @io.swagger.annotations.ApiOperation(value = "Löscht die Iteration mit der angegebenen ID", notes = "Löscht die Iteration mit der angegebenen ID aus der Datenbank", response = Void.class, tags={ "Iterations", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 204, message = "Iteration Deleted Successfully", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authorization Information is Missing or Invalid", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "No Iteration With Corresponding ID Found", response = Void.class) })
    public Response deleteIteration( @PathParam("id") String id,@Context SecurityContext securityContext);
    @GET
    
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Liefert alle Iterationen zurück", notes = "Liefert all in der Datenbank vorhandenen Iterationen zurück", response = Iteration.class, responseContainer = "List", tags={ "Iterations", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = Iteration.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authorization Information is Missing or Invalid", response = Void.class) })
    public Response getAllIterations(@Context SecurityContext securityContext);
    @GET
    @Path("/{id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Liefert die Iteration mit der angegebenen ID zurück", notes = "Liefert die Iteration mit der angegebenen ID zurück", response = Iteration.class, tags={ "Iterations", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = Iteration.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authorization Information is Missing or Invalid", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "No Iteration With Corresponding ID Found.", response = Void.class) })
    public Response getIteration( @PathParam("id") String id,@Context SecurityContext securityContext);
    @GET
    @Path("/getNext")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Liefert die nächste Iteration zurück", notes = "Liefert die nächste Iteration aus der Liste der offenen Iterationen zurück und löscht diese aus der Liste", response = Iteration.class, tags={ "Iterations", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = Iteration.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authorization Information is Missing or Invalid", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "No More Iterations Found", response = Void.class) })
    public Response getNextIteration(@Context SecurityContext securityContext);
    @GET
    @Path("/showNext")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Liefert die nächste Iteration zurück", notes = "Liefert die nächste Iteration aus der Liste der offenen Iterationen zurück, ohne diese aus der Liste zu löschen", response = Iteration.class, tags={ "Iterations", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = Iteration.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authorization Information is Missing or Invalid", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "No More Iterations Found", response = Void.class) })
    public Response showNextIteration(@Context SecurityContext securityContext);
    @PUT
    @Path("/{id}")
    @Consumes({ "application/json" })
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "Aktualisiert die Iteration mit der angegebenen ID", notes = "Aktualisiert die Iteration mit den entsprechenden Werten aus dem Request Body", response = Void.class, tags={ "Iterations", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 201, message = "Iteration Created Successfully", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 204, message = "Iteration Updated Successfully", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request", response = String.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authorization Information is Missing or Invalid", response = Void.class) })
    public Response updateIteration( @PathParam("id") String id,@ApiParam(value = "" ,required=true) @NotNull @Valid Iteration iteration,@Context SecurityContext securityContext);
}

package de.nicokuchling.wegfest_rest_server_app.api;

import de.nicokuchling.wegfest_rest_server_app.model.*;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import de.nicokuchling.wegfest_rest_server_app.model.Person;

import java.util.List;
import java.util.Map;

import java.io.InputStream;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/persons")


@io.swagger.annotations.Api(description = "the persons API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2023-01-29T17:42:09.387959900+01:00[Europe/Berlin]")
public interface PersonsApi  {

    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "Erstellt eine neue Person", notes = "Persistiert die Person mit den übergebenen Attributen in der Datenbank", response = Void.class, tags={ "Persons", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 201, message = "Person Created Successfully", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request", response = String.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authorization Information is Missing or Invalid", response = Void.class) })
    public Response createPerson(@ApiParam(value = "" ,required=true) @NotNull @Valid Person person,@Context SecurityContext securityContext);
    @DELETE
    @Path("/{id}")
    
    
    @io.swagger.annotations.ApiOperation(value = "Löscht die Person mit der angegebenen ID", notes = "Löscht die Person mit der angegebenen ID aus der Datenbank", response = Void.class, tags={ "Persons", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 204, message = "Person Deleted Successfully", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authorization Information is Missing or Invalid", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "No Person With Corresponding ID Found", response = Void.class) })
    public Response deletePerson( @PathParam("id") String id,@Context SecurityContext securityContext);
    @GET
    @Path("/{id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Liefert die Person mit der angegebenen ID zurück", notes = "Liefert die Person mit der angegebenen ID zurück", response = Person.class, tags={ "Persons", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = Person.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authorization Information is Missing or Invalid", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "No Person With Corresponding ID Found", response = Void.class) })
    public Response findPersonById( @PathParam("id") String id,@Context SecurityContext securityContext);
    @GET
    
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Liefert alle Personen zurück.", notes = "Liefert alle in der Datenbank vorhandenen Personen zurück", response = Person.class, responseContainer = "List", tags={ "Persons", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = Person.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authorization Information is Missing or Invalid", response = Void.class) })
    public Response getAllPersons(@Context SecurityContext securityContext);
    @PUT
    @Path("/{id}")
    @Consumes({ "application/json" })
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "Aktualisiert die Person mit der angegebenen ID", notes = "Aktualisiert die Person mit den entsprechenden Werten aus dem Request Body", response = Void.class, tags={ "Persons", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 201, message = "Person Created Successfully", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 204, message = "Person Updated Successfully", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request", response = String.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authorization Information is Missing or Invalid", response = Void.class) })
    public Response updatePerson( @PathParam("id") String id,@ApiParam(value = "" ,required=true) @NotNull @Valid Person person,@Context SecurityContext securityContext);
}

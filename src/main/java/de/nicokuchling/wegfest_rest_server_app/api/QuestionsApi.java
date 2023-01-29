package de.nicokuchling.wegfest_rest_server_app.api;

import de.nicokuchling.wegfest_rest_server_app.model.*;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import de.nicokuchling.wegfest_rest_server_app.model.Question;

import java.util.List;
import java.util.Map;

import java.io.InputStream;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/questions")


@io.swagger.annotations.Api(description = "the questions API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2023-01-29T17:42:09.387959900+01:00[Europe/Berlin]")
public interface QuestionsApi  {

    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "Erstellt eine neue Frage", notes = "Persistiert die Frage mit den übergebenen Attributen in der Datenbank", response = Void.class, tags={ "Questions", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 201, message = "Question Created Successfully", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authorization Information is Missing or Invalid", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request", response = String.class) })
    public Response createQuestion(@ApiParam(value = "" ,required=true) @NotNull @Valid Question question,@Context SecurityContext securityContext);
    @DELETE
    @Path("/{id}")
    
    
    @io.swagger.annotations.ApiOperation(value = "Löscht die Frage mit der angegebenen ID", notes = "Löscht die Frage mit der angegebenen ID aus der Datenbank", response = Void.class, tags={ "Questions", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 204, message = "Question Deleted Successfully", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authorization Information is Missing or Invalid", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "No Question With Corresponding ID Found", response = Void.class) })
    public Response deleteQuestion( @PathParam("id") String id,@Context SecurityContext securityContext);
    @GET
    
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Liefert alle Fragen zurück", notes = "Liefert alle in der Datenbank vorhandenen Fragen zurück", response = Question.class, responseContainer = "List", tags={ "Questions", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = Question.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authorization Information is Missing or Invalid", response = Void.class) })
    public Response getAllQuestions(@Context SecurityContext securityContext);
    @GET
    @Path("/{id}")
    
    
    @io.swagger.annotations.ApiOperation(value = "Liefert die Frage mit der angegebenen ID zurück", notes = "Liefert die Frage mit der angegebenen ID zurück", response = Void.class, tags={ "Questions", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authorization Information is Missing or Invalid", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "No Question With Corresponding ID Found", response = Void.class) })
    public Response getQuestion( @PathParam("id") String id,@Context SecurityContext securityContext);
    @PUT
    @Path("/{id}")
    @Consumes({ "application/json" })
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "Aktualisiert die Frage mit der angegebenen ID", notes = "Aktualisiert die Frage mit den entsprechenden Werten aus dem Request Body", response = Void.class, tags={ "Questions", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 201, message = "Question Created Successfully", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 204, message = "Question Updated Successfully", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authorization Information is Missing or Invalid", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request", response = String.class) })
    public Response updateQuestion( @PathParam("id") String id,@ApiParam(value = "" ,required=true) @NotNull @Valid Question question,@Context SecurityContext securityContext);
}

package de.nicokuchling.wegfest_rest_server_app.api;

import de.nicokuchling.wegfest_rest_server_app.model.*;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import de.nicokuchling.wegfest_rest_server_app.model.Scene;

import java.util.List;
import java.util.Map;

import java.io.InputStream;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/scenes")


@io.swagger.annotations.Api(description = "the scenes API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2023-01-29T17:42:09.387959900+01:00[Europe/Berlin]")
public interface ScenesApi  {

    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "Erstellt eine neue Szene", notes = "Persistiert die Szene mit den übergebenen Attributen in der Datenbank", response = Void.class, tags={ "Scenes", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 201, message = "Scene Created Successfully", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request", response = String.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authorization Information is Missing or Invalid", response = Void.class) })
    public Response createScene(@ApiParam(value = "" ,required=true) @NotNull @Valid Scene scene,@Context SecurityContext securityContext);
    @DELETE
    @Path("/{id}")
    
    
    @io.swagger.annotations.ApiOperation(value = "Löscht die Szene mit der angegebenen ID", notes = "Löscht die Szene mit der angegebenen ID aus der Datenbank", response = Void.class, tags={ "Scenes", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 204, message = "Scene Deleted Successfully", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authorization Information is Missing or Invalid", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "No Scene With Corresponding ID Found", response = Void.class) })
    public Response deleteScene( @PathParam("id") String id,@Context SecurityContext securityContext);
    @GET
    
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Liefert alle Szenen zurück", notes = "Liefert alle in der Datenbank vorhandenen Szenen zurück", response = Scene.class, responseContainer = "List", tags={ "Scenes", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = Scene.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authorization Information is Missing or Invalid", response = Void.class) })
    public Response getAllScenes(@Context SecurityContext securityContext);
    @GET
    @Path("/{id}")
    
    
    @io.swagger.annotations.ApiOperation(value = "Liefert die Szene mit der angegebenen ID zurück", notes = "Liefert die Szene mit der angegebenen ID zurück", response = Void.class, tags={ "Scenes", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authorization Information is Missing or Invalid", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "No Scene With Corresponding ID Found", response = Void.class) })
    public Response getScene( @PathParam("id") String id,@Context SecurityContext securityContext);
    @PUT
    @Path("/{id}")
    @Consumes({ "application/json" })
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "Aktualisiert die Szene mit der angegbenen ID", notes = "Aktualisiert die Szene mit den entsprechenden Werten aus dem Request Body", response = Void.class, tags={ "Scenes", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 201, message = "Scene Created Successfully", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 204, message = "Scene Updated Successfully", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authorization Information is Missing or Invalid", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Bad Request", response = String.class) })
    public Response updateScene( @PathParam("id") String id,@ApiParam(value = "" ,required=true) @NotNull @Valid Scene scene,@Context SecurityContext securityContext);
}

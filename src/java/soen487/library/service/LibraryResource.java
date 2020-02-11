/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soen487.library.service;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.GET;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
/**
 *
 * @author xavie
 */
@Path("books")
public class LibraryResource {
    
    @GET
    @Path("/list")
    @Produces(MediaType.TEXT_PLAIN)
    public String listBooks(){
        //call the library system function here for data dump
        return "List of all books";
    }
    
    @GET
    @Path("/{id}")
    @Produces(MediaType.TEXT_PLAIN)
    public String getBook(@PathParam("id") String id){
        return "This will return the book by id " + id;
    }
    
//    @POST
//    @Consumes
    
}

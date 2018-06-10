/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.rest.apps.service;

import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import test.rest.apps.controller.ProfileController;
import test.rest.apps.model.Profile;

/**
 *
 * @author grengana
 */
@Path("profile")
public class profileService {
    ProfileController pf = new ProfileController();
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Profile> getProfiles(){
        return pf.getAllProfile();
    }
    
    @GET
    @Path("{profileId}")
    @Produces(MediaType.APPLICATION_JSON)
    public Profile getProfile(@PathParam("profileId") long id){
        return pf.getProfile(id);
    }
    
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Profile addProfile(Profile profile){
        return pf.addProfile(profile);
    }
    
    
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Profile updateProfile(Profile profile){
        return pf.updateProfile(profile);
    }
    
    @DELETE
    @Path("{profileId}")
    public Profile removeProfile(@PathParam("profileId") long id){
        return pf.removeProfile(id);
    }
}

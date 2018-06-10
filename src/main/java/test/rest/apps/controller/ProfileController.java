/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.rest.apps.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import test.rest.apps.database.DatabaseClass;
import test.rest.apps.model.Profile;

/**
 *
 * @author grengana
 */
public class ProfileController {
 
    private Map<Long,Profile> profiles = DatabaseClass.getProfiles();
    
    public ProfileController(){
        profiles.put(1L, new Profile(1, "abc",12, "Student"));
        profiles.put(2L, new Profile(2, "xyz",29, "Business Person"));
    }
    public List<Profile> getAllProfile(){
       
        return new ArrayList(profiles.values());
    }
    
    public Profile getProfile(long id){
        return profiles.get(id);
    }
    
    public Profile addProfile(Profile pf){
        pf.setId(profiles.size()+1);
        profiles.put(pf.getId(), pf);
        return pf;
    }
    
    public Profile updateProfile(Profile pf){
        if(pf.getId() <= 0){
            return null;
        }
        profiles.put(pf.getId(), pf);
        return pf;
    }
    
    public Profile removeProfile(long id){
        return profiles.remove(id);
    }
}

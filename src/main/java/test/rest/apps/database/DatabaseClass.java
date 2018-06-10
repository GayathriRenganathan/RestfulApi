/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.rest.apps.database;

import java.util.HashMap;
import java.util.Map;
import test.rest.apps.model.Profile;

/**
 *
 * @author grengana
 */
public class DatabaseClass {
 
    private static Map<Long,Profile> profiles = new HashMap<Long,Profile>();
    
    public static Map<Long,Profile> getProfiles(){
        return profiles;
    }
}

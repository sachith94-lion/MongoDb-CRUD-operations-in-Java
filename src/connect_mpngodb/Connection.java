/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connect_mpngodb;


import com.mongodb.MongoClient;

/**
 *
 * @author sachith
 */
public class Connection {
    
    
    public static MongoClient connect(){
        
        MongoClient mongoClient = null;
        
        try {
            
            mongoClient = new MongoClient("localhost",27017);
            System.out.println("Server is ready");
            
           
              
        } catch (Exception e) {
            System.out.println(e);
        }
        return mongoClient;
        
        
    }
    
    
    
   
}

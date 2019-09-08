/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connect_mpngodb;
/*
import com.mongodb.BasicDBObject;
import com.mongodb.Cursor;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;
*/

/**
 *
 * @author sachith
 */
public class Connect_MpngoDB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        CRUD_with_MongoDB mongoDB = new CRUD_with_MongoDB();
        mongoDB.setVisible(true);
       
      
    

// I have also developed the console application below.
        
        
         /* try {
            
//Connecting with server 
            MongoClient mongoClient = new MongoClient("localhost",27017);
            System.out.println("Server is ready");
            
        
//Connecting with database    
            DB db = mongoClient.getDB("mylib");
            System.out.println("Done.... Database Name is: "+db.getName());
        
        
//Create Collection
            DBCollection coll = db.getCollection("employee");
            System.out.println("Collection created successfully");
    
                        
//Insert Document in Collection
            BasicDBObject doc1 = new BasicDBObject("name","Sachith").
            append("age",25). 
                    append("designation","Software Enginner").
                    append("Location","Colombo");
            coll.insert(doc1);
            System.out.println("Document Inserted.....");
            
           
            
//Read Document

//Read one document data

            BasicDBObject doc = new BasicDBObject("name","Sachith");
            Cursor cursor = coll.find(doc);
            while(cursor.hasNext()){
                //System.out.println(cursor.next());
                System.out.println(cursor.next().get("name"));
            }
            
//Read All document data 
            Cursor cursor2 = coll.find();
            while(cursor2.hasNext()){
                System.out.println(cursor2.next());
                
            }
            
            
//Update
            BasicDBObject updateDoc = new BasicDBObject();
            //New Value
            updateDoc.append("$set", new BasicDBObject().append("Location", "Kurunegala"));
            //old Document
            BasicDBObject oldDoc = new BasicDBObject().append("name", "Sachith");
            coll.update(oldDoc, updateDoc,false,false);
            System.out.println("Document Updated..");
            
         //Read updated document values   
            Cursor cursor3 = coll.find();
            while(cursor3.hasNext()){
                System.out.println(cursor3.next());
                
            }
            
            
            
//Delete

            System.out.println("After Delete");
            BasicDBObject del = new BasicDBObject("name","Chalani");
            coll.remove(del);
            
            
            //Read values after delete   
            Cursor cursor4 = coll.find();
            while(cursor4.hasNext()){
                System.out.println(cursor4.next());
                
            }
            
            
            //drop collection
            
            coll.drop();
            System.out.println("Collection Dropped");
                                                                    
        } catch (Exception e) {
            System.out.println(e);
        }
                
        */
    }
    
}
 
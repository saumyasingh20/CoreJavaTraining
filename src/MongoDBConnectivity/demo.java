package MongoDBConnectivity;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

import java.util.*;

public class demo {
    public static void main(String[] args)  {
        try{
            //creating a mongo DB client
            MongoClient mc = new MongoClient("localhost",27017);

            //connecting to the database
            MongoDatabase database = mc.getDatabase("Employees");

            //creating a collection

            //database.createCollection("Engineers");

            //Preparing a document

            Document doc = new Document();

            doc.append("name","Sajith");
            doc.append("age",24);
            doc.append("city","Bangalore");

            Document doc2 = new Document();

            doc2.append("name","Abdul");
            doc2.append("age",22);
            doc2.append("city","Bangalore");

            Document doc3 = new Document();

            doc3.append("name","Ravi");
            doc3.append("age",22);
            doc3.append("city","Patna");

//            database.getCollection("HR").insertOne(doc);
//            database.getCollection("Engineers").insertOne(doc2);
            System.out.println("Document inserted");
            List<Document> dbList = new ArrayList<>();
//            dbList.add(doc);
//            dbList.add(doc2);
//            dbList.add(doc3);
           // database.getCollection("Engineers").insertMany(dbList);
            List<Document> dbLL = new LinkedList<>();

            dbLL.add(doc);
            dbLL.add(doc2);
            dbLL.add(doc3);
            database.getCollection("Engineers").insertMany(dbLL);

//             List<Document> dbStack = new Stack<>();
//
//             dbStack.add(doc);
//             dbStack.add(doc2);
//             dbStack.add(doc3);

            //database.getCollection("Engineers").insertMany(dbStack);
            FindIterable<Document> fi = database.getCollection("Engineers").find();
          //  MongoCursor<Document> cursor = fi.cursor();
            Iterator it = fi.iterator();
            while(it.hasNext()){
                System.out.println(it.next());
            }




        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("success");
    }
}

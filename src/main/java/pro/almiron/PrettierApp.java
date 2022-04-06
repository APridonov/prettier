package pro.almiron;

import pro.almiron.models.Text;
import pro.almiron.services.MessageService;

import java.text.SimpleDateFormat;
import java.util.Date;
public class PrettierApp {

  public static void main(String[] args) {
    Date creationDate = new Date();
    SimpleDateFormat dateFormat = new SimpleDateFormat("H:m:s");

    Text text = new Text();
    text.setValue("Hello");
    text.setCreatedDate(creationDate);
    text.setUserName("Man");
    String value = text.getValue();
    String userName = text.getuserName();
    Date savedDate = text.getCreatedDate();
    String dateString = dateFormat.format(savedDate);

    MessageService messageService = new MessageService();
    messageService.print(value);
    messageService.print(userName);
    messageService.print(text.getCreatedDate().toString());
    messageService.print(dateString);

    Document textDocument = new Document();
    textDocument.put("value", text.getValue());
    textDocument.put("createdDate", text.getCreatedDate());
    textDocument.put("userName", text.getuserName());

    MongoClient mongoClient = new MongoClient("localhost", 27000);
    MongoDatabase prettier = mongoClient.getDatabase("prettier");
    MongoCollection<Document> textMongoCollection = prettier.getCollection("text", Document.class);
    textMongoCollection.insertOne(textDocument);

    Document usersDocument = new Document();
    usersDocument.put("firstname", "Amirlan");
    usersDocument.put("lastname", "Pridonov");
    MongoCollection<Document> usersMongoCollection = prettier.getCollection("users", Document.class);
    usersMongoCollection.insertOne(usersDocument);


    mongoClient.close();
  }

}

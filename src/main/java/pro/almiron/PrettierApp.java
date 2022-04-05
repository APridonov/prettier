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

  }

}

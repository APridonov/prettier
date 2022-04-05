package pro.almiron.models;

import java.util.Date;

public class Text {

    private String value;
    private Date createdDate;
    private String userName;

    public void setValue (String value){
      this.value = value;
    }

    public String getValue () {
      return this.value;
    }

    public void setCreatedDate (Date createdDate){
      this.createdDate = createdDate;
    }

    public Date getCreatedDate () {
      return this.createdDate;
    }

    public void setUserName (String userName){
      this.userName = userName;
    }

    public String getuserName () {
      return this.userName;
    }
}
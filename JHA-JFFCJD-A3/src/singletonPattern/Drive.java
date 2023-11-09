package singletonPattern;

public class Drive {
   GoogleAccount acc = GoogleAccount.getObject();

   public void getProperties(){
       acc.googleDrive();
   }
}

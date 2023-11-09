package singletonPattern;

public class Chrome {
    GoogleAccount acc = GoogleAccount.getObject();
    public void getProperties(){
        acc.googleChorme();
    }
}

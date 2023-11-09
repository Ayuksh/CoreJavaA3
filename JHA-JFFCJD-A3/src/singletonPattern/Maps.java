package singletonPattern;

public class Maps {
    GoogleAccount acc = GoogleAccount.getObject();

    public void getProperties(){
        acc.googleMaps();
    }
}

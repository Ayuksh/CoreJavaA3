package singletonPattern;

public class YouTube {
    GoogleAccount acc = GoogleAccount.getObject();
    public void getProperties(){
        acc.youTube();
    }
}

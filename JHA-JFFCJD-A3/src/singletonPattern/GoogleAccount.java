package singletonPattern;

public class GoogleAccount {
    private static GoogleAccount acc ;

    private GoogleAccount(){

    }

    public static GoogleAccount getObject(){
        if (acc == null)
            acc = new GoogleAccount();
        return acc;
    }

    public void googleMaps(){
        System.out.println("ACCESSING ALL PROPERTY OF GOOGLE MAPS !!");
    }

    public void googleDrive(){
        System.out.println("ACCESSING ALL PROPERTY OF GOOGLE DRIVE !!");
    }

    public void googleChorme(){
        System.out.println("ACCESSING ALL PROPERTY OF GOOGLE CHROME !!");
    }

    public void youTube(){
        System.out.println("ACCESSING ALL PROPERTY OF YOUTUBE !!");

    }
}

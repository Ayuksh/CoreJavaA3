package methodOverriding;

public class Drive extends Google {
    @Override
    public void searching() {
        System.out.println("SEARCHING FROM GOOGLE DRIVE !!");
    }

    @Override
    public void download() {
        System.out.println("DOWNLOADING FROM GOOGLE DRIVE !! ");
    }

    public void upload(){
        System.out.println("UPLOADING ON GOOGLE DRIVE !!");
    }
}

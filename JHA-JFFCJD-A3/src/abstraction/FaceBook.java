package abstraction;

public abstract class FaceBook {
    public void uploadPhoto(){
        System.out.println("uploading photos !!");
    }

    public abstract void uploadStories();
    public abstract void goLive();
    public abstract void messaging();
    public abstract void reels();
}

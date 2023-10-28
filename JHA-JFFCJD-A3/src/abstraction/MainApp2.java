package abstraction;

public class MainApp2 {
    public static void main(String[] args) {
        FacebookV2 fb = new FaceBookV4();
        fb.uploadPhoto();
        fb.uploadStories();
        fb.goLive();
        fb.messaging();
        fb.reels();
    }
}

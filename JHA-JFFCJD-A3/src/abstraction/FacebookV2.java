package abstraction;

public abstract class FacebookV2 extends FaceBook {
    @Override
    public void messaging() {
        System.out.println("sending message to frds !!");
    }

    @Override
    public void goLive() {
        System.out.println("live streaming !!");
    }
}

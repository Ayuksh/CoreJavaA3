package abstraction;

public class WhatsAppBusiness extends WhatsApp{
    @Override
    public void sendMessage() {
        System.out.println("SEND MESSAGE TO ANY ONE !!");
    }

    @Override
    public void uploadStories() {
        System.out.println("ANY ONE CAN VIEW STORIES !!");
    }

    @Override
    public void sendMoney() {
        System.out.println("MONEY CAN BE SENT TO ANY ONE !!");
    }

    @Override
    public void whatsAppCall() {
        System.out.println("ANY ONE CAN CALL !!");
    }

    public void showDeleted(){
        System.out.println("SHOW DELETED MESSAGE AND STORIES !!");
    }

    public void customMessage()
    {
        System.out.println("SEND CUSTOM MESSAGE !! ");
    }
}

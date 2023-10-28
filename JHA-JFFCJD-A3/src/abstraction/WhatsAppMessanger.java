package abstraction;

public class WhatsAppMessanger extends WhatsApp{
    @Override
    public void sendMessage() {
        System.out.println("SEND MESSAGE TO ANY ONE !!");
    }

    @Override
    public void uploadStories() {
        System.out.println("ONLY CONTACT CAN VIEW STORIES !!");
    }

    @Override
    public void sendMoney() {
        System.out.println("MONEY CAN BE SENT TO CONTACTS !!");
    }

    @Override
    public void whatsAppCall() {
        System.out.println("ONLY CONTACTS CAN CALL !!");
    }
}

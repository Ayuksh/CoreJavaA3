package abstraction;

import java.util.Scanner;

public class MainApp3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("SELECT THE WHATSAPP");
        System.out.println("1. WHATS APP ");
        System.out.println("2. WHATS APP BUSINESS ");
        int ch = sc.nextInt();

//        WhatsApp wp = null ;
//        if (ch == 1)
//            wp = new WhatsAppMessanger();
//        else
//            wp = new WhatsAppBusiness();

        WhatsApp wp = (ch==1)?
                new WhatsAppMessanger()
                :
                new WhatsAppBusiness() ;


        wp.sendMessage();
        wp.sendMoney();
        wp.uploadStories();
        wp.whatsAppCall();

        if(wp instanceof WhatsAppBusiness)
        {
            WhatsAppBusiness wbp = (WhatsAppBusiness) wp ;
            wbp.showDeleted();
            wbp.customMessage();
        }
    }
}

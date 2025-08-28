class iOS {
    void startApp() {
        System.out.println("iOS: Starting app...");
    }

    void increaseVolume() {
        System.out.println("iOS: Increasing volume...");
    }

    void shutdown() {
        System.out.println("iOS: Shutting down...");
    }
}
class iPhone extends iOS {
    void makeCall() {
        System.out.println("iPhone: Making a call...");
    }

    void sendSMS() {
        System.out.println("iPhone: Sending an SMS...");
    }
}
class iPad extends iOS {
    public void watchMovie() {
        System.out.println("iPad: Watching a movie...");
    }
}
public class MyPhone {
    public static void main(String[] args) {
        iPhone myiPhone = new iPhone();
        myiPhone.startApp();         
        myiPhone.increaseVolume();   
        myiPhone.shutdown();  
        myiPhone.makeCall(); 
        myiPhone.sendSMS();
}
}
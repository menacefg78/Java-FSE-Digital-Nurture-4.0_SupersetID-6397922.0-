public class NotificationTest {
    public static void main(String[] args) {
        Notifier baseNotifier = new EmailNotifier();

       
        Notifier smsNotifier = new SMSNotifier(baseNotifier);

      
        Notifier fullNotifier = new SlackNotifier(smsNotifier);

        fullNotifier.send("New login detected.");
    }
}

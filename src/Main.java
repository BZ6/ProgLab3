public class Main {
    public static void main(String[] args) {
        Pig pig = new Pig();
        Owl owl = new Owl();
        Bear bear = new Bear();
        MailBox mailbox = new MailBox();

        pig.bowDown(bear);
        owl.admire();
        mailbox.beWire();
        mailbox.beSlotAndInscription();
        mailbox.beVisibilityInscription();
        mailbox.beOutside();
        owl.flyDown();
    }
}

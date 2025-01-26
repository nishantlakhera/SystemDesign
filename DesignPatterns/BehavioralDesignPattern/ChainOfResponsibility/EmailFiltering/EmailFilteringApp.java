public class EmailFilteringApp {
    public static void main(String[] args) {
        EmailHandler spamFilter = new SpamFilter();
        EmailHandler businessFilter = new BusinessFilter();
        EmailHandler generalFilter = new GeneralFilter();

        spamFilter.setNextEmailHandler(businessFilter);
        businessFilter.setNextEmailHandler(generalFilter);

        // Create emails
        Email email1 = new Email("spam@example.com", "You won $1M!", "Click here to claim your prize.", true, false);
        Email email2 = new Email("boss@company.com", "Meeting Reminder", "Don't forget our meeting tomorrow.", false, true);
        Email email3 = new Email("friend@example.com", "Hello!", "Long time no see!", false, false);

        System.out.println("Processing email 1:");
        spamFilter.processEmail(email1);

        System.out.println("\nProcessing email 2:");
        spamFilter.processEmail(email2);

        System.out.println("\nProcessing email 3:");
        spamFilter.processEmail(email3);

    }

}

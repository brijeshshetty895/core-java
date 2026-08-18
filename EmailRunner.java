public class EmailRunner {

    public static void main(String[] args) {

        // Implicit References
        Email[] emails = new Email[10];

        emails[0] = new Email("abc@gmail.com");
        emails[1] = new Email("xyz@gmail.com");
        emails[2] = new Email("hello@gmail.com");
        emails[3] = new Email("java@gmail.com");
        emails[4] = new Email("student@gmail.com");

        // Explicit References
        Email explicitEmail1 = new Email("college@gmail.com");
        Email explicitEmail2 = new Email("program@gmail.com");
        Email explicitEmail3 = new Email("test@gmail.com");
        Email explicitEmail4 = new Email("example@gmail.com");
        Email explicitEmail5 = new Email("mail@gmail.com");

        emails[5] = explicitEmail1;
        emails[6] = explicitEmail2;
        emails[7] = explicitEmail3;
        emails[8] = explicitEmail4;
        emails[9] = explicitEmail5;

        System.out.println("Length of Email Array: " + emails.length);
        System.out.println();

        System.out.println("Email Details:");

        for (int i = 0; i < emails.length; i++) {
            emails[i].displayEmail();
        }
    }
}
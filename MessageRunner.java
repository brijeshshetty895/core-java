public class MessageRunner {

    public static void main(String[] args) {

        Message[] messages = new Message[50];

        // Direct References
        messages[0] = new Message("Hi");
        messages[1] = new Message("Hello");
        messages[2] = new Message("Good morning");
        messages[3] = new Message("How are you?");
        messages[4] = new Message("Good evening");
        messages[5] = new Message("Thank you");
        messages[6] = new Message("Welcome");
        messages[7] = new Message("All the best");
        messages[8] = new Message("See you");
        messages[9] = new Message("Take care");
        messages[10] = new Message("Good night");
        messages[11] = new Message("Have a nice day");
        messages[12] = new Message("Where are you?");
        messages[13] = new Message("I am coming");
        messages[14] = new Message("Call me");
        messages[15] = new Message("Send it");
        messages[16] = new Message("Okay");
        messages[17] = new Message("Sure");
        messages[18] = new Message("No problem");
        messages[19] = new Message("Thank you so much");
        messages[20] = new Message("Nice");
        messages[21] = new Message("Great");
        messages[22] = new Message("Congratulations");
        messages[23] = new Message("Happy birthday");
        messages[24] = new Message("See you tomorrow");

        // References
        Message message1 = new Message("Good luck");
        Message message2 = new Message("What happened?");
        Message message3 = new Message("I will call you");
        Message message4 = new Message("Please wait");
        Message message5 = new Message("Come here");
        Message message6 = new Message("Let's go");
        Message message7 = new Message("I reached");
        Message message8 = new Message("Where are you?");
        Message message9 = new Message("I am busy");
        Message message10 = new Message("Talk later");
        Message message11 = new Message("Okay fine");
        Message message12 = new Message("See you soon");
        Message message13 = new Message("Good work");
        Message message14 = new Message("Keep going");
        Message message15 = new Message("Well done");
        Message message16 = new Message("I understand");
        Message message17 = new Message("Don't worry");
        Message message18 = new Message("Be careful");
        Message message19 = new Message("Have fun");
        Message message20 = new Message("Bye");
        Message message21 = new Message("Good afternoon");
        Message message22 = new Message("I am ready");
        Message message23 = new Message("Let's meet");
        Message message24 = new Message("Message me");
        Message message25 = new Message("Thank you");

        messages[25] = message1;
        messages[26] = message2;
        messages[27] = message3;
        messages[28] = message4;
        messages[29] = message5;
        messages[30] = message6;
        messages[31] = message7;
        messages[32] = message8;
        messages[33] = message9;
        messages[34] = message10;
        messages[35] = message11;
        messages[36] = message12;
        messages[37] = message13;
        messages[38] = message14;
        messages[39] = message15;
        messages[40] = message16;
        messages[41] = message17;
        messages[42] = message18;
        messages[43] = message19;
        messages[44] = message20;
        messages[45] = message21;
        messages[46] = message22;
        messages[47] = message23;
        messages[48] = message24;
        messages[49] = message25;

        System.out.println("Length of Message Array: " + messages.length);
        System.out.println();

        for (int i = 0; i < messages.length; i++) {
            messages[i].displayMessage();
        }
    }
}
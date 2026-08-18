public class BankAccountRunner {

    public static void main(String[] args) {

        BankAccount[] accounts = new BankAccount[5];

        // Direct References
        accounts[0] = new BankAccount(12345678901L);
        accounts[1] = new BankAccount(12345678902L);

        // References
        BankAccount account1 = new BankAccount(12345678903L);
        BankAccount account2 = new BankAccount(12345678904L);
        BankAccount account3 = new BankAccount(12345678905L);

        accounts[2] = account1;
        accounts[3] = account2;
        accounts[4] = account3;

        System.out.println("Length of Bank Account Array: " + accounts.length);
        System.out.println();

        System.out.println("Bank Account Details:");

        for (int i = 0; i < accounts.length; i++) {
            accounts[i].displayAccount();
        }
    }
}
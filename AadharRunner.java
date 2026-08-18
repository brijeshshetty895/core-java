public class AadharRunner {

    public static void main(String[] args) {

        Aadhar[] aadhar = new Aadhar[1];

        // Direct Reference
        aadhar[0] = new Aadhar("123456789012");

        System.out.println("Length of Aadhar Array: " + aadhar.length);
        System.out.println();

        System.out.println("Aadhar Details:");

        for (int i = 0; i < aadhar.length; i++) {
            aadhar[i].displayAadhar();
        }
    }
}
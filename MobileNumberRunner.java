public class MobileNumberRunner {

    public static void main(String[] args) {

        MobileNumber[] numbers = new MobileNumber[20];

        // Implicit References
        numbers[0] = new MobileNumber("9876543210");
        numbers[1] = new MobileNumber("9876543211");
        numbers[2] = new MobileNumber("9876543212");
        numbers[3] = new MobileNumber("9876543213");
        numbers[4] = new MobileNumber("9876543214");
        numbers[5] = new MobileNumber("9876543215");
        numbers[6] = new MobileNumber("9876543216");
        numbers[7] = new MobileNumber("9876543217");
        numbers[8] = new MobileNumber("9876543218");
        numbers[9] = new MobileNumber("9876543219");

        // Explicit References
        MobileNumber explicitNumber1 = new MobileNumber("9123456780");
        MobileNumber explicitNumber2 = new MobileNumber("9123456781");
        MobileNumber explicitNumber3 = new MobileNumber("9123456782");
        MobileNumber explicitNumber4 = new MobileNumber("9123456783");
        MobileNumber explicitNumber5 = new MobileNumber("9123456784");
        MobileNumber explicitNumber6 = new MobileNumber("9123456785");
        MobileNumber explicitNumber7 = new MobileNumber("9123456786");
        MobileNumber explicitNumber8 = new MobileNumber("9123456787");
        MobileNumber explicitNumber9 = new MobileNumber("9123456788");
        MobileNumber explicitNumber10 = new MobileNumber("9123456789");

        numbers[10] = explicitNumber1;
        numbers[11] = explicitNumber2;
        numbers[12] = explicitNumber3;
        numbers[13] = explicitNumber4;
        numbers[14] = explicitNumber5;
        numbers[15] = explicitNumber6;
        numbers[16] = explicitNumber7;
        numbers[17] = explicitNumber8;
        numbers[18] = explicitNumber9;
        numbers[19] = explicitNumber10;

        System.out.println("Length of Mobile Number Array: " + numbers.length);
        System.out.println();

        System.out.println("Mobile Number Details:");

        for (int i = 0; i < numbers.length; i++) {
            numbers[i].displayNumber();
        }
    }
}
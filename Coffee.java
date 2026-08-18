public class Coffee {

    public static void boilWater() {
        System.out.println("Boiling water");
    }

    public static void addCoffee() {
        System.out.println("Adding coffee powder");
    }

    public static void addMilk() {
        System.out.println("Adding milk");
    }

    public static void addSugar() {
        System.out.println("Adding sugar");
    }

    public static void serveCoffee() {
        System.out.println("Serving coffee");
    }

    public static void main(String[] args) {
        boilWater();

        addCoffee();
        addCoffee();

        addMilk();
        addMilk();
        addMilk();

        addSugar();
        addSugar();
        addSugar();
        addSugar();

        serveCoffee();
        serveCoffee();
        serveCoffee();
        serveCoffee();
        serveCoffee();

    }
}
public class Main {
    public static void main(String[] args) {

        CustomerManager customerManager = new CustomerManager(new Customer(), new MilitaryCreditManager());
        customerManager.giveCredit();
    }
}
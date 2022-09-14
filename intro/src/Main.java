public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World");

        //değişken isimleri java'da camelCase yazılır
        String ortaMetin = "İlginizi çekebilir";
        String altMetin = "Vade süresi";

        System.out.println(ortaMetin);

        //integer
        int vade = 12;

        double dolarDun = 18.14;
        double dolarBugun = 18.20;

        boolean dolarDustuMu = false;

        String okYonu = "";

        if (dolarBugun < dolarDun) { //false
            okYonu = "down.jpg";
            System.out.println(okYonu);
        } else if (dolarBugun > dolarDun) {
            okYonu = "up.svg";
            System.out.println(okYonu);
        } else {
            okYonu = "equal.svg";
            System.out.println(okYonu);
        }
    }
}

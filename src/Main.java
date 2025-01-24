import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String [] guest = {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi", "Bebe Vio", "Luis",
                "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic"};

        Scanner s = new Scanner(System.in);
        System.out.println("Come ti chiami ?");
        String name = s.nextLine();

        boolean isPresent = false;
        for (int i = 0; i < guest.length; i++){
            if (name.equalsIgnoreCase(guest[i])) {
                isPresent = true;
                break;
            }
        }
        if (isPresent){
            System.out.println("Benvenuto");
        }else {
            System.out.println("NON BENVENUTO");
        }
    }
}
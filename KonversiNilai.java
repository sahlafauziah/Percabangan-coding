import java.util.Scanner;

public class KonversiNilai {
    public static void main(String[] args) {
        Scanner inputx = new Scanner(System.in);
        
        System.out.print("Masukkan nilai : ");
        Double nilai = inputx.nextDouble();

        if (nilai > 85) {
            System.out.println( "A");
        } else if (nilai > 75) {
            System.out.println( "B");
        } else if (nilai > 65) {
            System.out.println( "C");
        } else if (nilai > 55) {
            System.out.println( "D");
        } else {
            System.out.println( "E");
        }    
            
            inputx.close();
    }
}

import java.util.Scanner;

public class LulusatauTidak {
    public static void main(String[] args) {
        Scanner inputx = new Scanner(System.in);
        
        System.out.print("Masukkan nilai siswa: ");
        Double nilai = inputx.nextDouble();
        
        if (nilai > 75) {
            System.out.println("Siswa dinyatakan LULUS.");
        } else {
            System.out.println("Siswa dinyatakan TIDAK LULUS.");
        }
        
        inputx.close();
    }
}


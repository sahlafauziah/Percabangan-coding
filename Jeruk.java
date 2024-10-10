import java.util.Scanner;

public class Jeruk {
    public static void main(String[] args) {
        Scanner inputx = new Scanner(System.in);

        System.out.print("Masukkan jumlah jeruk: ");
        int jumlahJeruk = inputx.nextInt(); 

        int totalHarga = 0;

       
        if (jumlahJeruk >= 5) {
            totalHarga += (jumlahJeruk / 5) * 10000; 
            jumlahJeruk %= 5; 
        } 
        
        if (jumlahJeruk >= 2) { 
            totalHarga += (jumlahJeruk / 2) * 5000; 
            jumlahJeruk %= 2; 
        } 
        
        if (jumlahJeruk == 1) { 
            totalHarga += 3000; 
        }


        System.out.println("Total harga jeruk adalah: Rp " + totalHarga);
        
        inputx.close(); 
    }
}


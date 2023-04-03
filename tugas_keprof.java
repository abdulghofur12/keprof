import java.util.Scanner;

public class ExampleProgram {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int num = 0;

    // Assignment
    System.out.print("Masukkan angka: ");
    num = input.nextInt();

    // Pemilihan
    if (num % 2 == 0) {
      System.out.println(num + " adalah bilangan genap.");
    } else {
      System.out.println(num + " adalah bilangan ganjil.");
    }

    // Perulangan
    System.out.println("Menampilkan bilangan 1 sampai " + num + ":");
    for (int i = 1; i <= num; i++) {
      System.out.print(i + " ");
    }
  }
}

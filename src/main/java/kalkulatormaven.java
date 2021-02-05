import java.util.Scanner;
public class kalkulatormaven {
    public static void main (String[] args){
        System.out.print("Podaj wartosc A:");
        double A;
        Scanner odczyt1 = new Scanner(System.in);
        A = odczyt1.nextInt();
        System.out.print("Podaj wartosc B:");
        double B;
        Scanner odczyt2 = new Scanner(System.in);
        B = odczyt2.nextInt();

        double suma = A+B;
        double roznica = A-B;
        double mnozenie = A*B;
        double dzielenie = A/B;
        System.out.println("Suma to: "+suma);
        System.out.println("Roznica to: "+roznica);
        System.out.println("Iloczyn to: "+mnozenie);
        System.out.println("Iloraz to: "+dzielenie);
    }
}



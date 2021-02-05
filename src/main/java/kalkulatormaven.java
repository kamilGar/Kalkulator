public class kalkulatormaven {
    static double Sum(double x, double y) {
        return x + y;
    }
    static double Substraction(double x, double y){
        return x-y;
    }
    static double Multiplication(double x, double y){
        return x*y;
    }
    static double Division (double x, double y)
    {
        return x/y;
    }

    public static void main(String[] args) {
        System.out.println(Sum(5, 3));
        System.out.println(Substraction(5, 3));
        System.out.println(Multiplication(5, 3));
        System.out.println(Division(4, 2));
    }
}



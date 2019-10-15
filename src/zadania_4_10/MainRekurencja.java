package zadania_4_10;

public class MainRekurencja {
    //Napisz metodę, która sumuje wszystkie liczby naturalne liczbie podanej jako parametr
    //na przykład dla 5 wykona działanie 1+2+3+4+5

    public static void main(String[] args) {
     /*   System.out.println(oblicz(5));
        System.out.println(obliczR(5));*/

        System.out.println(fibonacci(0));
        System.out.println(fibonacci(1));
        System.out.println(fibonacci(20));
    }

    public static int oblicz(int x) {
        int n = 0;
        int sum = 0;
        while (n <= x) {
            sum += n;
            n++;
        }
        return sum;
    }

    public static int obliczR(int n){
        return (n > 0) ? n + obliczR(n-1) : 0;
    }

    public static int fibonacci(int n) {
        if(n < 2) return n;
        return  fibonacci(n -1) + fibonacci(n-2);
    }
}

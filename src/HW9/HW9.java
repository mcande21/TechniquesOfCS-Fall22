package HW9;

public class HW9 {

    public static int bigpow(int x, int y) {
        int prod = 1;
        for (int i = 0; i < y; i++) {
            prod = prod * x;
        }
        return prod;
    }

    public static int fastbigpow(int x, int y){
        if (y%2==0){
            return (bigpow(bigpow(x, (y/2)), 2));
        }
        else
            return x * bigpow(x, y-1);
    }

    public static void main(String[] args) {
        System.out.println(fastbigpow(4, 4)==256);
        System.out.println(fastbigpow(4,3)==64);
    }

}

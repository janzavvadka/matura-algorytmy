public class PrimeNumber {
    public static boolean isPrimeNumber(int liczba) {
        if (liczba < 2) {
            return false;
        }
        for (int i = 2; i <= liczba; i++) {
            if (liczba % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        boolean a = isPrimeNumber(11);
        System.out.println(a);
    }
}

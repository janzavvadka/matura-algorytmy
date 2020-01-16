//Euklides
public class NWD {

    public static void main(String[] args) {
        int a = 24;
        int b = 28;
        int result = NWD(a, b);
        System.out.println(result);
    }

    static int NWD(int a, int b) {
        while(a != b) {
            if(a > b) {
                a -= b;
            } else {
                b -= a;
            }
        }
        return a;
    }

}

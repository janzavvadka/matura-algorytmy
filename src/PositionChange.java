public class PositionChange {

    public static void main(String args[]) {
        int number = 100;
        int position = 3;
        convertNumberToPosition(number,position);
    }

    static void convertNumberToPosition(int number, int position) {
        if(number > 0) {
            convertNumberToPosition(number/position, position);
            System.out.print(number%position);
        }

    }
}

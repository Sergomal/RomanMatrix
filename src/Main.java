public class Main {


    public static void main(String[] args) {

        System.out.println("");
        RomanMatrix rm = new RomanMatrix();
        rm.printMatrix();

        int arabic = 1;
        String roman;
        roman = rm.getRoman(arabic);
        System.out.println(arabic + " ==> " + roman);

    }
}

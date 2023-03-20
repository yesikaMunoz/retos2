public class reto4{
    public static void main(String[] args) {
        String[][] calculadora = new String[4][4];
        calculadora[0] = new String[] {"7","8" , "9", "/"};
        calculadora[1] = new String[] {"4", "5", "6", "*"};
        calculadora[2] = new String[] {"1", "2", "3", "-"};
        calculadora[3] = new String[] {"0", "C", "=", "+"};

        for (int i = 0; i < calculadora.length; i++) {
            for (int j = 0; j < calculadora[i].length; j++) {
                System.out.print(calculadora[i][j] + " ");
            }
            System.out.println();
        }
    }
}

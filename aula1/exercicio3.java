public class exercicio3 {
    public static void main(String[] args) {
        int n = 30;
        long[] sequencia= new long[n];

        sequencia[0] = 1;
        sequencia[1] = 1;

        for (int i = 2; i < n; i++) {
            sequencia[i] = sequencia[i - 1] + sequencia[i - 2];
        }

        for (int i = 0; i < n; i++) {
            System.out.print(sequencia[i] + " ");
        }
    }
}
import java.util.Random;

public class MatrixBuilder {
    Matrix x;
    private int m, n;

    MatrixBuilder(int rows, int columns) {
        x = new Matrix(new int[rows][columns]);
        m = x.getMatrixArray().length;
        n = x.getMatrixArray()[0].length;
    }

    Matrix getMatrix() {
        return x;
    }

    void getRandomArray() {
        int[] values = new int[m * n];
        Random random = new Random();
        for (int i = 0; i < m * n; i++) {
            values[i] = random.nextInt(201) - 100;
        }
        x.fillArrayMatrix(values);
    }

    void fillArray(String matrix) {
        int[] values = new int[m * n];
        int ind = 0;
        System.out.printf(MatrixMsg.FILL_MATRIX.getMsg(), matrix);
        NumberReceiver receiver = new NumberReceiver();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                values[ind++] = receiver.receiveInt(String.format(MatrixMsg.ENTER_VALUE.getMsg(),
                        matrix,
                        (i + 1),
                        (j + 1)
                ));
            }
        }
        x.fillArrayMatrix(values);
    }
}

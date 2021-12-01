public class MatricesOperations {

    void initActions() {
        while (resume()) {
            chooseOperation();
        }
    }

    boolean resume() {
        StringReceiver receiver = new StringReceiver();
        String response = "";
        while (!"Y".equalsIgnoreCase(response) && !"N".equalsIgnoreCase(response)) {
            response = receiver.receive(Message.REQUEST.getMsg());
        }
        if ("Y".equalsIgnoreCase(response)) {
            StringReceiver.close();
        }
        return "N".equalsIgnoreCase(response);
    }

    private void chooseOperation() {
        int choice = -1;
        while (choice < 0 || choice > 6) {
            NumberReceiver numberReceiver = new NumberReceiver();
            choice = numberReceiver.receiveInt(MatrixMsg.CHOOSE_OPERATION.getMsg());
        }
        switch (choice) {
            case 1 -> addMatrix();
            case 2 -> subtractMatrix();
            case 3 -> multiplyByNumber();
            case 4 -> multiplyByMatrix();
            case 5 -> transposeMatrix();
            case 6 -> findDeterminant();
        }
    }

    private void addMatrix() {
        new MatrixAddition().chooseInitOptions();
    }

    private void subtractMatrix() {
        new MatrixSubtraction().chooseInitOptions();
    }

    private void multiplyByNumber() {
        new Multiplier().chooseInitOptions();
    }

    private void multiplyByMatrix() {
        new MatricesProduct().chooseInitOptions();
    }

    private void transposeMatrix() {
        new Transponder().chooseInitOptions();
    }

    private void findDeterminant() {
        new Determinant().chooseInitOptions();
    }
}
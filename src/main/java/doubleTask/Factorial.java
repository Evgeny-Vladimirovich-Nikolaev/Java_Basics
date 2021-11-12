public class Factorial {

    private int value;
    private double result;
    private String message;

    public Factorial() {
        receive();
        calculateFactorial();
        writeMessage();
    }

    private void receive() {
        while(true) {
            System.out.println(Message.INIT_NOT_NEGATIVE_INTEGER.getMsg());
            value = ValueReceiver2.receiveInt();
            if(value < 0) {
                continue;
            }
            if(value > 5000 && !isAgree(value)) {
                continue;
            }
            break;
        }
    }

    private boolean isAgree(int i) {
        while(true) {
            System.out.println(i + Message.RESUME.getMsg());
            int choice = ValueReceiver2.receiveInt();
            if(choice != 1 && choice != 2) {
                continue;
            }
            return choice == 1;
        }
    }

    /*private double calculateFactorial (int i) {
        if(i <= 0) return 1.0;
        else return (i * calculateFactorial(i - 1));
    }*/

    private void calculateFactorial () {
        result = 1;
        for(int i = 2; i <= value; i++ ) {
            result *= i;
        }
    }

    private void writeMessage() {
        StringBuilder sb = new StringBuilder(Integer.toString(value));
        sb.append("! = ");
        sb.append(Double.toString(result));
        if(".0".equals(sb.substring(sb.length()-2))){
            sb.delete(sb.length()-2, sb.length());
        }
        message = sb.toString();
    }

    @Override
    public String toString() {
        return message;
    }
}
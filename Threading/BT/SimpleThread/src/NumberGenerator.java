public class NumberGenerator extends Thread {
    public NumberGenerator() {
    }

    @Override
    public void run() {
        try{
            int i = 1;
            for (int j = 0; j <= 10 ; j++) {
                Thread.sleep(500);
                System.out.println(j);
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
       NumberGenerator num1 = new NumberGenerator();
       NumberGenerator num2 = new NumberGenerator();

       num1.setPriority(MIN_PRIORITY);
       num2.setPriority(MAX_PRIORITY);
       num1.start();
       num2.start();

    }
}

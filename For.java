public class For
{
    int a = 5;
    int b = 2;
    int c = 1;
    int d = -8;
    
    public void run() {
       for (int i = 0; i <= 15; i += 1) {
           System.out.println("i is " + i);
       }
       for (int j = 10; j > 0; j -= 2) {
           System.out.println("j is " + j);
       }
       for (int k = 10; k == 0; k -= 3) {
           System.out.println("k is " + k);
           // Never reaches 0
       }
    }
    public static void main(String[] args) {
        For hw = new For();
        hw.run();
    }
}

public class Main {
    public static void main(String[] args) {
        BinOps bins = new BinOps();
        System.out.println("100000 + 111 = " + bins.sum("100000", "111"));
        System.out.println("101101 * 1000 = " + bins.mult("101101", "1000"));
    }
}

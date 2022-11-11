public class BinOps {
    public String sum(String a, String b) {
        int la = Integer.parseInt(a, 2);
        int lb = Integer.parseInt(b, 2);
        return Integer.toBinaryString(la + lb);
    }

    public String mult(String a, String b) {
        int la = Integer.parseInt(a, 2);
        int lb = Integer.parseInt(b, 2);
        return Integer.toBinaryString(la * lb);
    }
}
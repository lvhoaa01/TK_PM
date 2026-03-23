package TH1.B2;

public class Main {
    public static void main(String[] args) {
        ITokenize s1 = new TachTu("Le! thì Van$ mà *Hoa");

        s1 = new LoaiBoDauCau(s1);
        s1 = new LoaiBoTuDung(s1);
        for(String s : s1.tokenize()){
            System.out.print(s + " ");
        }

    }
}

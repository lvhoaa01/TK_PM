package TH1.B2;

import java.util.List;

public class LoaiBoTuDung extends TokenizeDecorator{
    public LoaiBoTuDung(ITokenize tokenize){
        super(tokenize);
    }
    String[] dsTuDung = new String[]{"và", "thì", "mà", "là", "hoặc"};
    List<String> dsach = tokenize();

    @Override
    public List<String> tokenize() {
        List<String> dsach = super.tokenize();
        dsach.removeAll(List.of(dsTuDung));
        return dsach;
    }
}

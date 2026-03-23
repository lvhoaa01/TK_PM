package TH1.B2;

import java.util.ArrayList;
import java.util.List;

public class TachTu implements ITokenize{
    protected String s;
    public TachTu(String s){this.s = s;}
    @Override
    public List<String> tokenize() {
        var result = s.split(" ");
        return new ArrayList<>(List.of(result));
    }
}

package TH1.B2;

import java.util.ArrayList;
import java.util.List;

public class LoaiBoDauCau extends TokenizeDecorator {
    public LoaiBoDauCau(ITokenize tokenize){
        super(tokenize);
    }

    @Override
    public List<String> tokenize() {
        List<String> dsach = super.tokenize();
        List<String> result = new ArrayList<>();
        for(String s : dsach){
            s = s.replaceAll("\\p{Punct}","");
            result.add(s);
        }
        return result;
    }
}

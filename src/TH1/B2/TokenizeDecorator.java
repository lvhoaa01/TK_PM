package TH1.B2;

import java.util.List;

public abstract class TokenizeDecorator implements ITokenize {
    protected ITokenize tokenize;
    public TokenizeDecorator(ITokenize tokenize){this.tokenize = tokenize;}

    @Override
    public List<String> tokenize() {
        return tokenize.tokenize();
    }
}

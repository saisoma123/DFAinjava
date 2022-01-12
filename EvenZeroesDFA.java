public class EvenZeroesDFA extends DFA<EvenZeroesDFA.S, BinarySymbol>
{
    enum S{
        S1, S2
    }
    public EvenZeroesDFA()  {
        super(S.S1, S.S1);
    }
    @Override
    protected S o(S q, BinarySymbol o1)
    {
        switch(o1){
            case Z:
                switch(q){
                    case S1:
                        return S.S2;
                }
                default:
                    return S.S1;
            case O:
                switch(q){
                    case S1:
                        return S.S1;
                    default:
                        return S.S2;
                }
        }
        
    }
}
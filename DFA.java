import java.util.*;
public abstract class DFA<Q, E> {
    private final Q q0;
    private final Set<Q> F;
    //Constructs DFA given starting state and final states
    protected DFA(Q q0, Q... F){
        this.q0 = q0;
        this.F = new HashSet<>(Arrays.asList(F));
    }
    //Transititon function
    protected abstract Q o(Q q, E o1);
    //Checks if automaton accepts a particular string
    public final boolean accepts(Iterable<E> input)
    {
        Q q = q0;
        for (E o1: input)
        {
            q = o(q, o1);
        }
        return F.contains(q);
    }
}
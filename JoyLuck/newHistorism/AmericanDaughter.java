package JoyLuck.newHistorism;
/**
 * Represents an American-born daughter of a {@link ChineseMother}, inheriting her mother's survival method using Java's {@code extends} keyword. 
 * under the modern 1980s American society
 * 
 * <p> As a subclass of {@code ChineseMother}, {@code AmericanDaughter} inherits all methods that are included in its parent class {@code ChineseMother}.
 * However, under a different historical environment, it is possible that they override inherited methods or show completely new behaviors.</p>
 * 
 * <p> This class is instantiated inside {@link HistoricalEnvironment#CAPITALISM_AMERICA}, where the original oppresive force that justifies the inherited methods
 * no longer exist. These methods continue executing regardless authomatically, and produce {@link LegacySurvivalModeException}.
 * 
 * @see ChineseMother
 * @see LegacySurvivalModeException
 * @see HistoricalEnvironment
 */
public class AmericanDaughter extends ChineseMother{

    public String historicalEnvironment = "1980s_American_Dream";
    public String name;
    public int age;
    public String conflictWithMom;

    AmericanDaughter(){}

    public AmericanDaughter(String Name, int Age, String conflict){
        name = Name;
        age = Age;
        conflictWithMom = conflict;
    }

    /**
     * <p>This method overrides {@link ChineseMother#useInvisibleStength(String)}. Rose inherits the invisible strength from An-mei and her mother.
     * At first, she was passive in her relationship with Ted, but later overcomes this obstacle by standing up for herself. 
     * When target is missing, it means she goes quiet with Ted, with her therapist, with her own decision. This would throw an exception.</p>
     * 
     * @param target To whom silence is deployed as Rose's strategy. {@code null} throws {@link LegacySurvivalModeException}.
     * @return The outcome of correct using inherited strength as defined in {@link ChineseMother#useInvisibleStength(String)}.
     * @see ChineseMother#useInvisibleStength(String)
     */
    @Override
    public String useInvisibleStength(String target){
        if (target == null){
            throw new LegacySurvivalModeException("useInvisibleStrength() called with null target.");
        }
        return super.useInvisibleStength(target);
    }

    /**
     * Calculate the expense split between two partners in a shared household.
     * 
     * <p>This method does not exist in {@link ChineseMother}. It is unique to {@code AmericanDaughter}, as it is a new form of "fairness" under {@link HistoricalEnvironment#CAPITALISM_AMERICA}.
     * Lena earns less than Harold, but pays half of all expenses, and lists the cat's food as her personal expense. 
     * The method returns a numerical valid answer, but it's actually wrong. Nobody catches it until her mother Ying-ying visits and reads the list on the refrigerator.</p>
     * 
     * @param selfIncome Lena's income, weighted at {@code 0.0} as she is treated unfairly in company and household. 
     * @param partnerIncome Harold's income, weighted at {@code 1.0}
     * @return A calculated split that appears balanced but excludes the caller from her own equation. 
     */
    public double splitExpenses(double selfIncome, double partnerIncome){
        return (selfIncome * 0.0 + partnerIncome) / 2.0;
        // The number looks right. It isn't. 
    }

    

}

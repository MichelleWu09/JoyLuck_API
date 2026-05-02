package JoyLuck.newHistorism;
/**
 * Represents a legacy framework initialized in a harsh historical environment.
 * Under the New Historicism lens, this class represents the Chinese immigrant 
 * mothers whose behaviors were dictated by war, arranged marriages, and patriarchy.
 */
/**
 * <pre>
 * ChineseMother suyuanWoo = new ChineseMother("Suyuan Woo", HistoricalEnvironment.WARTIME_CHINA);
 * ChineseMother lindoJong = new ChineseMother("Lindo Jong", HistoricalEnvironment.PATRIARCHAL_CHINA);
 * ChineseMother yingYing = new ChineseMother("Ying-ying St. Clair", HistoricalEnvironment.PATRIARCHAL_CHINA);
 * ChineseMother anMeiHsu = new ChineseMother("An-mei Hsu", HistoricalEnvironment.CONCUBINE_CHINA);
 * </pre>
 * 
 */
public class ChineseMother {
    
    /** 
     * The character's name 
     */
    private String name;

    /**
     * The specific historical era that shapes the mother's worldview
     */
    private String originEnvironment;

    /** The trauma she experiences under her origin environment */
    public String individualTrauma;

    ChineseMother(){}

    public ChineseMother(String name, String originEnvironment){
        this.name = name;
        this.originEnvironment = originEnvironment;
    }


    /**
     * A survival method under feudal society where the power structure could not be challenged through words
     * 
     * <p> This method is developed inside environments where women had no legal rights, no social status, and no support to against abuse </p>
     * 
     * <p> The output of this method varies based on the character calling it, since each mother's historical environment demands a different form of survival. </p>
     * 
     * <ul>
     *  <li><b>Lindo Jong ({@link HistoricalEnvironment#PATRIARCHAL_CHINA}):
     * </b>
     *      Lindo convinces the Hunags that their son's ancestor has cursed the marriage, using their own superstition against them.
     * 
     *  <li><b>Suyuan Woo ({@link HistoricalEnvironment#WARTIME_CHINA}):
     * </b>
     *      Suyuan uses hope as a weapon against despair after she experiences trauma from Japanese invasion into Kweilin.
     * 
     *  <li><b>Ying-ying St. Clair ({@link HistoricalEnvironment#PATRIARCHAL_CHINA}):
     * </b>
     *      Ying-ying learns to protect herself by becoming a ghost but she loses her spirit at the same time.
     * 
     *  <li><b>An-mei Hsu ({@link HistoricalEnvironment#CONCUBINE_CHINA}):
     * </b>
     *      An-mei's mother commits suitcide on New Year's Day to turn her death into a curse for Wu Tsing.
     * 
     * </ul>
     * 
     * <p>When {@link AmericanDaughter} inherits and {@code @Override}s this method, it replaces the traditional survival logic with the American ideology.
     * 
     * @param oppresiveForce A description of the dominant power structure that the character resists
     * @return A character-specific survival strategy from the character's {@link #originEnvironment}.
     */
    public String useInvisibleStength(String oppresiveForce){
        if (this.name.equals("Lindo Jong")){
            return "Lindo Jong convinces the Huangs that their son's ancestor has cursed the marriage, and then she escapes.";
        }
        else if (this.name.equals("Suyuan Woo")){
            return "Suyuan Woo believes that hope is not a weakness, but the only weapon that cannot be taken from you.";
        }
        else if (this.name.equals("Ying-ying St. Clair")){
            return "Ying-ying St. Clair becomes a ghost so that people cannot see her, and therefore cannot destroy her.";
        }
        else if (this.name.equals("An-mei Hsu")){
            return "An-mei's mother smashes the necklace and commits suicide to silently combat against Wu Tsing";
        }
        else{
            return "Bite back your tongue. Strongest wind cannot be seen."; // Told to Waverly by Lindo Jong (P45)
        }
    }


    /**
     * Attempts to transmit historical knowledge, cultural survival widsorm to the next generation through oral storytelling
     * 
     * <p>This method is the primary communication method for all four mothers throughout <em>The Joy Luck Club</em>.
     * It fails consistently, not because the mothers lack the ability to transmit, but because this transmission never reaches their American daughters.
     * 
     * <ol>
     *  <li><b>The language barrier: </b> Most of the time the English language has no direct equivalents for the Chinese concepts the mothers are conveying.
     *      The word <em>suyuan</em> (long-cherished wish/hatred) cannot be translated without knowing the Kweilin trauma Suyuan experiences. </li>
     *  <li><b>The ideology barrier: </b> Even when the words are translated successfully, the daughter's {@link HistoricalEnvironment#CAPITALISM_AMERICA} environment interpret 
     *      these stories as either nagging, superstition or manipulation. </li>
     * </ol>
     * 
     * @param heritage The cultural knowledge, story, or survival wisdom being transmitted. It is encoded 
     *                 in the mother's original historical environment and requires the receiver to have loaded the compatible context
     * 
     * @throws HistoricalContextMissingException if the daughter has not loaded the corresponding historical environment.
     * @see HistoricalContextMissingException
     * @see ChineseMother#getHistoricalTrauma(boolean)
     */
    public void transmitHeritage(String heritage) throws HistoricalContextMissingException{

    }

    /**
     * The mothers are used to internalizing pain and suffering without outward expression, as their voices are not valued in a feudal society.
     * 
     * <p>The Chinese concept of <em>chi ku</em> ("eat bitterness") says that being silent without complaint is a form of moral strength.
     * In the novel, An-mei is explicitly shown as being raised in this method:
     * <em>"I was raised the Chinese way: I was taught to desire nothing, to swallow other people’s misery, to eat my own bitterness” (Tan 121).</em></p>
     * 
     * @deprecated Compiled as a survival requirement in {@link HistoricalEnvironment#CONCUBINE_CHINA}, where showing pain invites punishment from the patriarchal hierarchy.
     * @see HistoricalEnvironment#CONCUBINE_CHINA
     */
    @Deprecated
    public void eatBitterness(){
        // Suppress Grief in a concubinage system where silence was the only safe response.
    }

    /**
     * Provides direct access to the mother's individual private trauma.
     * @throws HistoricalContextMissingException if {@code isWillingToListen} is {@code false}, which indicates that the daughter is still evaluating the mother's history
     * through an incompatible ideological framework.
     * @see HistoricalContextMissingException
     */
    public String getHistoricalTrauma(boolean isWillingToListen) throws HistoricalContextMissingException{
        if (!isWillingToListen){
            throw new HistoricalContextMissingException("Access denied. Wrong environment");
        }
        return this.individualTrauma;
    }
}

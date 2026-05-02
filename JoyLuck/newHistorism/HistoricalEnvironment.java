package JoyLuck.newHistorism;
/**
 * Defines historical and political contexts that determine the behaviors of characters in <em>The Joy Luck Club</em>.
 * 
 * <p>Every method in {@link ChineseMother} is compiled inside one of the Chinese environments below. 
 * Every {@link LegacySurvivalModeException} occurs when those methods are executed inside {@link #CAPITALISM_AMERICA}.</p>
 * 
 * @see ChineseMother
 * @see AmericanDaughter
 * @see LegacySurvivalModeException
 * 
 */

public class HistoricalEnvironment {

    /**
     * Second Sino- Japanese War: A violent eight-year period (1937-1945) where China was invaded by Japan. 
     * Over 20 million Chinese citizens were killed or displaced by the invasion and it left a deep generational trauma.
     */
    public static final String WARTIME_CHINA = "1944_Japanese_Invasion";

    /**
     * Feudal patriarchy: In 1920s China, women had little agency, often forced into submission, concubinage, or arranged marriage at a very young age.
     */
    public static final String PATRIARCHAL_CHINA = "1920s_Patriarchal_Society";

    /**
     * Concubinage system: In China between 1920 and 1930, males could have multiple concubines, 
     * who were considered inferior to the primary wife, with their status declining based on their numbers.
     */
    public static final String CONCUBINE_CHINA = "1920s_Concubinage_System";

    /**
     * The modern American society in the 1980s that valued individualism, freedom, and capitalism.
     */
    public static final String CAPITALISM_AMERICA = "1980s_San_Francisco";

    /**
     * Life should be better, richer and fuller for everyone regardless of their social status, 
     * which attracted a lot of immigrants in the 1950s in search for a better life for their future generations.

     */
    public static final String AMERICAN_DREAM = "1980s_Immigrants";

}

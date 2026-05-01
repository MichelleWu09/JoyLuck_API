package JoyLuck.newHistorism;
/**
 * Thrown when an inherited survival method is executed under an environment where the threat it was designed to handle no longer exists.
 * 
 * <p>The methods of {@link ChineseMother} were compiled inside environments like 
 * {@link HistoricalEnvironment#CONCUBINE_CHINA}, {@link HistoricalEnvironment#PATRIARCHAL_CHINA} and {@link HistoricalEnvironment#WARTIME_CHINA}, where women
 * were taught to be silent and obedient.
 * When inherited by {@link AmericanDaughter} and executed inside {@link HistoricalEnvironment#CAPITALISM_AMERICA}, running the same method produces this exception,
 * not because the code itself is wrong, but the environment is incompatible.
 * 
 * @see ChineseMother
 * @see AmericanDaughter
 * @see HistoricalEnvironment
 *
 */
public class LegacySurvivalModeException extends RuntimeException{

    public LegacySurvivalModeException(String message){
        super(message);
    }

}

package JoyLuck.newHistorism;
/**
 * Thrown when the caller attempts to access a {@link ChineseMother}'s historical trauma 
 * without first loading the cultural and historical context in which it was produced
 * 
 * <p>This exception is thrown by {@link ChineseMother#getHistoricalTrauma(boolean)} when {@code isWillingToListen = false},
 * since it indicates that the daughter is evaluating her mother's history through a different historical environment
 * 
 * @see ChineseMother#getHistoricalTrauma(boolean)
 * @see LegacySurvivalModeException
 */

public class HistoricalContextMissingException extends Exception{

    public HistoricalContextMissingException(String message){
        super(message);
    }
}

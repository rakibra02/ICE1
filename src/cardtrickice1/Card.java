package cardtrickice1;

import java.util.Random;

/**
 * define card value and suits
 *
 *
 * @author sivagamasrinivasan
 * @author rana ibrahim 991655999, June 3rd
 */
public class Card {

    private int value;
    private String suits;
    public static final String[] SUITS = {"diamonds", "clubs", "spades", "hearts"};

    /**
     * @return the value
     */
    public int getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(int value) {
        this.value = value;
    }

    /**
     * @return the suits
     */
    public String getSuits() {
        return suits;
    }

    /**
     * @param suits the suits to set
     */
    public void setSuits(String suits) {
        this.suits = suits;
    }

    /**
     * @return the a random number between 1 - 13
     */
    public static int randomNumber() {
        int randomNumber = 1 + (int) (Math.random() * ((13 - 1) + 1));
        return randomNumber;
    }

    /**
     * @return a random suit
     */
    public static String randomSuit() {
        Random random = new Random();
        int randomSuit = random.nextInt(SUITS.length);
        return SUITS[randomSuit];
    }

}

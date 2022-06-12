/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */
package ca.sheridancollege.project;

/**
 * A class that models each Player in the game. Players have an identifier, which should be unique.
 *
 * * Game: BlackJack - A game that counts 21, this game is usually played against the dealer. In the game, A is considered either 1 or 11
 * depending on whichever is most beneficial for him. Face cards are all considered 10. The user starts with 2 cards and can either stay
 * or hit. If he stays and his two cards are higher than the dealer after the dealer makes his move, he wins otherwise he loses. If he hits,
 * he will gain an extra random card after which he can continue to choose between hit and stay. When the user finally decides to hit stay 
 * and it becomes the dealer's turn where if the dealer is lower than the user, he hits until his cards are either above or he busts with above 21.
 * As a side note, if user obtains 21 he automatically Wins regardless of what the dealer has.
 * 
 * GitHub: The Repository was made public, https://github.com/leungben/Group_5_BlackJack the link to repository
 * 
 * 
 * @author Benedict Leung ID: 991329385
 * @author Dillon Pennell ID: 991388695
 * @author Sehnajpreet kaur ID: 991655975 
 * @author Abhai babu  ID: 991659790 
 */
public abstract class Player {

    private String name; //the unique name for this player

    /**
     * A constructor that allows you to set the player's unique ID
     *
     * @param name the unique ID to assign to this player.
     */
    public Player(String name) {
        this.name = name;
    }

    /**
     * @return the player name
     */
    public String getName() {
        return name;
    }

    /**
     * Ensure that the playerID is unique
     *
     * @param name the player name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * The method to be overridden when you subclass the Player class with your specific type of Player and filled in
     * with logic to play your game.
     */
    public abstract void play();

}

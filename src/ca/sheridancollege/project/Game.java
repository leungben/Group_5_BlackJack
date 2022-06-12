/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */
package ca.sheridancollege.project;

import java.util.ArrayList;

/**
 * The class that models your game. You should create a more specific child of this class and instantiate the methods
 * given.
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
 * @author Benedict Leung ID: 991329385
 * @author Dillon Pennell ID: 991388695
 * @author Sehnajpreet kaur ID: 991655975 
 * @author Abhai babu  ID: 991659790 
 */
public abstract class Game {

    private final String name;//the title of the game
    private ArrayList<Player> players;// the players of the game

    public Game(String name) {
        this.name = name;
        players = new ArrayList();
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the players of this game
     */
    public ArrayList<Player> getPlayers() {
        return players;
    }

    /**
     * @param players the players of this game
     */
    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }

    /**
     * Play the game. This might be one method or many method calls depending on your game.
     */
    public abstract void play();

    /**
     * When the game is over, use this method to declare and display a winning player.
     */
    public abstract void declareWinner();

}//end class

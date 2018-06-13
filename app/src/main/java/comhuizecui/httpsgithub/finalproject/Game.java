package comhuizecui.httpsgithub.finalproject;


public class Game
{
    private String name;
    private String description;
    private int imageResourceId;

    public static final Game[] GAMES = {
            new Game("Angry chicken", "This is a game to draw with the hand, notch birds defeat the pig game!", R.drawable.angry_birds),
            new Game("Pokemon go", "A gaming game with VR cameras!", R.drawable.pokemon_go),
            new Game("minecraft", "This is a sandbox type game where you can create any way you want!", R.drawable.mc)
    };

    /**
     * Dink is the constructor for objects of type dink that stors
     * a name , a description, and an image resource ID for each dink
     * @param gameName is the name of the dink
     * @param gameDescriptopn is the description of the dink
     * @param drinkImageResourceId is the image resource ID of the dink
     * @return an object of class Dink
     */
    public Game(String gameName, String gameDescriptopn, int drinkImageResourceId)
    {
        name = gameName;
        description = gameDescriptopn;
        imageResourceId = drinkImageResourceId;
    }

    /**
     * getName return the name of the dink
     *
     * @param "" There are no parameters
     * @return a String repressenting the name of the dink
     */
    public String getName()
    {
        return name;
    }

    /**
     * getDescription return the description of the dink
     *
     * @param "" There are no parameters
     * @return a String repressenting the description of the dink
     */
    public String getDescription()
    {
        return description;
    }

    /**
     * getImageResourceId return the image resource ID of the dink
     *
     * @param "" There are no parameters
     * @return a String repressenting the resource ID of the dink
     */
    public int getImageResourceId()
    {
        return imageResourceId;
    }

    /**
     * toString return a String representation of the data held inside
     * the Dink class
     *
     * @param "" There are no parameters
     * @return a String repressenting the data within each Dink
     */
    public String toString()
    {
        return this.name;
    }
}

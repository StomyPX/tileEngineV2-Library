package px.tileEngineV2.core;

import px.tileEngineV2.graphics.Renderer;
import px.tileEngineV2.graphics.Texture;
import px.tileEngineV2.world.World;

/**An abstract template for platform-specific implementations of a GameCore, as visible
 * to the rest of the game library.
 * @author Michael Stopa */
public abstract class GameCore {
    
    // ++++ ++++ Data ++++ ++++
    
    public static GameCore instance;
    
    /**Current World */
    protected World world;
    /**Current Battle */
    //protected Battle battle;
    /**Current Conversation */
    //protected Conversation conversation;
    /**Current Menu */
    //protected Menu menu;
    /**Current HUD */
    //protected Hud hud;
    
    /**Current Player Data */
    //protected PlayerData playerData;
    /**Current GameMode */
    protected GameMode mode;
    /**Current Renderer */
    protected Renderer renderer;
    /**Currently used InputMaster object */
    protected InputMaster inputMaster;
    
    /**Time of last update loop (in milliseconds) */
    protected long lastTime;
    /**Indicates whether the Renderer is running on it's own animator, or as part of the
     * standard update loop. */
    protected boolean isVsynced = false;
    
    /**Indicates whether the program should print core function debug messages to
     * System.out. */
    protected boolean isDebuggingCore = false;
    
    private boolean isStarted = false;
    
    // ++++ ++++ Initialization ++++ ++++
    
    public GameCore() {
        instance = this;
    }
    
    public void assignRenderer(Renderer renderer) {
        this.renderer = renderer;
    }
    
    // ++++ ++++ Update Loop ++++ ++++
    
    public void initLoop() {
        if (!isStarted) {
            isStarted = true;
            renderer.start();
            lastTime = System.nanoTime() /1000;
            while (mode != GameMode.EXIT) {
                long currentTime = System.nanoTime() /1000;
                long elapsedTime = currentTime -= currentTime;
                
                update(elapsedTime);
                
                lastTime = System.nanoTime() /1000;
            }
        }
    }
    
    /**Updates all objects in the game state
     * @param elapsedTime Number of milliseconds since last update cycle. */
    public void update(long elapsedTime) {
        world.update(elapsedTime);
    }
    
    // ++++ ++++ Accessors ++++ ++++
    
    public static GameCore getInstance() {
        return instance;
    }
    
    public World getWorld() {
        return world;
    }
    
    public Renderer getRenderer() {
        return renderer;
    }
    
    public Texture getTexture(String filename) {
        return renderer.getTextureCache().getTexture(filename);
    }
}

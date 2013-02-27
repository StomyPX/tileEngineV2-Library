package px.tileEngineV2.world;

import px.tileEngineV2.graphics.Texture;

/**A single tile object making up part of the world, stores basic information for
 * underlying texture and collision data.
 * @author Michael Stopa */
public abstract class Tile {
    
    // ++++ ++++ Constants ++++ ++++
    
    public static final int TILE_SIZE = 64;
    
    // ++++ ++++ Data ++++ ++++
    
    /**Cannot enter the tile if this is true. */
    protected boolean isSolid;
    
    /**Texture drawn under other game objects. */
    protected Texture floor;
    /**Texture drawn sorted with other game objects. */
    protected Texture wall;
    /**Texture drawn over other game objects. */
    protected Texture roof;
    
    // ++++ ++++ Constructor ++++ ++++
    
    /**Standard constructor
     * @param floor Texture to be drawn under other in-game actors.
     * @param wall Texture to be drawn in-line with other in-game actors.
     * @param roof Texture to be drawn over other in-game actors.
     * @param isSolid An actor cannot enter a tile if this is true. */
    public Tile(Texture floor, Texture wall, Texture roof, boolean isSolid) {
        this.floor = floor;
        this.wall = wall;
        this.roof = roof;
        this.isSolid = isSolid;
    }
}

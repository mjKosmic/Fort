package world;

import org.newdawn.slick.Graphics;
import org.newdawn.slick.Color;

import java.util.Random;
import java.util.ArrayList;

public class TileMap
{
	public static int TILESIZE;

	Tile[][] tiles;
	
	public TileMap(int tilesize)
	{
		tiles = new Tile[100][60];
		
		for(int i = 0; i < tiles.length; i++)
		{
			for(int j = 0; j < tiles[0].length; j++)
			{
				tiles[i][j] = new Tile();
			}
		}
		
		this.TILESIZE = tilesize;
	
	}
	
	public void generateTileMap()
	{
		Random r = new Random();
		for(int i = 0; i < tiles.length; i++)
		{
			for(int j = 0; j < tiles[0].length; j++)
			{	
				int seed = r.nextInt(4);
				switch(seed)
				{
					case 0:
						tiles[i][j].setColor(Tile.BROWN);
						break;
					case 1:
						tiles[i][j].setColor(Tile.GRAY);
						break;
					case 2:
						tiles[i][j].setColor(Tile.GREEN);
						break;
					case 3:
						tiles[i][j].setColor(Tile.BLUE);
				
				}
			}
		}
	}
	
	public void render(Graphics g)
	{
		for(int i = 0; i < tiles.length; i++)
		{
			for(int j = 0; j < tiles[0].length; j++)
			{
				g.setColor(tiles[i][j].color);
				g.fillRect((float)(i * TILESIZE), (float) (j * TILESIZE), (float) ((i*TILESIZE) + TILESIZE), (float) ((j*TILESIZE) + TILESIZE));
			}	
		}
	}


}
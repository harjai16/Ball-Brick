package brickBracke;

import java.awt.*;



public class MapGenerator {
	public int map[][];
	public int brickWidth;
	public int brickHeight;

	public MapGenerator(int row, int col) {
		map = new int[row][col];
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[0].length; j++) {
				map[i][j] = 1;
			}
		}

		brickWidth = 540 / col;
		brickHeight = 150 / row;
	}
public static char[] createCipher(char[] cipher) {
		
	    char[] alphabet = new char[27];
	    int characterNumber = 97;
	    alphabet[0] = ' ';
	    for(int counter = 1; counter < alphabet.length;counter++)
	    {
	        char character = (char) characterNumber;
	        alphabet[counter] = character;
	        characterNumber++;  
	    }

	    for(int counter = 0; counter < alphabet.length;counter++)
	    {
	        int randomLocation = (int) (Math.random()*26);
	        char temporaryCharacter = alphabet[randomLocation];
	        alphabet[randomLocation] = alphabet[counter];
	        alphabet[counter] = temporaryCharacter;
	    }
	    return alphabet;
	}

	public void draw(Graphics2D g) {
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[0].length; j++) {
				if (map[i][j] > 0){
					g.setColor(Color.blue);
					
					g.drawString("a", j, j);
					
					g.fillRect(j * brickWidth + 80, i * brickHeight + 58, brickWidth,brickHeight);

					g.setStroke(new BasicStroke(3));
					g.setColor(Color.black);
					g.drawRect(j * brickWidth + 80, i * brickHeight + 58, brickWidth,brickHeight);
				}
			}
		}
	}
	public void setBrickValue(int value, int row, int col) {
		map[row][col] = value;
	}
}

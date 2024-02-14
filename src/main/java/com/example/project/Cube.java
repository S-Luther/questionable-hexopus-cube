package com.example.project;

public class Cube {

	static String[][] myCube = 
				    {
				        {
				            "r", "r", "r",
				            "r", "r", "r",
				            "r", "r", "r",
				        },	{
				            "b", "b", "b",
				            "b", "b", "b",
				            "b", "b", "b",
				        },	{
				            "o", "o", "o",
				            "o", "o", "o",
				            "o", "o", "o",
				        },	{
				            "g", "g", "g", 
				            "g", "g", "g",
				            "g", "g", "g",
				        },	{
				            "y", "y", "y",
				            "y", "y", "y",
				            "y", "y", "y",
				        },	{
				            "w", "w", "w",
				            "w", "w", "w",
				            "w", "w", "w",
				        },
				    };
	

	static void rotateFace(String[][] Cube, int face){
	        String Temp = null;
	        Temp = Cube[face][0];
	        Cube[face][0] = Cube[face][6];
	        Cube[face][6] = Cube[face][8];
	        Cube[face][8] = Cube[face][2];
	        Cube[face][2] = Temp;
	        Temp = Cube[face][1];
	        Cube[face][1] = Cube[face][3];
	        Cube[face][3] = Cube[face][7];
	        Cube[face][7] = Cube[face][5];
	        Cube[face][5] = Temp;
	} 

	public void printCurrentCube(String[][] theCube) {
		for (int x = 0; x < 6; x++){
	        	int z = -1;
	        	for (int y = 0; y < 3; y++){
		                z++;
		                System.out.print(theCube[x][z]);
		                System.out.print("|"); 
		                z++;
		                System.out.print(theCube[x][z]);
		                System.out.print("|");  
		                z++;
		                System.out.print(theCube[x][z]);
		                System.out.println("");    
	                
	            	}
	        	System.out.println("");    
		}
	}

	
	public static void main(final String[] args) {
		printCurrentCube(myCube);
	
	}

}


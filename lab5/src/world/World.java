package world;
import java.util.Random;

import organism.Organism;
import organism.*;

public class World
{
	private Organism[] array;
	public World(){
		int arraySize = 25;
		array = new Organism[arraySize];
		Random rand = new Random();
		for(int i = 0; i < arraySize; i++){
			int rand_int = rand.nextInt(12);
		switch(rand_int){
			case 0:	array[i] = new Tree();
				break;
			case 1:	array[i] = new Grass();
				break;
			case 2:	array[i] = new Caterpillar();
				break;
			case 3:	array[i] = new Bluejay();
				break;
			case 4:	array[i] = new Grasshopper();
				break;
			case 5:	array[i] = new Mouse();
				break;
			case 6:	array[i] = new Deer();
				break;		
			case 7:	array[i] = new Rabbit();
				break;
			case 8:	array[i] = new Squirrel();
				break;
			case 9:	array[i] = new Hawk();
				break;
			case 10:	array[i] = new Fox();
				break;
			case 11:	array[i] = new Wolf();
				break;
			default:
					break;
		}	
		}
		
	}
	public void print(){
		for(int i = 0; i < 5;i++){
			System.out.print("+----------------------------------------------------------------+\n");
			System.out.print("|            |            |            |            |            |\n");
			//System.out.printin("|" + array[i*5].print() +"|"+array[i*5+1].print()+"|"+array[i*5+2].print()+"|"+array[i*5+3].print()+"|"+array[i*5+4].print()+"|\n");
			array[i*5].print();
			System.out.print("|");
			array[i*5+1].print();
			System.out.print("|");
			array[i*5+2].print();
			System.out.print("|");
			array[i*5+3].print();
			System.out.print("|");
			array[i*5+4].print();
			System.out.print("|/n");
			System.out.print("|            |            |            |            |            |\n");
			if( i == 4){System.out.print("+----------------------------------------------------------------+\n");}
		}
	}
	public void iterate(){
		for(int i = 0; i < 25; i++){
			array[i].checkAlive(array,25);
		}
	}
	
	
	public static void main(String[] args){
		World map = new World();
		map.print();
		map.iterate();
		map.print();
	}
}

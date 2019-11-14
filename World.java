/**
 * @Xinyu Liu 200362878
 * @version     1.0                 
 * @date: 10/31/2019
 */
import java.util.Random;
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
			case 0:	array[i] = Tree();
				break;
			case 1:	array[i] = Grass();
				break;
			case 2:	array[i] = Caterpillar();
				break;
			case 3:	array[i] = Bluejay();
				break;
			case 4:	array[i] = Grasshopper();
				break;
			case 5:	array[i] = Mouse();
				break;
			case 6:	array[i] = Deer();
				break;		
			case 7:	array[i] = Rabbit();
				break;
			case 8:	array[i] = Squirrel();
				break;
			case 9:	array[i] = Hawk();
				break;
			case 10:	array[i] = Fox();
				break;
			case 11:	array[i] = Wolf();
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
			System.out.print("|"+array[i*5].print()+"|"+array[i*5+1].print()+"|"+array[i*5+2].print()+"|"+array[i*5+3].print()+"|"+array[i*5+4].print()+"|\n",);
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
		World map = new Wolrd();
		map.print();
		map.iterate();
		map.print();
	}
}

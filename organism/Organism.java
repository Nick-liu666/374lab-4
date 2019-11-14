/**
 * @Xinyu Liu 200362878
 * @version     1.0                 
 * @date: 10/31/2019
 */

public class Organism
{
	private string Name;
	private boolean Alive;
	private string Food_1;
	private string Food_2;
	private string Food_3;
	private string Food_4;
	public Organism(){
		Food_1 = Food_2 = Food_3 = Food_4 = "NULL";
		alive = true;
	}
	public Organism(string name){
		Name = name;
		alive = true;
		Food_1 = Food_2 = Food_3 = Food_4 = "NULL";
	}
	public Organism(string name, string food1){
		Name = name;
		alive = true;
		Food_1 = food1;
		Food_2 = Food_3 = Food_4 = "NULL";
	}	
	public Organism(string name, string food1, string food2){
		Name = name;
		alive = true;
		Food_1 = food1;
		Food_2 = food2;
		Food_3 = Food_4 = "NULL";
	}
	public Organism(string name, string food1, string food2, string food3){
		Name = name;
		alive = true;
		Food_1 = food1;
		Food_2 = food2;
		Food_3 = food3;
		Food_4 = "NULL";
	}
	public Organism(string name, string food1, string food2, string food3, string food4){
		Name = name;
		alive = true;
		Food_1 = food1;
		Food_2 = food2;
		Food_3 = food3;
		Food_4 = food4;
	}
	public boolean getAlive(){
		return Alive;
	}
	public void setAlive(boolean alive){
		Alive = alive;
	}
	public string getName(){
		return Name;
	}
	public print(){
		if(Alive){
			int length = Name.length();
			int leftspace = 12 - length;
			System.out.println(Name);
			while(leftspace != 0){
				System.out.println(" ");
				leftspace--;
			}
		}
		else{
			for(int i = 0; i < 12; i++){
				System.out.println(" ");
			}
		}
	}
	public void checkAlive(const &Organism[], int length){
		if(Name == "Tree" || Name == "Grass"){
			return;
		}
		boolean alive = false;
		string orgnismName = Organism[i].getName;
		for(int i = 0; i < length; i++){
			if(orgnismName == food_1 || orgnismName == food_2 || orgnismName == food_3 || orgnismName == food_4){
				return;
			}
		}
		this.setAlive(alive);
	}	
}

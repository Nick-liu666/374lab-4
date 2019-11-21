package organism;

public class Organism {
	private String Name;
	private boolean Alive;
	private String Food_1;
	private String Food_2;
	private String Food_3;
	private String Food_4;
	public Organism(){
		Food_1 = Food_2 = Food_3 = Food_4 = "NULL";
		Alive = true;
	}
	public Organism(String name){
		Name = name;
		Alive = true;
		Food_1 = Food_2 = Food_3 = Food_4 = "NULL";
	}
	public Organism(String name, String food1){
		Name = name;
		Alive = true;
		Food_1 = food1;
		Food_2 = Food_3 = Food_4 = "NULL";
	}	
	public Organism(String name, String food1, String food2){
		Name = name;
		Alive = true;
		Food_1 = food1;
		Food_2 = food2;
		Food_3 = Food_4 = "NULL";
	}
	public Organism(String name, String food1, String food2, String food3){
		Name = name;
		Alive = true;
		Food_1 = food1;
		Food_2 = food2;
		Food_3 = food3;
		Food_4 = "NULL";
	}
	public Organism(String name, String food1, String food2, String food3, String food4){
		Name = name;
		Alive = true;
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
	public String getName(){
		return Name;
	}
	public void print(){
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
	public void checkAlive(Organism[] organism, int length){
		if(Name == "Tree" || Name == "Grass"){
			return;
		}
		boolean Alive = false;
		for(int i = 0; i < length; i++){
			String orgnismName = organism[i].getName();
			if(orgnismName == Food_1 || Food_2 != "NULL" && (orgnismName == Food_2 || Food_3!="NULL" && (orgnismName == Food_3 || Food_4 != "NULL" && orgnismName == Food_4))){
				return;
			}
		}
		this.setAlive(Alive);
	}

}
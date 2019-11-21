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
			System.out.print(Name);
			while(leftspace != 0){
				System.out.print(" ");
				leftspace--;
			}
		}
		else{
			for(int i = 0; i < 12; i++){
				System.out.print(" ");
			}
		}
	}
	public boolean checkAround(Organism[] organism, int locationIndex,int arraySize, int rowNum){
		boolean upPosition = (locationIndex-rowNum) >= 0  && checkFood(organism[locationIndex-rowNum].getName());
		boolean downPosition = (locationIndex+rowNum) < arraySize && checkFood(organism[locationIndex+rowNum].getName());
		boolean leftPosition = (locationIndex-1) >=0 && checkFood(organism[locationIndex-1].getName());
		boolean rightPosition = (locationIndex+1) < arraySize && checkFood(organism[locationIndex+1].getName());
		
		boolean topLeftPosition = (locationIndex-rowNum+1) >= 0 && checkFood(organism[locationIndex-rowNum+1].getName());
		boolean topRightposition = (locationIndex-rowNum-1) >= 0 && checkFood(organism[locationIndex-rowNum-1].getName());
		boolean downLeftPosition = (locationIndex+rowNum+1) < arraySize && checkFood(organism[locationIndex+rowNum+1].getName());
		boolean downRightPosition = (locationIndex+rowNum-1) < arraySize && checkFood(organism[locationIndex+rowNum-1].getName());
		if(upPosition == true || downPosition == true || leftPosition == true || rightPosition == true || topLeftPosition == true|| topRightposition == true|| downLeftPosition == true|| downRightPosition == true) {
			return true;
		}
		return false;
	}
	public boolean checkFood(String orgnismName){
		if(orgnismName == Food_1 || Food_2 != "NULL" && (orgnismName == Food_2 || Food_3!="NULL" && (orgnismName == Food_3 || Food_4 != "NULL" && orgnismName == Food_4))){
			return true;
		}
		return false;
	}
	public void FindFood(Organism[] organism, int length, int locationIndex, int arraySize, int rowNum){
		if(Name == "Tree" || Name == "Grass"){
			return;
		}
		if(checkAround(organism,locationIndex,arraySize,rowNum)) {
			return;
		}
		else {
			Alive = false;
		}
	}
}
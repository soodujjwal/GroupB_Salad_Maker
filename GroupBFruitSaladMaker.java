package Assignment_4;

import java.util.Scanner;

public class GroupBFruitSaladMaker {

	public static void main(String[] args) {
		
	  Scanner input = new Scanner(System.in);
	  
	  System.out.println("Enter how many grams of pineapple you want: ");
	  double pineapple = input.nextDouble();
	  System.out.println("Enter how many grams of cherry you want: ");
	  double cherry = input.nextDouble();
	  System.out.println("Enter how many grams of apple you want");
	  double apple = input.nextDouble();
	  System.out.println("Enter how many grams of dragonfruit you want.");
	  double Dragonfruit = input.nextDouble();
		
		
		
 if(PineApple <= 0){
	show = "Cherry, DragonFruit, and Banana\n";
	if(Cherry <= 0){
		show = "DragonFruit, and Banana\n";
		if(DragonFruit <= 0){
			show = "Banana\n";
			if(Apple <= 0){
				show = "Nothing Selected :(\n";
			}
		}
	}
}
		else{
			show = "PineApple, Cherry, DragonFruit, and Banana\n";
			if(Cherry <= 0){
				show = "PineApple, DragonFruit, and Banana\n";
			}
			else{
				show = "PineApple, Cherry, DragonFruit, and Banana\n";
				if(DragonFruit <= 0){
					show = "PineApple, Cherry, and Banana\n";
				}
				else{
					show = "PineApple, Cherry, DragonFruit, and Banana\n";
					if(Apple <= 0){
						show = "PineApple, Cherry, and DragonFruit\n";
					}
					else{
						show = "PineApple, Cherry, DragonFruit, and Apple\n";
					}
				}
			}
		}
		


	  

	}

}

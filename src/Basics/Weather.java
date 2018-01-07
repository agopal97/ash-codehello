package Basics;

public class Weather {
	// this program will give suggestions on what to wear based on the weather.
	public static void main(String[] args) {
		int Temprature = 45;
		String suncondition = "overcast";
		
		if(Temprature > 80) {
			System.out.println("Its pleasent: Wear shorts and T-shirt");
		}
		else if ((Temprature > 60) && (suncondition== "sunny")) {
			System.out.println("Its a little cooler.Perhaps wear a long sleeve shirt");
			System.out.println("Wear a hat to keep the sun out of your eyes");
			
		}
		else if ((Temprature > 50) || (suncondition == "overcast")) {
			System.out.println("This is a cool day so make sure to wear warmer cloths");
		}
		else {
			System.out.println("looks like a cold day, Bring a sweater ");
		}
	}
}

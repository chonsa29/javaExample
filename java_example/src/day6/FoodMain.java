package day6;

public class FoodMain {
	public static void main(String[] args) {
		Food beer = new Food("맥주",3000);
		beer.setPrice(3500);
		
		System.out.println(beer.getPrice());
	}
}
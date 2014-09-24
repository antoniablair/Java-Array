public class animalarray {
	public static void main(String [] args) {
		String [] animals = new String[4];

		//Add animals to the array
		animals[0] = "cheetah";
		animals[1] = "leopard";
		animals[2] = "donkey";
		animals[3] = "camel";

		System.out.println("The third animal is: "+animals[3]);

		int size = animals.length;
		System.out.println("The size of the animal array is "+ size);
	}
}
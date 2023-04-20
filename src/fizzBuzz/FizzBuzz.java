package fizzBuzz;

public class FizzBuzz {

	private static final int[] numSpeciaux = { 3, 5 };
	private static final String[] traduction = { "fizz", "buzz" };

	public String fizzBuzz(int num) {
		for (int i = 0; i < numSpeciaux.length; i++) {
			if (num == numSpeciaux[i])
				return traduction[i];
		}
		return Integer.toString(num);
	}

}

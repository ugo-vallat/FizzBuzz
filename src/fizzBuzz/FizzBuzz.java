package fizzBuzz;

public class FizzBuzz {

	private static final int[] numSpeciaux = { 3, 5 };
	private static final String[] traduction = { "fizz", "buzz" };

	public String fizzBuzz(int num) {
		StringBuilder resultat = new StringBuilder();
		for (int i = 0; i < numSpeciaux.length; i++) {
			if (num % numSpeciaux[i] == 0)
				resultat.append(traduction[i]);
		}
		if (!resultat.isEmpty())
			return resultat.toString();
		return Integer.toString(num);
	}

}

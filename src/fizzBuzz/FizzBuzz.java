package fizzBuzz;

public class FizzBuzz {

	private static final String FIZZ = "fizz";

	public String fizzBuzz(int num) {
		if (num == 3)
			return FIZZ;
		return Integer.toString(num);
	}

}

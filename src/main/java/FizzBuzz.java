
public class FizzBuzz {

	public String say(int num) {

		if (isFizzBuzz(num)) {
			return "FizzBuzz";
		}

		if (isFizz(num)) {
			return "Fizz";
		}

		if (isBuzz(num)) {
			return "Buzz";
		}
		return "" + num;

	}

	private boolean isFizzBuzz(int num) {
		return num % 3 == 0 && num % 5 == 0;
	}

	private boolean isBuzz(int num) {
		return num % 5 == 0;
	}

	private boolean isFizz(int num) {
		return num % 3 == 0;
	}

}

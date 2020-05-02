package org.concordia.evaluations;

public class EvaluatePrime extends Evaluation {

	public EvaluatePrime() {
		this.baseValue = -1; // Will not be used
		this.stringValue = "Prime";
	}
	
	@Override
	public boolean Evaluate(int number) {
		return isPrime(number);
	}
	
	private boolean isPrime(int n) {
		if (n <= 1) {
            return false;
        }
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
	}
}

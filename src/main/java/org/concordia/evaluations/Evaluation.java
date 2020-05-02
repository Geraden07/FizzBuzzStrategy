package org.concordia.evaluations;

public abstract class Evaluation {
	protected int baseValue;
	protected String stringValue;
	
	public boolean Evaluate(int number) {
		return number % baseValue == 0;
	}
	
	public String getString() {
		return stringValue;
	}
	
}

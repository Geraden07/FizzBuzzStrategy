package org.concordia;

import java.util.ArrayList;
import java.util.List;

import org.concordia.evaluations.EvaluateDivisible3;
import org.concordia.evaluations.EvaluateDivisible5;
import org.concordia.evaluations.Evaluation;

public class Main {

	public static void main(String[] args) {

		int start = 1;
		int stop = 20;

		try {
			List<Evaluation> evaluations = new ArrayList<Evaluation>();
			evaluations.add(new EvaluateDivisible3());
			evaluations.add(new EvaluateDivisible5());

			for (int n = start; n <= stop; n++) {
				StringBuilder sb = new StringBuilder();

				sb.append(String.format("%5d: ", n));

				boolean isEmpty = true;
				for (Evaluation e : evaluations) {
					if (e.Evaluate(n) == true) {
						sb.append(e.getString());
						isEmpty = false;
					}
				}

				if (isEmpty == true) {
					sb.append(n);
				}

				System.out.println(sb.toString());
			}

		} catch (Exception e) {
			System.out.println("Sorry an error has occurred.");
			System.out.println("Error details:");
			System.out.println(e.getMessage());
			e.printStackTrace(System.out);
		}
	}
}

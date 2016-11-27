package org.univoulu.tol.sqatlab.sudoku;

public class SudokuVerifier {

	public int verify(String candidateSolution) {
		int result = 0;
		char[] candidateSolutionArray = candidateSolution.toCharArray();

		for (int i = 0; i < 81; i++) {
			if (isInvalidDigit(candidateSolutionArray[i])) {
				result = -1;
			}
		}
		
		
		
		if(candidateSolutionArray[0] == candidateSolutionArray[1]) {
			result = -3;
		} else if(candidateSolutionArray[0] == candidateSolutionArray[2]) {
			result = -3;
		} else if(candidateSolutionArray[0] == candidateSolutionArray[3]) {
			result = -3;
		}

		return result;
	}

	private boolean isInvalidDigit(char candidateSolution) {
		boolean result = false;

		if (candidateSolution < '1' || candidateSolution > '9') {
			result = true;
		}

		return result;
	}
	
}

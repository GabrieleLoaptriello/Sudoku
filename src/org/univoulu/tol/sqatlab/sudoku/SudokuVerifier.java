package org.univoulu.tol.sqatlab.sudoku;

public class SudokuVerifier {

	public int verify(String candidateSolution) {
		int result = 0;
		char[] candidateSolutionArray = candidateSolution.toCharArray();
		
		for(int i = 0; i < 81; i++) {
			if(isInvalidDigit(candidateSolutionArray[i])) {
				result = -1;
			}
		}
		
		/*
		if(isInvalidDigit(candidateSolutionArray[0])) {
			result = -1;
		} else if(isInvalidDigit(candidateSolutionArray[1])) {
			result = -1;
		} else if(isInvalidDigit(candidateSolutionArray[2])) {
			result = -1;
		}*/
		
		return result;
	}
	
	private boolean isInvalidDigit(char candidateSolution) {
		boolean result = false;
		
		if(candidateSolution < '1' || candidateSolution > '9') {
			result = true;
		}
		
		return result;
	}
}

package org.univoulu.tol.sqatlab.sudoku;

public class SudokuVerifier {

	public int verify(String candidateSolution) {
		int result = 0;
		char[] candidateSolutionArray = candidateSolution.toCharArray();
		
		if(candidateSolutionArray[0] < '1' || candidateSolutionArray[0] > '9') {
			result = -1;
		} else if(candidateSolutionArray[1] < '1' || candidateSolutionArray[1] > '9') {
			result = -1;
		} else if(candidateSolutionArray[2] < '1' || candidateSolutionArray[2] > '9') {
			result = -1;
		}
		
		return result;
	}
}

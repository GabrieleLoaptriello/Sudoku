package org.univoulu.tol.sqatlab.sudoku;

public class SudokuVerifier {

	public int verify(String candidateSolution) {
		int result = 0;
		int row = 0;
		int splitRow = 9;
		int columnSplit = 9;
		int column = 0; // indice del primo elemento della colonna
		int columnIndex = columnSplit; // indice che scorrerà gli elementi della
										// colonna
		char[] candidateSolutionArray = candidateSolution.toCharArray();

		for (int i = 0; i < 81; i++) {
			if (isInvalidDigit(candidateSolutionArray[i])) {
				result = -1;
			}
		}

		while (row < 81) {
			for (int i = row; i < row + splitRow; i++) {
				for (int j = i + 1; j < row + splitRow; j++) {
					if (candidateSolutionArray[i] == candidateSolutionArray[j]) {
						result = -3;
					}
				}
			}
			row += splitRow;
		}

		while (columnIndex <= 72) {

			if (candidateSolutionArray[0] == candidateSolutionArray[columnIndex]) {
				result = -4;
			}
			columnIndex += columnSplit;
		}

		/*
		 * if(candidateSolutionArray[0] == candidateSolutionArray[9]) { result =
		 * -4; } else if(candidateSolutionArray[0] ==
		 * candidateSolutionArray[18]) { result = -4; } else
		 * if(candidateSolutionArray[0] == candidateSolutionArray[27]) { result
		 * = -4; } else if(candidateSolutionArray[0] ==
		 * candidateSolutionArray[36]) { result = -4; }
		 */

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

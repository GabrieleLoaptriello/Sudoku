package org.univoulu.tol.sqatlab.sudoku;

import java.util.ArrayList;
import java.util.List;

/*   0 1 2   3 4 5   6 7 8
 * |-----------------------|
 * | 4 1 7 | 3 6 9 | 8 2 5 | 0
 * | 6 3 2 | 1 5 8 | 9 4 7 | 1
 * | 9 5 8 | 7 2 4 | 3 1 6 | 2
 * |-------+-------+-------|
 * | 8 2 5 | 4 3 7 | 1 6 9 | 3 
 * | 7 9 1 | 5 8 6 | 4 3 2 | 4 
 * | 3 4 6 | 9 1 2 | 7 5 8 | 5
 * |-------+-------+-------|
 * | 2 8 9 | 6 4 3 | 5 7 1 | 6 
 * | 5 7 3 | 2 9 1 | 6 8 4 | 7
 * | 1 6 4 | 8 7 5 | 2 9 3 | 8
 * | —--------------------|
 */

public class SudokuVerifier {

	public int verify(String candidateSolution) {
		final int LAST_ROW_INDEX = 8;

		int result = 0;
		int subGridRow = 0;
		int row = 0;
		int splitRow = 9;
		int columnSplit = 9;
		int column = 0; // indice del primo elemento della colonna
		int columnElement = 0;
		int columnEnd = 72;
		char[] candidateSolutionArray = candidateSolution.toCharArray();

		for (int i = 0; i < 81; i++) {
			if (isInvalidDigit(candidateSolutionArray[i])) {
				result = -1;
			}
		}

		char[] firstSubGrid = getSubGrid(candidateSolutionArray);

		for (int j = 0; j < 8; j++)
			for (int i = j + 1; i < 9; i++) {
				if (firstSubGrid[j] == firstSubGrid[i] && result != -1) {
					result = -2;
				}
			}
		
		if(candidateSolutionArray[3] == candidateSolutionArray[4]) {
			result = -2;
		} else if(candidateSolutionArray[3] == candidateSolutionArray[5]) {
			result = -2;
		}

		/*
		 * while (row < 81) { for (int i = row; i < row + LAST_ROW_INDEX; i++) {
		 * for (int j = i + 1; j < row + splitRow; j++) { if
		 * (candidateSolutionArray[i] == candidateSolutionArray[j] && result !=
		 * -2) { result = -3; } } } row += splitRow; }
		 * 
		 * while (columnElement <= columnEnd) { int columnIndex = columnElement
		 * + columnSplit; while (columnIndex <= columnEnd) { if
		 * (candidateSolutionArray[columnElement] ==
		 * candidateSolutionArray[columnIndex] && result != -2 && result != -3)
		 * { result = -4; } columnIndex += columnSplit; } columnElement +=
		 * columnSplit; }
		 * 
		 * if (candidateSolutionArray[1] == candidateSolutionArray[10]) { result
		 * = -4; } else if (candidateSolutionArray[1] ==
		 * candidateSolutionArray[19]) { result = -4; } else if
		 * (candidateSolutionArray[1] == candidateSolutionArray[28]) { result =
		 * -4; } else if (candidateSolutionArray[1] ==
		 * candidateSolutionArray[37]) { result = -4; }
		 */

		return result;
	}

	private boolean isInvalidDigit(char candidateSolution) {
		return (candidateSolution < '1' || candidateSolution > '9') ? true : false;
	}

	private char[] getSubGrid(char[] array) {
		char[] subGrid = new char[9];
		int j = 0;
		int[] limitList = { 2, 11, 20 };
		int k = 0;
		int i = 0;

		while (j <= 20) {
			subGrid[i++] = array[j];
			if (j == limitList[k]) {
				j += 6;
				k++;
			}
			j++;
		}
		return subGrid;
	}
}

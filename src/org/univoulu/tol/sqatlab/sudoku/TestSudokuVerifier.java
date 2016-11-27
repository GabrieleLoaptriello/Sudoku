package org.univoulu.tol.sqatlab.sudoku;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestSudokuVerifier {

	@Test
	public void firstCellContainsDigitsBetween1and9() {
		SudokuVerifier sudokuVerifier = new SudokuVerifier();
		
		assertEquals(sudokuVerifier.verify("017369825632158947958724316825437169791586432346912758289643571573291684164875293"), -1);
	}
	
	@Test
	public void secondCellContainsDigitsBetween1and9() {
		SudokuVerifier sudokuVerifier = new SudokuVerifier();
		
		assertEquals(sudokuVerifier.verify("407369825632158947958724316825437169791586432346912758289643571573291684164875293"), -1);
	}
	
	@Test
	public void thirdCellContainsDigitsBetween1and9() {
		SudokuVerifier sudokuVerifier = new SudokuVerifier();
		
		assertEquals(sudokuVerifier.verify("410369825632158947958724316825437169791586432346912758289643571573291684164875293"), -1);
	}
 
}

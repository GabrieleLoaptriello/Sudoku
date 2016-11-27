package org.univoulu.tol.sqatlab.sudoku;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestSudokuVerifier {

	private SudokuVerifier sudokuVerifier;
	
	@Before
	public void setUp() {
		
		this.sudokuVerifier = new SudokuVerifier();
	}
	
	@Test
	public void firstCellContainsDigitsBetween1and9() {
		
		assertEquals(sudokuVerifier.verify("017369825632158947958724316825437169791586432346912758289643571573291684164875293"), -1);
	}
	
	@Test
	public void secondCellContainsDigitsBetween1and9() {
		
		assertEquals(sudokuVerifier.verify("407369825632158947958724316825437169791586432346912758289643571573291684164875293"), -1);
	}
	
	@Test
	public void thirdCellContainsDigitsBetween1and9() {
		
		assertEquals(sudokuVerifier.verify("410369825632158947958724316825437169791586432346912758289643571573291684164875293"), -1);
	}
	
	@Test
	public void AnyCellMayContainsInvalidDigits() {
		
		assertEquals(sudokuVerifier.verify("417369825632158947958724316820437169791586432346912758289643571573291684164875293"), -1);
	}
 
}

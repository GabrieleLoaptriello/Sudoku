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
	public void firstCellDoesNotContainsDigitsBetween1and9() {

		assertEquals(sudokuVerifier
				.verify("017369825632158947958724316825437169791586432346912758289643571573291684164875293"), -1);
	}

	@Test
	public void secondDoesNotCellContainsDigitsBetween1and9() {

		assertEquals(sudokuVerifier
				.verify("407369825632158947958724316825437169791586432346912758289643571573291684164875293"), -1);
	}

	@Test
	public void thirdCellDoesNotContainsDigitsBetween1and9() {

		assertEquals(sudokuVerifier
				.verify("410369825632158947958724316825437169791586432346912758289643571573291684164875293"), -1);
	}

	@Test
	public void CellsDoNotRespectFirstRule() {

		assertEquals(sudokuVerifier
				.verify("417369825632158947958724316820437169791586432346912758289643571573291684164875293"), -1);
	}

	@Test
	public void firstElementInFirstRowIsEqualSecond() {

		assertEquals(sudokuVerifier
				.verify("447369825632158947958724316825437169791586432346912758289643571573291684164875293"), -3);
	}
	
	@Test
	public void firstElementInFirstRowIsEqualThird() {
		assertEquals(sudokuVerifier
				.verify("414369825632158947958724316825437169791586432346912758289643571573291684164875293"), -3);
	}
	
	@Test
	public void firstElementInFirstRowIsEqualFourth() {
		assertEquals(sudokuVerifier
				.verify("417469825632158947958724316825437169791586432346912758289643571573291684164875293"), -3);
	}
}

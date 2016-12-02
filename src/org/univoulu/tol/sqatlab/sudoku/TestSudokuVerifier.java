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
	public void firstElementInSubGridIsEqualSecond() {
		assertEquals(sudokuVerifier
				.verify("447369825632158947958724316825437169791586432346912758289643571573291684164875293"), -2);
	}

	@Test
	public void firstElementInSubGridIsEqualThird() {
		assertEquals(sudokuVerifier
				.verify("414369825632158947958724316825437169791586432346912758289643571573291684164875293"), -2);
	}

	@Test
	public void firstElementInSubGridIsEqualFourth() {
		assertEquals(sudokuVerifier
				.verify("417369825432158947958724316825437169791586432346912758289643571573291684164875293"), -2);
	}

	@Test
	public void firstElementInSubGridIsEqualFifth() {
		assertEquals(sudokuVerifier
				.verify("417369825432158947958724316825437169791586432346912758289643571573291684164875293"), -2);
	}

	@Test
	public void firstElementInSubGridIsEqualSixth() {
		assertEquals(sudokuVerifier
				.verify("417369825642158947958724316825437169791586432346912758289643571573291684164875293"), -2);
	}

	@Test
	public void firstElementInSubGridIsEqualSeventh() {
		assertEquals(sudokuVerifier
				.verify("417369825634158947958724316825437169791586432346912758289643571573291684164875293"), -2);
	}

	@Test
	public void firstElementInSubGridIsEqualEighth() {
		assertEquals(sudokuVerifier
				.verify("417369825632158947458724316825437169791586432346912758289643571573291684164875293"), -2);
	}

	@Test
	public void secondElementInSubGridIsEqualThird() {
		assertEquals(sudokuVerifier
				.verify("411369825632158947958724316825437169791586432346912758289643571573291684164875293"), -2);
	}

	@Test
	public void secondElementInSubGridIsEqualFourth() {
		assertEquals(sudokuVerifier
				.verify("417369825132158947958724316825437169791586432346912758289643571573291684164875293"), -2);
	}
	
	@Test
	public void secondElementInSubGridIsEqualFifth() {
		assertEquals(sudokuVerifier
				.verify("417369825612158947958724316825437169791586432346912758289643571573291684164875293"), -2);
	}
	
	@Test
	public void firstElementInSecondSubGridIsEqualSecond() {
		assertEquals(sudokuVerifier.verify("417339825632158947958724316825437169791586432346912758289643571573291684164875293"), -2);
	}
	
	@Test
	public void firstElementInSecondSubGridIsEqualThird() {
		assertEquals(sudokuVerifier.verify("417363825632158947958724316825437169791586432346912758289643571573291684164875293"), -2);
	}
	
	@Test
	public void firstElementInSecondSubGridIsEqualFourth() {
		assertEquals(sudokuVerifier.verify("417369825632358947958724316825437169791586432346912758289643571573291684164875293"), -2);
	}
	
	@Test
	public void firstElementInSecondSubGridIsEqualFifth() {
		assertEquals(sudokuVerifier.verify("417369825632138947958724316825437169791586432346912758289643571573291684164875293"), -2);
	}
	
	@Test
	public void firstElementInSecondSubGridIsEqualSixth() {
		assertEquals(sudokuVerifier.verify("417369825632153947958724316825437169791586432346912758289643571573291684164875293"), -2);
	}

	@Test
	public void firstElementInSecondSubGridIsEqualSeventh() {
		assertEquals(sudokuVerifier.verify("417369825632158947958324316825437169791586432346912758289643571573291684164875293"), -2);
	}
	
	/*
	 * @Test public void firstElementInFirstRowIsEqualSecond() {
	 * 
	 * assertEquals(sudokuVerifier .verify(
	 * "447369825632158947958724316825437169791586432346912758289643571573291684164875293"
	 * ), -2); }
	 * 
	 * @Test public void firstElementInFirstRowIsEqualThird() {
	 * assertEquals(sudokuVerifier .verify(
	 * "414369825632158947958724316825437169791586432346912758289643571573291684164875293"
	 * ), -2); }
	 * 
	 * @Test public void firstElementInFirstRowIsEqualFourth() {
	 * assertEquals(sudokuVerifier .verify(
	 * "417469825632158947958724316825437169791586432346912758289643571573291684164875293"
	 * ), -2); }
	 * 
	 * @Test public void firstElementInFirstColumnIsEqualSecond() {
	 * assertEquals(sudokuVerifier .verify(
	 * "417469825432158947958724316825437169791586432346912758289643571573291684164875293"
	 * ), -4); }
	 * 
	 * @Test public void firstElementInFirstColumnIsEqualThird() {
	 * assertEquals(sudokuVerifier .verify(
	 * "417469825632158947458724316825437169791586432346912758289643571573291684164875293"
	 * ), -4); }
	 * 
	 * @Test public void firstElementInFirstColumnIsEqualFourth() {
	 * assertEquals(sudokuVerifier .verify(
	 * "417469825632158947958724316425437169791586432346912758289643571573291684164875293"
	 * ), -4); }
	 * 
	 * @Test public void firstElementInFirstColumnIsEqualFifth() {
	 * assertEquals(sudokuVerifier .verify(
	 * "417469825632158947958724316825437169491586432346912758289643571573291684164875293"
	 * ), -2); }
	 * 
	 * @Test public void SecondElementInFirstColumnIsEqualThird() {
	 * assertEquals(sudokuVerifier .verify(
	 * "417369825632158947658724316825437169791586432346912758289643571573291684164875293"
	 * ), -4); }
	 * 
	 * @Test public void firstElementInSecondColumnIsEqualSecond() {
	 * assertEquals(sudokuVerifier .verify(
	 * "417469825612158947958724316825437169791586432346912758289643571573291684164875293"
	 * ), -4); }
	 * 
	 * @Test public void firstElementInSecondColumnIsEqualThird() {
	 * assertEquals(sudokuVerifier .verify(
	 * "417369825632158947918724316825437169791586432346912758289643571573291684164875293"
	 * ), -4); }
	 * 
	 * @Test public void firstElementInSecondColumnIsEqualFourth() {
	 * assertEquals(sudokuVerifier .verify(
	 * "417369825632158947958724316815437169791586432346912758289643571573291684164875293"
	 * ), -4); }
	 * 
	 * @Test public void firstElementInSecondColumnIsEqualFifth() {
	 * assertEquals(sudokuVerifier .verify(
	 * "417369825632158947958724316825437169711586432346912758289643571573291684164875293"
	 * ), -4); }
	 */
}

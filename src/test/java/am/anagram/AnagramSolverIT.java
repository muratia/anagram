/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package am.anagram;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ahmet
 */
public class AnagramSolverIT {

    private static AnagramSolver anagramSolver;

    public AnagramSolverIT() {

    }

    @BeforeClass
    public static void setUpClass() {
        anagramSolver = new AnagramSolver();
    }

    @AfterClass
    public static void tearDownClass() {
        anagramSolver = null;
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }
/**
 * The test passes because the size and the word is anagram 
 *  */
    @Test
    public void testAnagramEqualWords() {
       

        String prm1 = "Naman";
        String prm2 = "Naman";
        /// 
        assertTrue(anagramSolver.isAnagramSort(prm1, prm2));

    }

    /***
     * Test fails because the words are not equal in size. 
     * It throws an exception NotEqualStringsException
     */
    @Test
    public void testAnagramNotEqualWords() {
        String prm1 = "Naman";
        String prm2 = "Nama";
       
        assertTrue(anagramSolver.isAnagramSort(prm1, prm2));
    }

    @Test
    public void testNotSameWords() {
        String prm1 = "Naman";
        String prm2 = "Namam";
        
        assertTrue(anagramSolver.isAnagramSort(prm1, prm2));
    }

}

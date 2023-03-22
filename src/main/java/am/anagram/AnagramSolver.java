/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package am.anagram;

import am.anagram.exception.NotEqualStringsException;
import java.util.Arrays;

/**
 *
 * @author ahmet
 */
public class AnagramSolver {
    
    boolean isAnagramSort(String string1, String string2) throws NotEqualStringsException{
    if (string1.length() != string2.length()) {
        throw new NotEqualStringsException("The given strings are not equal");
                    
    }
    char[] a1 = string1.toCharArray();
    char[] a2 = string2.toCharArray();
    Arrays.sort(a1);
    Arrays.sort(a2);
    return Arrays.equals(a1, a2);
}
    
}

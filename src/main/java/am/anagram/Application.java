/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package am.anagram;

import am.anagram.exception.NotEqualStringsException;

/**
 *
 * @author ahmet
 */
public class Application {
    public static void main(String[] args) {
        AnagramSolver anagramSolver = new AnagramSolver();
        try {
            
            String prm1, prm2;
            prm1 = "Naman";
            prm2 = "Naman";
            if(anagramSolver.isAnagramSort(prm1, prm2)){
                System.out.println("yes it is");
            }else{
                System.out.println("Sorry, it is not anagram");
            }
        } catch (NotEqualStringsException e) {
            System.out.println("An exeption occured: "+ e.getLocalizedMessage());
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package am.anagram.exception;

/**
 *
 * @author ahmet
 */
public class NotEqualStringsException extends RuntimeException{
    public NotEqualStringsException(String prm){
        super(prm);
    }
}

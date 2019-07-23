package com;

import com.googlecode.zohhak.api.TestWith;
import com.googlecode.zohhak.api.runners.ZohhakRunner;
import org.junit.runner.RunWith;
import static org.junit.Assert.assertEquals;

@RunWith(ZohhakRunner.class)
public class StringejerTest {
    private Stringejer stringejer = new Stringejer();

    @TestWith({"Alice, Hello Alice!","Bob, Hello Bob!","X, Hello X!"})
    public void returnHelloWorld (String name, String expected){
        String resultado = stringejer.helloName(name);
        assertEquals(resultado,expected);
    }

    @TestWith({"<<>>,Yay,<<Yay>>", "<<>>,WooHoo,<<WooHoo>>", "[[]], word,[[word]]"})
    public void shouldMakeOutWord(String out,String word, String expected){
        String resultado;
        resultado = stringejer.makeOutWord(out,word);
        assertEquals(resultado, expected);
    }
    @TestWith({"WooHoo,Woo","HelloThere,Hello","abcdef,abc","ab,a","0123456789,01234","kitten,kit"})
    public void shouldReturnFirstHalf(String word,String expected){
        String resultado = stringejer.firstHalf(word);
        assertEquals(resultado,expected);
    }

}
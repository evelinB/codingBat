package com;
public class Stringejer {
    public String helloName(String name) {
        return ("Hello " + name + "!");
    }
    public String makeOutWord(String out, String word) {
        String primero = out.substring(0,2);
        String ultimo = out.substring(2,4);
        return primero + word + ultimo;
    }
    public String firstHalf(String str) {
        int longitud = str.length();
        int priMitad = Math.round(longitud/2);
        String mitad = str.substring(0,priMitad);
        return mitad;
    }


}

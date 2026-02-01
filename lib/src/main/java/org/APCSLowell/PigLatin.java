package org.APCSLowell;

import javax.swing.text.Position;

public class PigLatin {
    public int findFirstVowel(String sWord) {
          for(int i=0; i<sWord.length();i++){
    if(sWord.substring(i,i+1).equals("a")||sWord.substring(i,i+1).equals("e")||sWord.substring(i,i+1).equals("i")||sWord.substring(i,i+1).equals("u")||sWord.substring(i,i+1).equals("o")){
    return i;
        }
    }
    return -1;
    }
    public String pigLatin(String sWord) {
        int index= findFirstVowel(sWord);
        if (index ==0){
            return sWord + "way";
        }
        if (index==-1){
            return sWord+ "ay";
        }
        if (sWord.substring(0,2).equals("qu")){
            return sWord.substring(2)+ sWord.substring(0,2)+ "ay";
        }
            return sWord.substring(index)+ sWord.substring(0,index)+ "ay";
        
    }
 }



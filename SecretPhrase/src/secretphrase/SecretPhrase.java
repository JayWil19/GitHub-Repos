/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secretphrase;

/*@author jtw22*/
import java.util.*;
public class SecretPhrase {
    public static void main(String[] args) {
            Scanner kb = new Scanner(System.in);
            String input = "";
            boolean isCorrect = false;
            String secret = "guitar hero";
            String blocked ="****** ****";
            char sChar;
            char iChar;
        while(!blocked.equals(secret)){
            input="";
            while(input.length()!=1){
                System.out.println(blocked);
                System.out.println("Guess a letter");
                input = kb.nextLine().toLowerCase();
            }
            iChar = input.charAt(0);
            for(int x=0; x<secret.length();x++){
                sChar = secret.charAt(x);
                if(iChar == sChar){
                    blocked = blocked.substring(0,x) + input + blocked.substring(x+1,blocked.length());
                }
            }            
        }
        System.out.println(blocked);
    } 
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CountArray;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import javax.swing.*;
/**
 *
 * @author Nathan
 */
public class RegExAmazon {
    /*
     * Write the regular expression in the blank space below
     */
    
    //^ At the beggining, Capture group in brackets, A or B . match any character + 1 or more \1 results from capture group A or B
   //$ at the end meaning find also A or B at the end of the string
  //Another way to do this expression is ^[ab]|[ab]$
    final static String regularExpression = "^(a|b).+\\1$";
    
    public static void main(String[] args) throws IOException {
        ArrayList <List <String>> listOfLists = new ArrayList <List <String>>();
        ArrayList<String> lettersToFind = new ArrayList<>();
        ArrayList<String> trueFalseValues = new ArrayList<>();
        
        int query = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter the amount of queries"));
        String[] result = new String[query];
        Arrays.fill(result, "False");
        
        for (int i = 0; i < query; i++) {
            String someString = JOptionPane.showInputDialog(null, "Please enter the letters to find");
            lettersToFind.add(someString);
            
            if (someString.matches(regularExpression)) {
                result[i] = "True";
                trueFalseValues.add(result[i]);
            }
            else
            {
                trueFalseValues.add(result[i]);
            }
        }
        listOfLists.add(lettersToFind);
        listOfLists.add(trueFalseValues);
        System.out.println(listOfLists.get(0) + "\n" + listOfLists.get(1));
        
    }
}


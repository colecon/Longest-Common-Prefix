//Cole Constantino | Given an array of Strings, return the longest common prefix between all of them
import java.util.*;
public class LongestCommonPrefix{
  public static String checkPrefix(String[] strs){
    Set<Character> set = new HashSet<>();
    StringBuilder sb = new StringBuilder();
    
    //while loop with two indices one is amount of strings in array (i) and other is which current letter index to add
    
    int i = 0, j = 0;
    while(i < strs[j].length()){
      set.add(strs[j].charAt(i));
      j++;
      //Check if j has ran through all strings adding the letter at index i
      if(j >= strs.length){
        //check if they are all the same. size() = 1 if they are the same
        if(set.size() != 1){
          break;
        }
        else{
          sb.append(strs[j-1].charAt(i));
          j = 0;
          set.clear();
          i++;
        }
      }
    }
    
    return sb.toString();
  }
  
  public static void main(String[] args){
    String[] a = {"flower","flow","flight"};
    System.out.println(checkPrefix(a));
  }
}
import java.util.*;
import java.lang.*; 

public class Solutions {
    /*
     * @param strs: a list of strings
     * @return: encodes a list of strings to a single string.
     */
    public static void main(String[] args) {
        List<String> strs = new ArrayList<>();
        strs.add("How");
        strs.add("Now");
        strs.add("Brown");
        strs.add("Cow");
        StringBuilder res = new StringBuilder();
        for(int i = 0; i < strs.size(); i++){
            res.append(strs.get(i).length());
            res.append("#");
            res.append(strs.get(i));
        }
        System.out.println(res);
    }

    /*
     * @param str: A string
     * @return: decodes a single string to a list of strings
     */
      public static void main(String[] args){
        String str = "3#How3#Now5#Brown3#Cow";
        int i = 0;
        List<String> res = new ArrayList();
        while(i < str.length()){
            int j = i; 
            int length = Integer.parseInt(str.substring(i,j+1));
            while(str.charAt(j) != '#'){
                j++;
            }
            i = j+1;
            res.add(str.substring(i, i+length));
            i = i+length;
        }
        
        System.out.println(res);
        
    }
}

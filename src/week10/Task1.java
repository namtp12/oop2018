package week10;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Task1 {
    
    public static List<String> getAllFunctions(String filePath) {
        List<String> res = new ArrayList<>();
        
        List<String> toPerform = Task1.getStringFromFile(filePath);
        //List<String> performed = Task1.performString(toPerform);
        Stack<Character> balBracket = new Stack<>();
        String tmp = "";
        boolean inFunc = false;
        for(String s : toPerform) {
            //System.out.println(s);            
            if(s.contains("static") && s.contains("(")) {
                inFunc = true;
            }
            
            // Add the string in the function to String tmp to add to the list
            if(inFunc) {
                tmp += s;
                tmp += "\r\n";
                
                // Check the stack                
                if (s.contains("{")) {
                    balBracket.push('{');
                }
                if (s.contains("}") && balBracket.peek() != '{') {
                    balBracket.push('}');
                }
                if(s.contains("}") && balBracket.peek() == '{') {
                    balBracket.pop();
                }
                // Check if the reader reaches the end of function
                if(balBracket.isEmpty()) {
                    //tmp += s; // remain a close bracket "}"
                    tmp += "\r\n";
                    inFunc = false;
                    res.add(tmp);
                    tmp = "";
                }
            }
            /* Dangerous
            // Check if the reader reaches the end of function
            if(balBracket.isEmpty()) {
                tmp += s;
                tmp += "\r\n";
                inFunc = false;
                res.add(tmp);
                tmp = "";
            }
            */
        }
        
        return res;
    }
    
    private static ArrayList<String> getStringFromFile(String path) {
        ArrayList<String> res = null;
        String line = null; // doesn't cause NullPointerException, although Strings are immutable
        try {
            File f = new File(path);
            FileReader fd = new FileReader(f);
            BufferedReader buf = new BufferedReader(fd);
            
            res = new ArrayList<>();
            while((line = buf.readLine()) != null) {
                res.add(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return res;
    }
    
    private static List<String> performString (List<String> toPerform) {
        List<String> performed = new ArrayList<>();
        
        for(String s : toPerform) {
            String removedTabs = s.trim();
            // Check if current line is a comment
            if(removedTabs.startsWith("/")) {
                continue;
            }
            if(removedTabs.contains("//")) {
                //removedTabs.replace("", removedTabs.sub)
            }
        }
        
        return performed;
    }
}

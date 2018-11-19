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
    
    public static String findFunctionByName(String name) {
        String res = "Not found!";
        
        String filePath = "src\\week9\\Utils.java";
        List<String> toPerform = Task1.getStringFromFile(filePath);
        for(String s : toPerform) {
            if(s.contains(name) && s.contains("(") && 
                    (s.contains("public") || s.contains("protected") || s.contains("private"))
                    ) {
                String tmp = s;
                String methName = tmp.substring(0, tmp.lastIndexOf("("));
                // String contains the param list
                String params = tmp.substring(tmp.lastIndexOf("(", tmp.lastIndexOf(")")));
                
                // TODO: Perform params string
                
                params = params.substring(0, params.lastIndexOf(")") + 1);
                /*
                String s1;
                ArrayList<String> t = new ArrayList<>();
                s1 = params.substring(0, params.indexOf(","));
                while (params.contains(",")) {
                    s1 = params.substring(0, params.indexOf(","));
                    t.add(s1);
                }
                
                for(String s2 : t) {
                    System.out.println(s2);
                }
                */
                res = methName + params;
                
                return res;
            }
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

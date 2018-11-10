package week10;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Task1 {
    
    public static List<String> getAllFunctions(String filePath) {
        List<String> res = new ArrayList<>();
        
        List<String> toPerform = Task1.getStringFromFile(filePath);
        List<String> performed = Task1.performString(toPerform);
        for(String s : performed) {
            System.out.println(s);
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

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week9;

/**
 *
 * @author Administrator
 */
public class TestUtils {
    public static void main() {
        String filePath = "src\\week9\\file.txt";
        Utils.readContentFromFile(filePath);
        Utils.writeContentToFile(filePath);
    }
}

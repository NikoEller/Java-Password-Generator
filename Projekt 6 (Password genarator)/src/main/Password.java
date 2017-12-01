package main;

import java.util.Random;

public class Password {
	
    public static void createpassword(int lenght_variable, int quantity_variable)
    {
        int length = lenght_variable; // password length
        int quantity = quantity_variable;
        for (int i = 0; i < quantity; i++) {
        	System.out.println(generatePswd(length));
		}
        
    }
    
    
    
    static char[] generatePswd(int len)
    {
       // System.out.println("Your Password:");
        String charsCaps = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String chars = "abcdefghijklmnopqrstuvwxyz";
        String nums = "0123456789";
        String symbols = "!@#$%^&*_=+-/€.?<>)";

        String passSymbols = charsCaps + chars + nums + symbols;
        Random rnd = new Random();
        
        char[] password = new char[len];
        int index = 0;
        for (int i = 0; i < len; i++) 
        {
            password[i] = passSymbols.charAt(rnd.nextInt(passSymbols.length()));
            
        }
        return password;
    }
}
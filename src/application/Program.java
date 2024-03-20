package application;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Program {

	public static void main(String[] args) {

		String filePath = "/Users/multiportal/Documents/exec.properties";

		   try (InputStream input = new FileInputStream(filePath)) {
	            Properties properties = new Properties();
	            properties.load(input);

	            for (String key : properties.stringPropertyNames()) {
	                String value = properties.getProperty(key);

	                if (!isValidUnicode(value)) {
	                    System.out.println("Chave: " + key + " | Valor: " + value);
	                }
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }

	    public static boolean isValidUnicode(String text) {
	        for (int i = 0; i < text.length(); i++) {
	            if (!isValidUnicodeChar(text.charAt(i))) {
	                return false;
	            }
	        }
	        return true;
	    }

	    public static boolean isValidUnicodeChar(char c) {
	        return Character.isDefined(c);
	    }
}

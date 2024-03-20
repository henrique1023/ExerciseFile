package application;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RemoveSenhasDuplicadas {
	
	public static void main(String[] args) {
		
		File file = new File("/Users/multiportal/Documents/senha");
		Scanner sc = null;
		
		Map<String, String> chaves = new HashMap<>();
		String[] chaveMensagem = {};
		String[] zerado = {};
		String novaChave = "";
		int cont = 0;
		CharsetDecoder decoder = Charset.forName("UTF-8").newDecoder();
		try {
			sc = new Scanner(file);
			while(sc.hasNextLine()) {
				novaChave = sc.nextLine();
				if(!novaChave.isEmpty()) {
					if(!chaves.containsKey(novaChave)) {
						
						System.out.println(novaChave);
						
						chaves.put(novaChave, novaChave);
					}
					
					if(chaves.isEmpty()) {
						chaves.put(novaChave, novaChave);
					}
				}
				chaveMensagem = zerado;
			}
//			System.out.println(cont);
		}catch(IOException e) {
			e.printStackTrace();
		}
		finally {
			if(sc != null) {
			sc.close();
			}
		}
	}

}

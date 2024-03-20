package application;

import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CodingErrorAction;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MostraDuplicadaChave {
	
	public static void main(String[] args) {
		
		File file = new File("/Users/multiportal/Documents/exec");
		Scanner sc = null;
		
		Map<String, String> chaves = new HashMap<>();
		Map<String, String> chavesRepetidas = new HashMap<>();
		String[] chaveMensagem = {};
		String[] zerado = {};
		String novaChave = "";
		int cont = 0;
		char primeiroChar;
		CharsetDecoder decoder = Charset.forName("UTF-8").newDecoder();
		try {
			sc = new Scanner(file);
			while(sc.hasNextLine()) {
				novaChave = sc.nextLine();
				primeiroChar = novaChave.length() > 3 ? novaChave.charAt(0) : '#';
				if(primeiroChar != '#' && novaChave.length() > 10) {
					chaveMensagem = novaChave.split("=");
					if(chaves.containsKey(chaveMensagem[0])) {
						if(!chavesRepetidas.containsKey(chaveMensagem[0])) {
							chavesRepetidas.put(chaveMensagem[0], chaveMensagem[0]);
//							System.out.println(chaveMensagem[0]);
							cont ++;
						}
					}else {
						
						chaves.put(chaveMensagem[0], chaveMensagem[0]);
						
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

package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ProgramFileReader {

	public static void main(String[] args) {
		
		
		String path = "C:\\\\temp\\\\out.txt";
		
		//Esse bloco Try já finaliza totadas as dependencias declarada no ()
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
//			//FR indexando o arquivo 
//			fr = new FileReader(path);
//			//BR Armazena a linha agilizando a leitura
//			br = new BufferedReader(fr);
			
			//Pega a linha e armazena na variavel, se não tiver linha para ler retorna null
			String line = br.readLine();
			while(line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		}catch(IOException e){
			System.out.println("Error : " + e.getMessage());
		}
	}

}

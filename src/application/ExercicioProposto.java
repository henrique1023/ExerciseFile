package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import entities.Product;

public class ExercicioProposto {

	public static void main(String[] args) {
			
			//declarei o caminho até o caminho do arquivo fonte
		 	String path = "C:\\\\temp\\\\in.txt";
		 	//String para o caminho do arquivo pronto
			String strPath = "c:\\temp\\out";
			//criei uma lista de produtos e adicionei a classe arraylist para as funções
			List <Product> product = new ArrayList<>();
			//Vetores auxiliares que um é do arquivo fonte e outro dividi essa string em partes
			String[] lineFile = new String[6];
			String[][] outFile = new String[6][3];
			int n = 0; 
			//Criando o arquivo out, quando for criar só declarar o arquivo depois de new File
			boolean success = new File(strPath).mkdir();
			
			//declarando o try para os metodos da classe BufferedReader, que serve para ler o arquivo
			try(BufferedReader br = new BufferedReader(new FileReader(path))){
			while(n < lineFile.length) {
				lineFile[n] = br.readLine();
				n += 1;
			}	
			n = 0;
			//esse for pega oa string dividi ela com o split e guarda em outFile
			for(String s : lineFile) {
				outFile[n] = s.split(",");
				//depois de dividido a string, é adicionado cada campo atribuindo a sua variavel
				String name = outFile[n][0];
				//sempre lembrando de transformar ela no tipo de variavel certa, já que ela é uma string
				double price = Double.parseDouble(outFile[n][1]);
				int quantity = Integer.parseInt(outFile[n][2]);
				//depois disso, adiciona a lista de produtos, atribuindo cada parte no construtor
				product.add(new Product(name, price, quantity));
				n += 1;
			}
			
			//declarando o try para os metodos da classe BufferedWhiter, que serve para gravar o arquivo
			//nele você declara o arquivo que vai ser criado e o tipo quando clarado
			try(BufferedWriter bw = new BufferedWriter(new FileWriter(strPath + "\\summary.csv"));){
				
				//esse for, concatena o objeto com os atributos do produto que está na lista
				for(Product p : product) {
					String l = p.getName() + ", " + p.valueProduct();
					bw.write(l);
					bw.newLine();
				}
				System.out.println("Salved File successuly! " + strPath);
				
			}catch(IOException e) {
				System.out.println("Error Type: " + e.getMessage());
			}
		}
		catch(IOException e) {
			System.out.println("Error Type: " + e.getMessage());
		}
	}
}

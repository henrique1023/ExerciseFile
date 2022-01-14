package application;

import java.io.File;
import java.io.FileFilter;
import java.util.Scanner;

public class ProgramFile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a folder path: ");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		
		File[] folders = path.listFiles(File::isDirectory);
		//esse metodo pega o caminho passado e filtra as pastas mandando para o vetor
		System.out.println("FOLDERS: ");
		for(File f : folders) {
			System.out.println(f);
		}
		
		File[] files = path.listFiles(File::isFile);
		//ESSE METODO PEGA O CAMINHO PASSADO E DEPOIS PEGA OS ARQUIVOS MANDANDO PARA O VETOR
		System.out.println("FILE: ");
		for(File f : files) {
			System.out.println(f);
		}
		
		// esse metodo pega o caminho do arquivo e depois usa o "mkdir" para criar o arquivo
		boolean success = new File(strPath + "\\subdir").mkdir();
		System.out.println("Directory created successfully: " + success);

	}

}

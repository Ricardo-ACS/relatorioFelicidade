package application;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import entities.Inover;

public class Program {
			
	public static void main(String[] args)  {
		
		List<Inover> lista = new ArrayList<>();

		boolean criarDiretorio = new File("C:\\relatorioFelicidadeInovers").mkdir();
		String caminhoArquivo = "C:\\relatorioFelicidadeInovers\\relatorio.csv";
		
		int controle = 0;
		while (controle == 0){
			
			String nome = JOptionPane.showInputDialog(null, "Qual o nome do Inover?");
						
			int pergunta1 = Integer.parseInt(JOptionPane.showInputDialog(null, "De 1 a 5, qual seu grau de felicidade com o trabalho em equipe?"));
			int pergunta2 = Integer.parseInt(JOptionPane.showInputDialog(null, "De 1 a 5, qual seu grau de felicidade com a sua liderança?"));
			int pergunta3 = Integer.parseInt(JOptionPane.showInputDialog(null, "De 1 a 5, qual seu grau de felicidade com o prazo do projeto?"));
			int pergunta4 = Integer.parseInt(JOptionPane.showInputDialog(null, "De 1 a 5, qual seu grau de felicidade com o seu desempenho?"));
			int pergunta5 = Integer.parseInt(JOptionPane.showInputDialog(null, "De 1 a 5, como você avalia a sua felicidade com a InoveJr?"));
						
			lista.add(new Inover(nome, pergunta1, pergunta2, pergunta3, pergunta4, pergunta5));
			
			controle = JOptionPane.showConfirmDialog(null, "Deseja inserir dados pra outro inover?", "", JOptionPane.YES_NO_OPTION);
		}
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(caminhoArquivo))) {
			
			for (Inover inover : lista) {
				bw.write(inover.getNome() + " - trabalho em equipe: " + inover.getPergunta1() 
				+ "; liderança: " + inover.getPergunta2()
				+ "; prazo: " + inover.getPergunta3() 
				+ "; desempenho: " + inover.getPergunta4() 
				+ "; InoveJr: " + inover.getPergunta5() 
				+ ". O Inover está " + inover.mediaFelicidade());
				bw.newLine();
				
			}

			JOptionPane.showMessageDialog(null, "Relatorio criado!");
			
			
		} 
		catch (IOException e) {
			System.out.println("Error writing file: " + e.getMessage());
		}
		
		
		
	}
	
}

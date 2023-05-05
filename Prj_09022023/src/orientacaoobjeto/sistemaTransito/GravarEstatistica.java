package orientacaoobjeto.sistemaTransito;

import java.io.BufferedReader;
import java.io.BufferedWriter;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;


public class GravarEstatistica {
	
	public void GravaEstatistica(Estatistica[ ] estatisticas ) throws IOException {	
		
	      int i;  String fileName = "ArquivoAluno.txt";	
	      BufferedWriter gravar = new BufferedWriter(new FileWriter( fileName ));	
	      
	      for(Estatistica linha : estatisticas) {
	    	  gravar.write(Integer.toString(linha.getCodigoCidade()) );
	    	  gravar.newLine();
	    	  gravar.write( linha.getNomeCidade());
	    	  gravar.newLine();
	    	  gravar.write(Integer.toString(linha.getQtdAcidentes()) );
	    	  gravar.newLine();
	      }

	     System.out.println("GRAVAÇÃO FEITA COM SUCESSO ");	
	     gravar.close();
	  }	
	
	   public Estatistica[ ] LerEstatisticas ( ) throws IOException	 {	
	     int i;	
	    String fileName = "ArquivoAluno.txt";	
	    BufferedReader ler = new BufferedReader(new FileReader( fileName ));	
	    Estatistica estatisticas = new Estatistica();
	   
	    for (i = 0 ; i < 3 ; i++)   {	
	           = ler.readLine();  	
	          aluno[i].unome = ler.readLine();	
	          aluno[i].pontos = Integer.parseInt(ler.readLine());    }	
	  	
	    for (i = 0 ; i < 3; i++) {	
	          System.out.println(aluno[i].pnome + " " + aluno[i].unome + " pontos: " + 
	                                                                                                             aluno[i].pontos);   }
	     ler.close();	
	  }	
	}

}

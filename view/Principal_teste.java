package view;

import javax.swing.JOptionPane;

import Controller.TesteQuick1;

public class Principal_teste {

	public static void main(String[] args) {
		TesteQuick1 t = new TesteQuick1();
		
		int menu = 0;
		
		while (menu != 9) {
			
			menu = Integer.parseInt(JOptionPane.showInputDialog("""
					1 - Verifica vetores da atividade
					2 - Verifica velocidade sorts
					9 - Encerra
					"""));
			
			switch (menu){

			case 1:
				
			t.testando();
				
			break;
				
			case 2:
				
			t.velocidade();
				
			break;
			
			case 3:
				
			
				
			break;
				
			case 9: System.out.println("\nEncerrando...");

			}	
		}
		
		

	}

}

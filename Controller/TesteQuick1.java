package Controller;
import Controla_ordenadores.Sorts;
import Controla_quick.quicksort;
import java.util.Random;
public class TesteQuick1 {

	public void testando () {
		
		
		
		
		quicksort q = new quicksort();
		int[] v = {74, 20, 74, 87, 81, 16, 25, 99, 44, 58};
		int inicio = 0;
		int fim = v.length-1;
		System.out.println("Primeiro vetor: ");
		for (int i : v) {
			System.out.print(i+" ");
		}
		
		
		v = q.Quicksort(v, inicio, fim);
		System.out.println("\nPrimeiro vetor organizado:");
		for (int i : v) {
			System.out.print(i+" ");
		}
		
		int[] v2 = {44, 43, 42, 41, 40, 39, 38};
		
		fim = v2.length-1;
		
		System.out.println("\n\nSegundo vetor: ");
		for (int i : v2) {
			System.out.print(i+" ");
		}
		
		v2 = q.Quicksort(v2, inicio, fim);
		System.out.println("\nSegundo vetor organizado:");
		for (int i : v2) {
			System.out.print(i+" ");
		}
		
		int[] v3 = {31, 32, 33, 34, 99, 98, 97, 96};
		
		fim = v3.length-1;
		
		System.out.println("\n\nTerceiro vetor: ");
		for (int i : v3) {
			System.out.print(i+" ");
		}
		
		v3 = q.Quicksort(v3, inicio, fim);
		System.out.println("\nTerceiro vetor organizado:");
		for (int i : v3) {
			System.out.print(i+" ");
		}
	} 
	
	public void velocidade() {
		Random r = new Random();
		Sorts s = new Sorts();
		
		int[] vt = new int [1500];
		
		for (int i = 0; i<vt.length-1;i++) {
			
			vt[i] = r.nextInt(1, 3000);
		}
		
		long inicio = System.nanoTime();
		
		s.Bubblesort(vt);
		
		long fim = System.nanoTime();
		
		long resultado = fim - inicio;
		
		System.out.println("BubbleSort: "+(resultado)+" nanossegundos");
		
		inicio = System.nanoTime();
		
		s.Mergesort(vt, 0, vt.length-1);
		
		fim = System.nanoTime();
		
		resultado = fim - inicio;
		
		System.out.println("MergeSort: "+(resultado)+" nanossegundos");
		
		inicio = System.nanoTime();
		
		s.Quicksort(vt, 0, vt.length-1);
		
		fim = System.nanoTime();
		
		resultado = fim - inicio;
		
		System.out.println("QuickSort: "+(resultado)+" nanossegundos");
		
		
		
	}
	
}

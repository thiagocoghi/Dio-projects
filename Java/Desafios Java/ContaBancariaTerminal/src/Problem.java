import java.util.Scanner;
import java.util.List;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Problem {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
// TODO: complete os espaços em branco com sua solução para o problema
		String[] nomes = new String[10];
		
		for(int i=0 ; i<nomes.length ; i++){
			nomes[i] = scan.next();
		}
		for (int i=0; i< nomes.length; i++){
			if (i == 2 || i == 3 || i == 4){
				System.out.println(nomes[i]);
			}
		}
		

	}
}
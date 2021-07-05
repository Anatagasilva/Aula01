import java.util.Scanner;
public class EntendendoNumeros {
//Criar um programa onde o usuário digite 2 valores e realizemos a soma entre eles
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner leitor = new Scanner(System.in);
        int valor1;
        int valor2;
        int soma;
        System.out.println("Calculadora");
        System.out.println("Por favor, digite algum valor");
        valor1 = leitor.nextInt();
        System.out.println("Por favor, digite mais um valor"); 
        valor2 = leitor.nextInt();
        soma = valor1 + valor2;
        
        System.out.println("O resultado da soma foi " + soma); 
        leitor.close();
        
        
        
        leitor.close();
	}

}

import java.util.Scanner;

public class Desafio_chadrez 
{

	public static void main(String[] args) 
	{
		Scanner leitor = new Scanner(System.in);
		int fileira_h,coluna_v;
		fileira_h = 0;
		coluna_v = 0;
		
		
		System.out.println("===================Movimentos da torre no xadrez!===================");
		System.out.println("");
		
		//Lendo Valores----------------
		
		//Horizontal
		System.out.print("Digite o número da casa da fileira (linha horizontal) onde a torre se encontra (1 a 8): ");
		fileira_h = leitor.nextInt();
		while(fileira_h < 1 || fileira_h > 8)
		{
			System.out.println("ERRO: Digite somente um número entre 1 e 8");
			System.out.print("Digite a fileira novamente: ");
			fileira_h = leitor.nextInt();
		}
		
		//Vertical
		System.out.print("Digite o número da casa da coluna (linha vertical) onde a torre se encontra (1 a 8): ");
		coluna_v = leitor.nextInt();
		while(coluna_v < 1 || coluna_v > 8)
		{
			System.out.println("ERRO: Digite somente um número entre 1 e 8");
			System.out.print("Digite a coluna novamente: ");
			coluna_v = leitor.nextInt();
		}
		
		//---------------------------
		
		
		
		System.out.println("");
		
		System.out.println("Movimentos possíveis: ");
		
		System.out.println("");
		
		
		//criando tabuleiro
		System.out.println("    1 2 3 4 5 6 7 8");
		System.out.println("   ================");
		
		for(int y = 1; y <= 8; y++)
		{
			switch(y)
			{
				//Fielira 1
				case 1:
				fileira_campo(y,fileira_h,coluna_v);
				break;
				
				//Fielira 2
				case 2:
				fileira_campo(y,fileira_h,coluna_v);
				break;
				
				//Fielira 3
				case 3:
				fileira_campo(y,fileira_h,coluna_v);
				break;
				
				//Fielira 4
				case 4:
				fileira_campo(y,fileira_h,coluna_v);
				break;
				
				//Fielira 5
				case 5:
				fileira_campo(y,fileira_h,coluna_v);
				break;
				
				//Fielira 6
				case 6:
				fileira_campo(y,fileira_h,coluna_v);
				break;
				
				//Fielira 7
				case 7:
				fileira_campo(y,fileira_h,coluna_v);
				break;
				
				//Fielira 8
				case 8:
				fileira_campo(y,fileira_h,coluna_v);
				break;


			}
			System.out.println(" ");
		}
				
	
	}

	
	
	public static int fileira_campo(int fileira, int torre_h, int torre_v)
	{
		System.out.print(fileira+" |");
		if(fileira == torre_h)
		{
			for(int y = 1; y <= 8; y++)
			{
				System.out.print(" x");
			}
		}
		else
		{
			for(int y = 1; y <= 8; y++)
			{
				if(y == torre_v)
				{
				System.out.print(" x");
				continue;
				}
				System.out.print(" -");
			}
			
		}
		return 0;
	}
	
	
	
}

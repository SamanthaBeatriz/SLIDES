package tudinho;

public class Condicional {
	public static void main(String[] args) {
		int x = 10;
		int y = ( x > 10) ? x : x+1 ; 
		//ou
		int x = 10;
		int y
		if(x>10){
			y=x;
		}
		else`{
			y=x+1;
		}
		// atribuiçao 
		
		int dois = 1;
		dois += 1; // doi = dois +1
		
		int cinco = 7;
		cinco -= 2; // cinco = cinco -2

		int dez = 5;
		dez *= 2; // dez = dez *2

		int quatro = 12;
		quatro /= 3; // quatro = quatro /3

		double d = 1.99d;
		int i = (int) d;
		
		chort s= 15;
		long x = s; //widening
		long y = (long)s; //não é necessario
		
		//Promoçao Matematica 
		d = 100.99;
		i= 100;
		//aqui ocorre a promoçao matematica
		//i é convertido para double
		 d =d *i;
		 // aqui deve informar o casting
		 long x = 12345;
		 floast pi = 3.14f;
		 x= x*(long) pi;
		 x= (long) (x*pi);
		 
		 
		 
		
	}
}

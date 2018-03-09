package tudinho;

public class Operadores {

	public static void main(String[] args) {
			//incrementando e decrementando
		int a = 0;
		int b = a++; // incrementa depois de atribuir
		int c = ++a; // incrementa antes de atribuir
		b = a--; // decrementa depois de atribuir
		c = --a; // decrementa antes de atribuir
		
		int x = +3; //x recebe o positivo 3
		x = -x; //x recebe o negativo 3
		
		int i = ~1; //i = -2 os bits foram invertidos
		
		boolean falsidade = ! (true); //interte o valor booleano
		
		double d = 1,99;
		int io = (int) d; //converte para int
		
		int um = 3/2; //divisao de inteiros gera um inteiro
		float umEmeio = (float) 3/2;//promoçao aritimerica para float
		double xyz = umEmeio * um;//promoçao aritimerica para float
		
		int resto 7%2; //resto = 1
		
		long l = 1000+4000;
		double d = 1.0 - 0.01;
		
		long var = 1235;
		String str = "O valor de var é "+var;
		
		String str = "O valor de var é "+ Long.toString( var );
		
		//desloca para a direita
		int i2 = 192 >> 1
		int i3 = 192 >> 7
		//desloca para a esquerda
		int i4 = -192 <<1
		int i5 = -192 <<7
		//desloca para a direita sem sinal
		int i6 = 192 >>>1
		int i7 = 192 >>>7
		
		
		
	}

}

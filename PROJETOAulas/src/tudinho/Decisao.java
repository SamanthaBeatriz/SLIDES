package tudinho;

public class Decisao {
	public static void main(String[] args) {
		int idade = 20;
		if(idade<=12){
			System.out.println("criança");
		}
		else if(idade<=19){
			System.out.println("adolecente");
		}
		else if(idade<=60){
			System.out.println("adulto");
		}
		else{
			System.out.println("idoso");
		}
		
		//switch
		int numero=1;
		switch(numero){
		case 1
		System.out.println("um");
		break
		case 2
		System.out.println("dois");
		break
		case 3
		System.out.println("tres");
		break
		case 4
		System.out.println("quatro");
		break
		default 
		System.out.println("nada");
		break
		}
		
		//while
		int t=0;
		while (t <10){
			System.out.println("linha"+t);
			t++;
		}
		//laço no final
		do{
			System.out.println("linha"+t);
			t++;
		} while (t <10);
			
		//laço for
		for (int e=0; e < 10; e++){
			System.out.println("linha"+e);
			e++;
		}
		
		for (String s : args){
			System.out.println("argumento"+s);
			
		}
		List lista = new ArrayList();
		for (String s : lista){
			System.out.println(s);	
		}
		
		char letras[] = {'a','b','c','d','e'};
		int u;
		for (u=0; e <letras.length; u++){
			if(letras[i] =='c'){
				break;
			}
		}
		System.out.println("Ultimo indice"+i);
	}

}

package br.com.generation.vetoresematrizes;

 	public  class  Cliente {

	// atributos do cliente
	
	String  Nome ;
	String  Telefone ;
	String  CPF ;
	String  Endereco ;
	String  Email ;
	String  Genero ;
	int idade;
	
	// atributos do produto oferecido ao cliente
	double qntcomprada;
	duplo precoproduto;
	int numero1;
	int numero2;
	int soma;
	
	// m�todos
	
		void  ExibeCadastro () {
		
		Sistema . para fora . println ( " Nome: "  +  Nome  +  " CPF: "  +  CPF  +  " Telefone: "  +  Telefone );
		Sistema . para fora . println ( " Endere�o: "  +  Endereco  +  " Email: "  +  Email  +  " G�nero: "  +  Genero );
		Sistema . para fora . println ( " Idade: "  + idade);
		
	}
	
	

	double  ValorCompra () {
		
		return qntcomprada * precoproduto;
		
	}
	
	void  IdadeMinima ( int  idade ) {
		
		if (idade >  18 ) {
			
			Sistema . para fora . println ( " voc� pode comprar " );
		}
		
		else  if (idade <  18 ) {
			
			Sistema . para fora . println ( " voc� n�o pode comprar " );
		}
		
		
	}
	
	
	
	
	
	
	



}



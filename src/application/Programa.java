package application;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Conta minhaConta = new Conta();
		Conta meuSonho = new Conta();
		
		minhaConta.titular = "Gustavo Campos";
		minhaConta.numero = 12289;
		minhaConta.saldo = 200;
		
		meuSonho.titular = "Leila Campos";
		meuSonho.numero = 12288;
		meuSonho.saldo = 200000;
	
		System.out.println("Saldo atual: " + minhaConta.saldo);
		
		//TODO: Adicionar mensagem caso o cliente não coniga sacar ou uma 
		//mensagem de sucesso!
		
		if(minhaConta.sacar(201.00)) {
			System.out.println("Sucesso");
		}else {
			System.out.println("Seu saldo não é suficiente");
		}
	
		System.err.println("Saldo depois de sacar: " + minhaConta.saldo);
		
		minhaConta.depositar(100.00);
		System.err.println("Saldo depois de depositar: " + minhaConta.saldo);
		
	}

}

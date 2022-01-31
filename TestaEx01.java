package br.com.generation.atividades;

public class TestaEx01 {

	public static void main(String[] args) {
		
		Ex01 c1 = new Ex01();
		Ex01 c2 = new Ex01();
				
		c1.nome = "Luana";
		c1.idade = 18;
		c1.endereco = "Rua: Henrique Muzzio, n 300";
		c1.telefone = 1130354680;
		
		
		c2.nome = "Paulo";
		c2.idade = 20;
		c2.endereco = "Av. Tancredo, n 5000";
		c2.telefone = 1144057898;
		
		
		System.out.println("Nome do cliente: " + c1.nome);
		System.out.println("Idade: " + c1.idade);
		System.out.println("Endereço: " + c1.endereco);
		System.out.println("Telefone: " + c1.telefone);
		c1.cliente();
		c1.endereco();
		c1.idade();
		c1.telefone();
				
		System.out.println("Nome do cliente: "+ c2.nome);
		System.out.println("Idade: " +c2.idade);
		System.out.println("Endereço: " +c2.endereco);
		System.out.println("Telefone: " +c2.telefone);
		c2.cliente();
		c2.endereco();
		c2.idade();
		c2.telefone();
		
		
		}
}


		
package p1;

import java.text.SimpleDateFormat;
import java.util.Date;

// classe abstrata - não pode ser instanciada, 
// ou seja, não pode criar objetos 
public abstract class Animal {
	
	
	private String nome;
	private Date dataNasc;
	private String cor;
	
	public Animal(String nome) {
	
	System.out.println("\n --CRIANDO UM ANIMAL--");	
		this.nome = nome;
		this.dataNasc = new Date();
	}
	/*
	 * metodo abstrato não tem corpo, termina com '';'' ponto-e-virgula
	 * serve para forçar seus descendentes a terem 
	 * esse método implementado
	 */
	
	public abstract void movimentar();
	
	
	
	
	
	
	public void getInfo() {
		SimpleDateFormat dt;
		dt = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		String dn = dt.format(this.dataNasc);
		System.out.println("\n-------------------------");
		System.out.println("--- Classe de Animal ---");
		System.out.println("nome...: " + this.nome);
		System.out.println("datanasc...: " + dn);
		System.out.println("cor...: " + this.cor);
		System.out.println("-------------------------");
	}
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(Date dataNasc) {
		this.dataNasc = dataNasc;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}


	
}

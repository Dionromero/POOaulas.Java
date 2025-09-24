package p1;

public class Ave extends Animal {
	private int tamanhoBico = 0;

	public Ave(String nome) {
		super(nome);//chama o construtor da classe Pai
		System.out.println("-- Criada uma Ave --");
	}
	
	/* Sobrescritade método 
	 * quando a classe Pai tem um método e a classe 
	 * filha resolve reescrever o método.
	 * A classe filha não tem obrigação de chamar o
	 * método da classe pai, só faz se quiser 
	 */
	
	public void getInfo() {
		super.getInfo();// se quiser chamar o método da classe pai 
		System.out.println("\n-- info.Classe Pai --");
		System.out.println("tam.bico...: " + this.tamanhoBico);
		
	}

	@Override
	public void movimentar() {
		System.out.println("Uma ave voa ou corre");
		
		
	}
	
	

}

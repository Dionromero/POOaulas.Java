package p1;

public class Cavalo extends Equino{
	
	public Cavalo(String nome) {
		super(nome);
		System.out.println("-- Criando um Cavalo --");
	}

	@Override
	public void movimentar() {
		System.out.println("Um Cavalo trota.");
		
		
	}

}

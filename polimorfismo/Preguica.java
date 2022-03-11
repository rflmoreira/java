package polimorfismo;

public class Preguica extends Animal {

	@Override
	public void emitirSom() {
		System.out.println("Som de preguiça");
	}

	@Override
	public void locomover() {
		System.out.println("Subindo árvore");
	}
}
package polimorfismo;

public class Preguica extends Animal {

	@Override
	public void emitirSom() {
		System.out.println("Som de pregui�a");
	}

	@Override
	public void locomover() {
		System.out.println("Subindo �rvore");
	}
}
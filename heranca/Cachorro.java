package heranca;

public class Cachorro extends Animal {
	private boolean correr = false;

	public void animalCorrer() {
		this.correr = true;
		System.out.println("O Animal está correndo");
	}

	public void parado() {
		if (this.correr = true) {
			this.correr = false;
			System.out.println("O animal está parado");
		} else
			System.out.println("O animal já se encontra parado");
	}
}

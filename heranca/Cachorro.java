package heranca;

public class Cachorro extends Animal {
	private boolean correr = false;

	public void animalCorrer() {
		this.correr = true;
		System.out.println("O Animal est� correndo");
	}

	public void parado() {
		if (this.correr = true) {
			this.correr = false;
			System.out.println("O animal est� parado");
		} else
			System.out.println("O animal j� se encontra parado");
	}
}

package heranca;

public class Preguica extends Animal {
	private boolean subirEmArvores = false;

	public void subirArvore() {
		this.subirEmArvores = true;
		System.out.println("O animal está subindo a árvore");
	}

	public void descerArvore() {
		if (this.subirEmArvores == true) {
			this.subirEmArvores = false;
			System.out.println("O animal desceu a árvore");
		} else
			System.out.println("O animal não está na árvore");
	}}

package heranca;

public class Preguica extends Animal {
	private boolean subirEmArvores = false;

	public void subirArvore() {
		this.subirEmArvores = true;
		System.out.println("O animal est� subindo a �rvore");
	}

	public void descerArvore() {
		if (this.subirEmArvores == true) {
			this.subirEmArvores = false;
			System.out.println("O animal desceu a �rvore");
		} else
			System.out.println("O animal n�o est� na �rvore");
	}}

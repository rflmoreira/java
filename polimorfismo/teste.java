package polimorfismo;

public class teste {
	public static void main(String[] args) {
		Cachorro ch = new Cachorro();
		Cavalo ca = new Cavalo();
		Preguica p = new Preguica();
		
		ch.emitirSom();
		ch.locomover();
		System.out.println();
		ca.emitirSom();
		ca.locomover();
		System.out.println();
		p.emitirSom();
		p.locomover();
	}
}

package Aula02;

public class Veiculo {
	// Atributos
	private String marca;
	private String modelo;
	private int ano;
	private String cor;
	private double preco;
	private boolean ligado;
	
	// Construtor
	public Veiculo(String marca, String modelo, int ano, String cor, double preco) {
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
		this.cor = cor;
		this.preco = preco;
	}
	
	// Método para exibir informações sobre o veículos
	public void exbirInformacoes() {
		System.out.println("\n---------------");
		System.out.println("Marca: " + marca);
		System.out.println("Modelo: " + modelo);
		System.out.println("Ano: " + ano);
		System.out.println("Cor: " + cor);
		System.out.println("Preço: R$" + preco);
		System.out.println("Ligado: " + ligado);
		System.out.println("---------------\n");
	}
	
	// Método para ligar o veículo (apenas um exemplo, por ser personalizado)
	public void ligar() {
		this.ligado = true;
		System.out.println("O veiculo está ligado.");
	}
	
	// Método para desligar o veículo (apenas um exemplo, por ser personalizado)
	public void deligar() {
		this.ligado = false;
		System.out.println("O veículo está desligado.");
	}
	
	public static void main(String[] args) {	
		// Exemplo de uso da classe Veiculo
		Veiculo meuCarro = new Veiculo("Toyota", "Corolla", 2022, "Prata", 75000.0);
		meuCarro.exbirInformacoes();
		meuCarro.ligar();
		meuCarro.exbirInformacoes();
		meuCarro.deligar();
		meuCarro.exbirInformacoes();
		
	}


}

package entidades;

public class Juridico extends Contribuinte{
	private Integer nEmpregados;

	public Juridico(String nome, Double renda, Integer nEmpregados) {
		super(nome, renda);
		this.nEmpregados = nEmpregados;
	}

	public Integer getnEmpregados() {
		return nEmpregados;
	}

	public void setnEmpregados(Integer nEmpregados) {
		this.nEmpregados = nEmpregados;
	}
	
	@Override
	
	public Double imposto() {
		if (nEmpregados > 10) {
			return (getRenda() * 0.14);
		} else {			
			return (getRenda() * 0.16);
		}
	}
}
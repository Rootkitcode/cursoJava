package com.gm.mundopc;

public class Teclado extends DispositivoEntrada {
	private final int idTecaldo;
	private static int contadorTeclados;
	
	public Teclado(String tipoEntrada, String maarca) {
		super(tipoEntrada, maarca);
		this.idTecaldo = ++Teclado.contadorTeclados;
		
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Teclado [idTecaldo=");
		builder.append(idTecaldo);
		builder.append(", " + super.toString());
		builder.append("]");
		return builder.toString();
	}
	

}

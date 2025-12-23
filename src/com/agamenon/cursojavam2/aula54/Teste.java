package com.agamenon.cursojavam2.aula54;

public class Teste {

	public static void main(String[] args) {

		DiaSemana dia = DiaSemana.SEGUNDA;

		System.out.println(dia.toString() + " - " + dia.getValor());

		Data data = new Data(5, 12, 2025, DiaSemana.SEGUNDA);

		System.out.println(data.getDiasemana());

	}

}

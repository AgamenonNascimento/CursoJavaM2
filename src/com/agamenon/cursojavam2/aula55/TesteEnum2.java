package com.agamenon.cursojavam2.aula55;

import com.agamenon.cursojavam2.aula53.DiaSemana;

public class TesteEnum2 {

	public static void main(String[] args) {
		System.out.println(Enum.valueOf(DiaSemana.class, "DOMINGO"));
		
		DiaSemana dia= Enum.valueOf(DiaSemana.class, "SEXTA");
		
		System.out.println(dia);
		

	}

}

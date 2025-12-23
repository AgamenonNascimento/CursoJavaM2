package com.agamenon.cursojavam2.aula54;

public enum MesAno {
  JANEIRO("Janeiro",1),
  FEVEREIRO("Fevereiro",2),   
  MARCO("Março", 3),
  ABRIL("Abril", 3),
  MAIO("Maio", 3),
  JUNHO("Junho", 3),
  JULHO("Julho", 3),
  AGOSTO("Agosto", 3),
  SETEMBRO("Setembro", 3),
  OUTUBRO("Outubro", 3),
  NOVEMBRO("Novembro", 3),
  DEZEMBRO("Dezembro", 3);

  private String nome;
  private int valor;
  
  private MesAno() {
	
}

  MesAno(String nome, int valor) {
	  this.nome = nome;
	  this.valor = valor;
  }

  public int getValor() {
    return valor;
  }

  public String getNome() {
	return nome;
  }

  
  
  
}
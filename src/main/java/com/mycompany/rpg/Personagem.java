package com.mycompany.rpg;

import java.awt.Point;
import java.util.List;

public class Personagem extends Objeto{
    private String nome;
    private Sexo sexo;
    private Raca raca;
    private int nivel, pontosDeVida, pontosDeMana, pontosDeStamina;
    List<Item> itensEquipados, itensInventario;

    public Personagem(String nome, Sexo sexo, Raca raca, int nivel, int pontosDeVida, int pontosDeMana, int pontosDeStamina, List<Item> itensEquipados, List<Item> itensInventario, int id, Point localizacao) {
        super(id, localizacao);
        this.nome = nome;
        this.sexo = sexo;
        this.raca = raca;
        this.nivel = nivel;
        this.pontosDeVida = pontosDeVida;
        this.pontosDeMana = pontosDeMana;
        this.pontosDeStamina = pontosDeStamina;
        this.itensEquipados = itensEquipados;
        this.itensInventario = itensInventario;
    }    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getPontosDeVida() {
        return pontosDeVida;
    }

    public void setPontosDeVida(int pontosDeVida) {
        this.pontosDeVida = pontosDeVida;
    }

    public int getPontosDeMana() {
        return pontosDeMana;
    }

    public void setPontosDeMana(int pontosDeMana) {
        this.pontosDeMana = pontosDeMana;
    }

    public int getPontosDeStamina() {
        return pontosDeStamina;
    }

    public void setPontosDeStamina(int pontosDeStamina) {
        this.pontosDeStamina = pontosDeStamina;
    }

    public List<Item> getItensEquipados() {
        return itensEquipados;
    }

    public void setItensEquipados(List<Item> itensEquipados) {
        this.itensEquipados = itensEquipados;
    }

    public List<Item> getItensInventario() {
        return itensInventario;
    }

    public void setItensInventario(List<Item> itensInventario) {
        this.itensInventario = itensInventario;
    }
    
    public void atacar(){}
    public void movimentar(){}
    public void interagir(){}
    public void escrotizar(){}
    public void usarItem(){}
    public void usarHabilidade(){}
    
}

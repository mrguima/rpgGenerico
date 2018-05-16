package com.mycompany.rpg;

import java.awt.Point;

public class Objeto {
    private int id;
    private Point localizacao;

    public Objeto(int id, Point localizacao) {
        this.id = id;
        this.localizacao = localizacao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Point getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(Point localizacao) {
        this.localizacao = localizacao;
    }
    
    
}

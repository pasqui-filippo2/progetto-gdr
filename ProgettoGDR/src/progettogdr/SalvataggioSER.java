/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package progettogdr;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author pasqui.filippo
 */
public class SalvataggioSER implements Serializable  {
    int energia,potenza,turno,onigiri,ravioli;
    String nome,tecnica;
    TipoElementale tipo;
    
    

    public SalvataggioSER(Personaggio p, Inventario i, GestoreGioco g) {
        this.onigiri=i.stampaOnigiri();
        this.ravioli=i.stampaRavioli();
        this.turno=g.getTurno();
        this.energia =p.getEnergia();
        this.potenza =p.getPotenzaTiro();
        this.nome = p.getNome();
        this.tecnica =p.getNomeTecnica();
        this.tipo =p.getTipo();
    }

    public int getEnergia() {
        return energia;
    }

    public int getPotenza() {
        return potenza;
    }

    public int getTurno() {
        return turno;
    }

    public String getNome() {
        return nome;
    }

    public String getTecnica() {
        return tecnica;
    }

    public TipoElementale getTipo() {
        return tipo;
    }

    public int getOnigiri() {
        return onigiri;
    }

    public int getRavioli() {
        return ravioli;
    }

   
    
    
    
    
}

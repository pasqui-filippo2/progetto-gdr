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
    int energia,potenza,turno;
    String nome,tecnica;
    TipoElementale tipo;
    ArrayList<OggettoInv>oggetti=new ArrayList();
    

    public SalvataggioSER(ArrayList<OggettoInv>oggetti,int turno,int energia, int potenza, String nome, String tecnica, TipoElementale tipo,Personaggio p, Inventario i, GestoreGioco g) {
        this.oggetti=i.getOggetti();
        this.turno=g.getTurno();
        this.energia =p.getEnergia();
        this.potenza =p.getPotenzaTiro();
        this.nome = p.getNome();
        this.tecnica =p.getNomeTecnica();
        this.tipo =p.getTipo();
    }
    
    
    
    
}

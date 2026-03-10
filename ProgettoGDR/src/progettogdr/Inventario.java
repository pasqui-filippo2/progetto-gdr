/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package progettogdr;

import java.util.ArrayList;

/**
 *
 * @author pasqui.filippo
 */
public class Inventario {
    ArrayList<OggettoInv>oggetti=new ArrayList();
    public void addOggetto(OggettoInv ogg){
        oggetti.add(ogg);
    }
    public void removeOggetto(OggettoInv ogg){
        for(OggettoInv o : oggetti){
            if(o.getNome().contains(ogg.getNome())){
                oggetti.remove(o);
            }
        }
    }
    
    
    public void usaOggeetto(OggettoInv ogg){
        
        ogg.applicaEffetto();
    }
}

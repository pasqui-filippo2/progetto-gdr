/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package progettogdr;

/**
 *
 * @author pasqui.filippo
 */
public class OggettoInv {
    private String nome;
    private int incremento;
    private String attType ;

    public OggettoInv(String nome, int incremento, String attType) {
        this.nome = nome;
        this.incremento = incremento;
        this.attType = attType;
    }

    public int getIncremento() {
        return incremento;
    }

    public String getAttType() {
        return attType;
    }
    
    
    
    
    
    public String getNome() {
        return nome;
    }
    
    
}
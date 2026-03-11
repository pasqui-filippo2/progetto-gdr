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
    private String attType ;

    public OggettoInv(String nome, String attType) {
        this.nome = nome;
        this.attType = attType;
    }

    

    public String getAttType() {
        return attType;
    }
    
    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "OggettoInv{" + "nome=" + nome + '}';
    }
    
    
}
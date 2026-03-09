/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package progettogdr;

/**
 *
 * @author pasqui.filippo
 */
public class AxelBlaze extends Personaggio {
    

    public AxelBlaze(String nome, int energia, int potenzaTiro, String nomeTecnica, TipoElementale tipo) {
        super(nome, energia, potenzaTiro, nomeTecnica, tipo);
    }

    
    
    @Override
    public void tecnicaSpeciale(){
        energia+=20;
        potenzaTiro+=20;
    }
}

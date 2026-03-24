/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package progettogdr;

import java.util.Random;

/**
 *
 * @author pasqui.filippo
 */
public class AitorCazado extends Personaggio {
    private int raddoppiaRandom;
    public AitorCazado(String nome, int energia, int potenzaTiro, String nomeTecnica, TipoElementale tipo) {
        super(nome, energia, potenzaTiro, nomeTecnica, tipo);
    }

    @Override
    public void tecnicaSpeciale() {
        Random rnd = new Random();
        raddoppiaRandom=rnd.nextInt(0,100);
        if(raddoppiaRandom>=70){
            energia+=20;
            potenzaTiro*=1.5;
        }
        else{
            energia+=20;
            potenzaTiro+=15;
        }
    }
    
}

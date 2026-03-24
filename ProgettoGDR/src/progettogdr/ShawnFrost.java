/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package progettogdr;

/**
 *
 * @author pasqui.filippo
 */
public class ShawnFrost extends Personaggio{ 
   private boolean bonusScudo=false;

    public ShawnFrost(String nome, int energia, int potenzaTiro, String nomeTecnica, TipoElementale tipo) {
        super(nome, energia, potenzaTiro, nomeTecnica, tipo);
    }

    @Override
    public void tecnicaSpeciale() {
        if (energia > 50) {
            bonusScudo = true;
        }
        if (bonusScudo == true) {
            energia = energia * 2;

        } else {
            energia = energia + 20;
        }

        if (energia > 100) {
            energia = 100;
        }
    }

}
   
   
  


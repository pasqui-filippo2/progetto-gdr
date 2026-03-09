/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package progettogdr;

/**
 *
 * @author pasqui.filippo
 */
public abstract class Personaggio {
    protected String nome;
    protected int energia;
    protected int potenzaTiro;
    protected String nomeTecnica;
    protected TipoElementale tipo;

    public Personaggio(String nome, int energia, int potenzaTiro, String nomeTecnica, TipoElementale tipo) {
        this.nome = nome;
        this.energia = energia;
        this.potenzaTiro = potenzaTiro;
        this.nomeTecnica = nomeTecnica;
        this.tipo = tipo;
    }
    
    public abstract void tecnicaSpeciale();
 }

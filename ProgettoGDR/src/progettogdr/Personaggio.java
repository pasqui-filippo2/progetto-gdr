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

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public void setPotenzaTiro(int potenzaTiro) {
        this.potenzaTiro = potenzaTiro;
    }

    public int getEnergia() {
        return energia;
    }

    public int getPotenzaTiro() {
        return potenzaTiro;
    }

    public TipoElementale getTipo() {
        return tipo;
    }

    public String getNome() {
        return nome;
    }

    public String getNomeTecnica() {
        return nomeTecnica;
    }
    
    
    
    public abstract void tecnicaSpeciale();
    
    
    public void usaOggetto(Inventario i,OggettoInv ogg, Personaggio p){
        
       applicaEffetto(ogg,p);
       i.removeOggetto(ogg);
       
    }
    
    public void applicaEffetto(OggettoInv ogg,Personaggio p){
        switch (ogg.getAttType()) {
            case "energia": 
                
                p.setEnergia(p.getEnergia()+25);
                break;   
            case "potenza di tiro":
                
                p.setPotenzaTiro(p.getEnergia()+20);
                break;
            default:
              break;
        }
    }

    @Override
    public String toString() {
        return "Personaggio{" + "nome=" + nome + ", energia=" + energia + ", potenzaTiro=" + potenzaTiro + ", nomeTecnica=" + nomeTecnica + ", tipo=" + tipo + '}';
    }
    
    
    

 }

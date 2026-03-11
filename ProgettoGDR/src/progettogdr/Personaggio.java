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

    public void darkManage() {
        if(tipo.equals(tipo.TERRA)){
            System.out.println("vinci lo scontro, ma perdei qualcosa");
            energia-=15;
            potenzaTiro-=15;
        }else{
            System.out.println("perdi lo scontro");
            energia-=25;
            potenzaTiro-=25;
        }
    }
    
    public void royalManage(Inventario i,OggettoInv ogg){
        System.out.println("Ti hanno rubato un oggetto dall'inventario");
        i.removeOggetto(ogg);
    }
    
    
    public void quintoManage(Inventario i,OggettoInv ogg){
        if(tipo.equals(tipo.FUOCO)){
            System.out.println("vinci lo scontro, ma perdei qualcosa");
            energia-=15;
            i.removeOggetto(ogg);
        }else{
            System.out.println("perdi lo scontro");
            energia-=25;
            potenzaTiro-=25;
        }
    }
 }

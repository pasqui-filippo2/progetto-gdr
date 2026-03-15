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
            System.out.println("vinci lo scontro, ma perdi qualcosa");
            energia-=15;
            i.removeOggetto(ogg);
        }else{
            System.out.println("perdi lo scontro");
            energia-=25;
            potenzaTiro-=25;
        }
    }
    
    public void glorieManage(){
        System.out.println("Ti donano la loro cooscienza!! "+" | +20 sulla potenza di tiro |");
        potenzaTiro+=20;
    }
    
    public void evansManage(Inventario inv){
        OggettoInv ogg;
        int i=0;
        System.out.println("Ti ospita a pranzo a casa sua--> "+" | +2 elementi nell'inventario |");
        while(i<=2){
            if(i==1){
                ogg=new OggettoInv("onigiri","energia");
                inv.addOggetto(ogg);
            }else{
                ogg=new OggettoInv("ravioli cinesi","potenza tiro");
                inv.addOggetto(ogg);
            }
        }  
    }
    
    public void campoManage(){
        System.out.println("Allenamento al campo del fiume --> "+" | Migliori le tue abilità, a discapito di un po' di energia");
        potenzaTiro+=20;
        energia-=5;
    }
 }

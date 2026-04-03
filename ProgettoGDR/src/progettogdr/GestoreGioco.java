/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package progettogdr;

/**
 *
 * @author pasqui.filippo
 */
public class GestoreGioco {
    private Personaggio p;
    private Inventario i;
    private boolean partitaAttiva;
    private int turno;
    private TipoElementale gestioneTipo;
    private String descrizione;

    public GestoreGioco(boolean partitaAttiva, int turno,Personaggio p,Inventario i) {
        this.partitaAttiva = partitaAttiva;
        this.turno = turno;
        this.p=p;
        this.i=i;
    }
   
    
    
    
    
    public void gestisciEvento(FormGioco f){
        turno++;
        String evento=Evento.generaEvento();
        switch (evento){
            case "Vecchie Glorie":
                System.out.println("Icontro con la squadra delle vechhie glorie");
                glorieManage();//POSITIVO
                break;
            case "Nonno Evans":
                System.out.println("Incontro nonno Evans");
                evansManage();//POSITIVO
                break;
            case "Campo del fiume":
                System.out.println("Allenamento al campo del fiume");
                campoManage();//POSITIVO
                break;
            case "Sign.Dark":
                System.out.println("Incontro Sign.dark");
                darkManage();//NEGATIVO
                break;
            case "Royal Academy":
                System.out.println("Incontro Royal Academy");
                royalManage();//NEGATIVO
                break;
            case "Quinto Settore":
                System.out.println("Incontro quinto settore");
                quintoManage();//NEGATIVO
            default:
                break;
        }
        f.setEvent(evento);
    }

    public int getTurno() {
        return turno;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setP(Personaggio p) {
        this.p = p;
    }

    public Personaggio getP() {
        return p;
    }

    public Inventario getI() {
        return i;
    }

    

   
    
    
    
    public void darkManage(){
        if(p.getTipo().equals(gestioneTipo.TERRA)){
            System.out.println("vinci lo scontro, ma perdi qualcosa");
            p.setEnergia(p.getEnergia()-15);
            p.setPotenzaTiro(p.getPotenzaTiro()-15);
            descrizione="Incontri il Sign.Dark,vinci lo scontro elementale, ma perdi qualcosa =(";
        }else{
            System.out.println("perdi lo scontro");
            p.setEnergia(p.getEnergia()-25);
            p.setPotenzaTiro(p.getPotenzaTiro()-25);
            descrizione="Incontri il Sign.Dark e perdi lo scontro elementale";
        }
        if(p.getEnergia()>100)p.setEnergia(100);
        if(p.potenzaTiro>100)p.setPotenzaTiro(100);
        
        if(p.getEnergia()<0)p.setEnergia(0);
        if(p.potenzaTiro<0)p.setPotenzaTiro(0);
        
        
    }
    
    public void royalManage(){
        String nome ="onigiri";
        System.out.println("Ti hanno rubato un oggetto dall'inventario");
        i.removeOggetto(nome);
        descrizione="Incontri il capitano della RoyalAcademy che ti rubano un onigiri";
    }
    
    
    public void quintoManage(){
        String nome ="ravioli cinesi";
        if(p.getTipo().equals(gestioneTipo.FUOCO)){
            System.out.println("vinci lo scontro, ma perdi qualcosa");
            p.setEnergia(p.getEnergia()-15);
            i.removeOggetto(nome);
            descrizione="Incontri il capo del QuintoSettore,vinci lo scontro elementale, ma perdi qualcosa =(";
        }else{
            System.out.println("perdi lo scontro");
            p.setEnergia(p.getEnergia()-25);
            p.setPotenzaTiro(p.getPotenzaTiro()-25);
            descrizione="Incontri il capo del QuintoSettore e perdi lo scontro elementale";
        }
        
        if(p.getEnergia()>100)p.setEnergia(100);
        if(p.potenzaTiro>100)p.setPotenzaTiro(100);
        
        if(p.getEnergia()<0)p.setEnergia(0);
        if(p.potenzaTiro<0)p.setPotenzaTiro(0);
    }
    
    public void glorieManage(){
        System.out.println("Ti donano la loro cooscienza!! "+" | +20 sulla potenza di tiro |");
        p.setPotenzaTiro(p.getPotenzaTiro()+25);
        p.setEnergia(p.getEnergia()+25);
        if(p.getEnergia()>100)p.setEnergia(100);
        if(p.potenzaTiro>100)p.setPotenzaTiro(100);
        descrizione="Ti donano la loro conoscienza!! "+" | +25 sulla potenza di tiro & 25 sull'energia|";
    }
    
    
    public void evansManage(){
        OggettoInv ogg;
        
        System.out.println("Ti ospita a pranzo a casa sua--> "+" | +2 elementi nell'inventario |");

         ogg=new OggettoInv("onigiri","energia");
         i.addOggetto(ogg);
            
         ogg=new OggettoInv("ravioli cinesi","potenza tiro");
         i.addOggetto(ogg);
        
         descrizione="Ti ospita a pranzo a casa sua--> "+" | +2 elementi nell'inventario |";
            
          
    }
    
    
    public void campoManage(){
        System.out.println("Allenamento al campo del fiume --> "+" | Migliori le tue abilità, a discapito di un po' di energia");
        p.setEnergia(p.getEnergia()-5);
        p.setPotenzaTiro(p.getPotenzaTiro()+20);
        
        
        if(p.getEnergia()>100)p.setEnergia(100);
        if(p.potenzaTiro>100)p.setPotenzaTiro(100);
        
        if(p.getEnergia()<0)p.setEnergia(0);
        if(p.potenzaTiro<0)p.setPotenzaTiro(0);
        descrizione="Allenamento al campo del fiume --> "+" | Migliori le tue abilità, a discapito di un po' di energia";
    }
    

    @Override
    public String toString() {
        return "GestoreGioco{" + "player=" + p + ",\n inv=" + i + ",\n partitaAttiva=" + partitaAttiva + ", turno=" + turno + ", gestioneTipo=" + gestioneTipo + '}';
    }
    
    
    
    
    
}

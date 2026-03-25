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
    private Personaggio player;
    private Inventario inv;
    private boolean partitaAttiva;
    private int turno;
    private TipoElementale gestioneTipo;

    public GestoreGioco(boolean partitaAttiva, int turno,Personaggio p,Inventario i) {
        this.partitaAttiva = partitaAttiva;
        this.turno = turno;
        this.player=p;
        this.inv=i;
    }
   
    
    
    
    
    public void gestisciEvento( Personaggio p,FormGioco f,Inventario i,OggettoInv ogg){
        turno++;
        String evento=Evento.generaEvento();
        switch (evento){
            case "Vecchie Glorie":
                System.out.println("Icontro con la squadra delle vechhie glorie");
                glorieManage(p);//POSITIVO
                break;
            case "Nonno Evans":
                System.out.println("Incontro nonno Evans");
                evansManage(i);//POSITIVO
                break;
            case "Campo del fiume":
                System.out.println("Allenamento al campo del fiume");
                campoManage(p);//POSITIVO
                break;
            case "Sign.Dark":
                System.out.println("Incontro Sign.dark");
                darkManage(p);//NEGATIVO
                break;
            case "Royal Academy":
                System.out.println("Incontro Royal Academy");
                royalManage(i);//NEGATIVO
                break;
            case "Quinto Settore":
                System.out.println("Incontro quinto settore");
                quintoManage(p,i);//NEGATIVO
            default:
                break;
        }
    }

    public int getTurno() {
        return turno;
    }

   
    
    
    
    public void darkManage(Personaggio p){
        if(p.getTipo().equals(gestioneTipo.TERRA)){
            System.out.println("vinci lo scontro, ma perdei qualcosa");
            p.setEnergia(p.getEnergia()-15);
            p.setPotenzaTiro(p.getPotenzaTiro()-15);
        }else{
            System.out.println("perdi lo scontro");
            p.setEnergia(p.getEnergia()-25);
            p.setPotenzaTiro(p.getPotenzaTiro()-25);
        }
        if(p.getEnergia()>100)p.setEnergia(100);
        if(p.potenzaTiro>100)p.setPotenzaTiro(100);
        
        if(p.getEnergia()<0)p.setEnergia(0);
        if(p.potenzaTiro<0)p.setPotenzaTiro(0);
        
    }
    
    public void royalManage(Inventario i){
        String nome ="onigiri";
        System.out.println("Ti hanno rubato un oggetto dall'inventario");
        i.removeOggetto(nome);
    }
    
    
    public void quintoManage(Personaggio p,Inventario i){
        String nome ="ravioli cinesi";
        if(p.getTipo().equals(gestioneTipo.FUOCO)){
            System.out.println("vinci lo scontro, ma perdi qualcosa");
            p.setEnergia(p.getEnergia()-15);
            i.removeOggetto(nome);
        }else{
            System.out.println("perdi lo scontro");
            p.setEnergia(p.getEnergia()-25);
            p.setPotenzaTiro(p.getPotenzaTiro()-25);
        }
        
        if(p.getEnergia()>100)p.setEnergia(100);
        if(p.potenzaTiro>100)p.setPotenzaTiro(100);
        
        if(p.getEnergia()<0)p.setEnergia(0);
        if(p.potenzaTiro<0)p.setPotenzaTiro(0);
    }
    
    public void glorieManage(Personaggio p){
        System.out.println("Ti donano la loro cooscienza!! "+" | +20 sulla potenza di tiro |");
        p.setPotenzaTiro(p.getPotenzaTiro()+25);
        p.setEnergia(p.getEnergia()+25);
        if(p.getEnergia()>100)p.setEnergia(100);
        if(p.potenzaTiro>100)p.setPotenzaTiro(100);
    }
    
    
    public void evansManage(Inventario inv){
        OggettoInv ogg;
        int i=0;
        System.out.println("Ti ospita a pranzo a casa sua--> "+" | +2 elementi nell'inventario |");

         ogg=new OggettoInv("onigiri","energia");
         inv.addOggetto(ogg);
            
         ogg=new OggettoInv("ravioli cinesi","potenza tiro");
         inv.addOggetto(ogg);
            
          
    }
    
    
    public void campoManage(Personaggio p){
        System.out.println("Allenamento al campo del fiume --> "+" | Migliori le tue abilità, a discapito di un po' di energia");
        p.setEnergia(p.getEnergia()-5);
        p.setPotenzaTiro(p.getPotenzaTiro()+20);
        
        
        if(p.getEnergia()>100)p.setEnergia(100);
        if(p.potenzaTiro>100)p.setPotenzaTiro(100);
        
        if(p.getEnergia()<0)p.setEnergia(0);
        if(p.potenzaTiro<0)p.setPotenzaTiro(0);
    }
    

    @Override
    public String toString() {
        return "GestoreGioco{" + "player=" + player + ",\n inv=" + inv + ",\n partitaAttiva=" + partitaAttiva + ", turno=" + turno + ", gestioneTipo=" + gestioneTipo + '}';
    }
    
    
    
    
    
}

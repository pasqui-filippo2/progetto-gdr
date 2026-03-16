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
    private boolean partitaAttiva;
    private TipoElementale gestioneTipo;
   
    
    public void gestisciEvento( Personaggio p,FormGioco f,Inventario i,OggettoInv ogg){
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
                royalManage(i,ogg);//NEGATIVO
                break;
            case "Quinto Settore":
                System.out.println("Incontro quinto settore");
                quintoManage(p,i,ogg);//NEGATIVO
            default:
                break;
        }
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
    }
    
    public void royalManage(Inventario i,OggettoInv ogg){
        System.out.println("Ti hanno rubato un oggetto dall'inventario");
        i.removeOggetto(ogg);
    }
    
    
    public void quintoManage(Personaggio p,Inventario i,OggettoInv ogg){
        if(p.getTipo().equals(gestioneTipo.FUOCO)){
            System.out.println("vinci lo scontro, ma perdi qualcosa");
            p.setEnergia(p.getEnergia()-15);
            i.removeOggetto(ogg);
        }else{
            System.out.println("perdi lo scontro");
            p.setEnergia(p.getEnergia()-25);
            p.setPotenzaTiro(p.getPotenzaTiro()-25);
        }
    }
    
    public void glorieManage(Personaggio p){
        System.out.println("Ti donano la loro cooscienza!! "+" | +20 sulla potenza di tiro |");
        p.setPotenzaTiro(p.getPotenzaTiro()+25);
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
    }
}

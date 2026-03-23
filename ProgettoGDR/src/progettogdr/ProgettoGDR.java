/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package progettogdr;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author pasqui.filippo
 */
public class ProgettoGDR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException {
        HomeForm fm=new HomeForm();
        
        /*AxelBlaze axel=new AxelBlaze("Axel Blaze",100,0,"tornado di fuoco",TipoElementale.FUOCO);
        Inventario i=new Inventario();
        
        GestoreGioco g1= new GestoreGioco(true,0,axel,i);
        OggettoInv ogg= new OggettoInv("onigiri","energia");
        OggettoInv ogg1= new OggettoInv("ravioli cinesi","potenza di tiro");
        i.addOggetto(ogg);i.addOggetto(ogg1);
        SalvataggioSER ser=new SalvataggioSER(axel,i,g1);
        g1.gestisciEvento(axel, fm, i, ogg);
        System.out.println(i.toString());
        System.out.println(axel.getEnergia());
        //FileManager.salvaFileCSV(axel, i, g1);
        
        FileManager.salvaSER(ser);
        System.out.println("");
        System.out.println("");
        System.out.println("PARITA VECCHIA");
        //System.out.println(FileManager.caricaFileCSV(g1).toString());
        System.out.println(FileManager.caricaSER(g1).toString());
        */
        
    
        fm.setVisible(true);
        
    }   
    
    
}

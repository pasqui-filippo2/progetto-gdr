/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package progettogdr;

/**
 *
 * @author pasqui.filippo
 */
public class ProgettoGDR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FormGioco fm=new FormGioco();
        AxelBlaze axel=new AxelBlaze("Axel Blaze",100,0,"tornado di fuoco",TipoElementale.FUOCO);
        GestoreGioco g1= new GestoreGioco();
        Inventario i=new Inventario();
        OggettoInv ogg= new OggettoInv("onigiri","energia");
        OggettoInv ogg1= new OggettoInv("ravioli cinesi","potenza di tiro");
        i.addOggetto(ogg);i.addOggetto(ogg1);
        g1.gestisciEvento(axel, fm, i, ogg);
        System.out.println(i.toString());
        System.out.println(axel.getEnergia());
    
    }   
    
    
}

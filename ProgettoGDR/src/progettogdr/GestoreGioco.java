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
    
    public void gestisciEvento(Personaggio p, FormGioco f,Inventario i,OggettoInv ogg){
        String evento=Evento.generaEvento();
        switch (evento){
            /*case "Vecchie Glorie":
                p.glorieManage();//POSITIVO
                break;
            case "Nonno Evans":
                p.evansManage();//POSITIVO
                break;
            case "Campo del fiume":
                p.campoManage();//POSITIVO
                break;*/
            case "Sign.Dark":
                System.out.println("Incontro Sign.dark");
                p.darkManage();//NEGATIVO
                break;
            case "Royal Academy":
                System.out.println("Incontro Royal Academy");
                p.royalManage(i,ogg);//NEGATIVO
                break;
            case "Quinto Settore":
                System.out.println("Incontro quinto settore");
                p.quintoManage(i,ogg);//NEGATIVO
            default:
                break;
        }
    }
}

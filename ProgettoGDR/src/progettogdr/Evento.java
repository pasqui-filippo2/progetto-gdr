/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package progettogdr;

import java.util.Random;

/**
 *
 * @author pasqui.filippo
 */
public class Evento {
    private static String nomeEvento;
    private static TipoElementale tipoEv;
    static Random  rnd=new Random();

    public static TipoElementale getTipoEvento() {
        return tipoEv;
    }
    
    
    
    public static String generaEvento(){
        int r=rnd.nextInt(1,7);
        switch (r){
            case 1:
                nomeEvento="Vecchie Glorie";//POSITIVO
                break;
            case 2:
                nomeEvento="Nonno Evans";//POSITIVO
                break;
            case 3:
                nomeEvento="Campo del fiume";//POSITIVO
                break;
            case 4:
                nomeEvento="Sign.Dark";//NEGATIVO
                tipoEv=tipoEv.FUOCO;
                break;
            case 5:
                nomeEvento="Royal Academy";//NEGATIVO
                break;
            case 6:
                nomeEvento="Quinto Settore";//NEGATIVO
                tipoEv=tipoEv.GHIACCIO;
            default:
                break;
        }
        return nomeEvento;
    }
}

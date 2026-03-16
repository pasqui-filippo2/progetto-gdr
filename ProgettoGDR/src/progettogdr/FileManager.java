/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package progettogdr;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author pasqui.filippo
 */
public  class FileManager {
    String file="salvataggioCSV.csv";
    
    
    public void salvaFileCSV(Personaggio p,Inventario i,GestoreGioco g){
        String energia = String.valueOf(p.getEnergia());
        String potenzaTiro=String.valueOf(p.getPotenzaTiro());
        String tipoElementale=p.getTipo().name();
        String turno=String.valueOf(g.getTurno());
        String onigiri=String.valueOf(i.stampaOnigiri());
        String ravioli=String.valueOf(i.stampaRavioli());
        List<String[]> dati=Arrays.asList(
                new String[]{"ENERGIA","POTENZA TIRO","TIPO","TURNO","ONIGIRI","RAVIOLI"},
                new String[]{energia,potenzaTiro,tipoElementale,turno,onigiri,ravioli}
        );
        
        try(BufferedWriter writer=new BufferedWriter(new FileWriter(file))){
            for(String[] line : dati){
               writer.write(String.join(",",line));
               writer.newLine();
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}

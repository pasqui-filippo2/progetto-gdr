/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package progettogdr;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author pasqui.filippo
 */
public  class FileManager {
    static String  file="salvataggioCSV.csv";
    static String  fileSER="salvataggioSER.ser";
    
    
    public static void salvaFileCSV(Personaggio p,Inventario i,GestoreGioco g){
        String nome=p.getNome();
        String tecnica=p.getNomeTecnica();
        String energia = String.valueOf(p.getEnergia());
        String potenzaTiro=String.valueOf(p.getPotenzaTiro());
        String tipoElementale=p.getTipo().name();
        String turno=String.valueOf(g.getTurno());
        String onigiri=String.valueOf(i.stampaOnigiri());
        String ravioli=String.valueOf(i.stampaRavioli());
        List<String[]> dati=Arrays.asList(
                new String[]{"NOME","TECNICA","ENERGIA","POTENZA TIRO","TIPO","TURNO","ONIGIRI","RAVIOLI"},
                new String[]{nome,tecnica,energia,potenzaTiro,tipoElementale,turno,onigiri,ravioli}
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
    
    public static GestoreGioco caricaFileCSV(GestoreGioco g1) throws FileNotFoundException, IOException{
        Inventario i=new Inventario();
        int j=0;int k=0;
        OggettoInv ogg;
        
        try(BufferedReader reader=new BufferedReader(new FileReader(file))){
            String line;
            reader.readLine();
            while((line=reader.readLine())!=null){
                String [] columns=line.split(",");
                //PERSONAGGIO
                String nome=columns[0];
                String tecnica=columns[1];
                int energia=Integer.parseInt(columns[2]);
                int potenza=Integer.parseInt(columns[3]);
                TipoElementale tipo=TipoElementale.valueOf(columns[4]);
                
                //TURNO GESTORE GIOCO
                int turno=Integer.parseInt(columns[5]);
                
                //INVENTARIO
                
                int onigiri=Integer.parseInt(columns[6]);
                int ravioli=Integer.parseInt(columns[7]);
                while(j<onigiri){
                    ogg= new OggettoInv("onigiri","energia");
                    i.addOggetto(ogg);
                    j++;
                }
                while(k<ravioli){
                    ogg= new OggettoInv("ravioli","potenza di tiro");
                    i.addOggetto(ogg);
                    k++;
                }
                
                switch(nome){
                    case "Axel Blaze":
                        AxelBlaze axel=new AxelBlaze(nome,energia,potenza,tecnica,tipo);
                        g1=new GestoreGioco(true,turno,axel,i);
                        break;
                    case "Shawn Frost":
                        ShawnFrost shawn=new ShawnFrost(nome,energia,potenza,tecnica,tipo);
                        g1=new GestoreGioco(true,turno,shawn,i);
                        break;
                    case "Aitor Cazado":
                        AitorCazado aitor=new AitorCazado(nome,energia,potenza,tecnica,tipo);
                        g1=new GestoreGioco(true,turno,aitor,i);
                }
                
            }
        }
        return g1;
    }
    
    
    
    public static void salvaSER(SalvataggioSER ser) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileSER))) {
            oos.writeObject(ser);
        }   catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    
    public static GestoreGioco caricaSER(GestoreGioco g1) throws FileNotFoundException, IOException, ClassNotFoundException{
      SalvataggioSER ser;
      Inventario i=new Inventario();
      int j=0,k=0;
      OggettoInv ogg;
        try(ObjectInputStream ois= new ObjectInputStream(new FileInputStream(fileSER))){
           ser=(SalvataggioSER) ois.readObject();
          
      }  
       String nome=ser.getNome();
        int onigiri = ser.getOnigiri();
        int ravioli=ser.getRavioli();
        
        while (j < onigiri) {
            ogg = new OggettoInv("onigiri", "energia");
            i.addOggetto(ogg);
            j++;
        }
        while (k < ravioli) {
            ogg = new OggettoInv("ravioli", "potenza di tiro");
            i.addOggetto(ogg);
            k++;
        }
       switch(nome){
                    case "Axel Blaze":
                        AxelBlaze axel=new AxelBlaze(nome,ser.getEnergia(),ser.getPotenza(),ser.getTecnica(),ser.getTipo());
                        g1=new GestoreGioco(true,ser.getTurno(),axel,i);
                        break;
                    case "Shawn Frost":
                        ShawnFrost shawn=new ShawnFrost(nome,ser.getEnergia(),ser.getPotenza(),ser.getTecnica(),ser.getTipo());
                        g1=new GestoreGioco(true,ser.getTurno(),shawn,i);
                        break;
                    case "Aitor Cazado":
                        AitorCazado aitor=new AitorCazado(nome,ser.getEnergia(),ser.getPotenza(),ser.getTecnica(),ser.getTipo());
                        g1=new GestoreGioco(true,ser.getTurno(),aitor,i);
                }
       
       return g1;
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package progettogdr;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author pasqui.filippo
 */
public class FormGioco extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(FormGioco.class.getName());
    private Inventario i;OggettoInv ogg,ogg1;//inventario & oggetti
    private GestoreGioco gestore;
    Personaggio p;
    
    
    
    public FormGioco() {
        initComponents();
        ogg=new OggettoInv("onigiri","energia");
        ogg1= new OggettoInv("ravioli cinesi","potenza di tiro");
        i=new Inventario();
        gestore=new GestoreGioco(true,0,p,i);
        lblEvento.setIcon(null);
        btnTecnica.setEnabled(false);
        lblElemento.setIcon(null);
        lblElementoEv.setIcon(null);
        
    }
    
    public void setImage (String nome){
        switch (nome){
            case "Axel Blaze":
                lblPersonaggio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foto/axel.png")));
                lblElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foto/fuoco.png")));
                p=new AxelBlaze("Axel Blaze",100,0,"tornado di fuoco",TipoElementale.FUOCO);
                gestore.setP(p);
                barEnergia.setValue(p.getEnergia());              
                i.addOggetto(ogg);
                lblNumO.setText(Integer.toString(i.stampaOnigiri()));
                
                break;
            case "Shawn Frost":
                lblPersonaggio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foto/shawn.png")));
                lblElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foto/ice.png")));
                p=new ShawnFrost("Shawn Frost",100,0,"tormenta glaciale",TipoElementale.GHIACCIO);
                gestore.setP(p);
                barEnergia.setValue(p.getEnergia());
                i.addOggetto(ogg1);
                lblNumR.setText(Integer.toString(i.stampaRavioli()));
                break;
            case "Aitor Cazador":
                lblPersonaggio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foto/aitor.png")));
                lblElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foto/terra.png")));
                p=new AitorCazado("Aitor Cazador",100,0,"rete da caccia",TipoElementale.TERRA);
                gestore.setP(p);
                barEnergia.setValue(p.getEnergia());
                i.addOggetto(ogg);
                lblNumO.setText(Integer.toString(i.stampaOnigiri()));
                
            default:
              break;
        }
    }
    
    public void setEvent(String ev){
        
        switch (ev){
            case "Nonno Evans":
                lblEvento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foto/NonnoEvans.png")));
                break;
            case "Campo del fiume":
                 lblEvento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foto/allenamento.png")));
                 break;
            case "Vecchie Glorie":
                 lblEvento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foto/hilman.png")));
                 break;
            case "Quinto Settore":
                 lblEvento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foto/zabel.png")));
                 lblElementoEv.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foto/ice.png")));
                 break;
            case "Sign.Dark":
                 lblElementoEv.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foto/fuoco.png")));
                 lblEvento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foto/dark1.png")));
                 break;
            case "Royal Academy":
                 lblEvento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foto/JudeSharp.png")));
                 break;
            default:
                break;
                
        }
    }
    
     public void setImageFile (String nome){
        switch (nome){
            case "Axel Blaze":
                lblPersonaggio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foto/axel.png")));
                lblElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foto/fuoco.png")));
                break;
            case "Shawn Frost":
                lblPersonaggio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foto/shawn.png")));
                lblElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foto/ice.png")));                
                break;
            case "Aitor Cazador":
                lblPersonaggio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foto/aitor.png")));
                lblElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foto/terra.png")));
            default:
              break;
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PopUpElementi = new javax.swing.JDialog();
        BackGame = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        scrollEvents = new javax.swing.JScrollPane();
        txtEvent = new javax.swing.JTextArea();
        btnProcedi = new javax.swing.JButton();
        btnTecnica = new javax.swing.JButton();
        lblPot = new javax.swing.JLabel();
        lblEnergia = new javax.swing.JLabel();
        btnCaricaSER = new javax.swing.JButton();
        btnUsaRavioli = new javax.swing.JButton();
        btnUsaOnigiri = new javax.swing.JButton();
        lblNumO = new javax.swing.JLabel();
        lblNumR = new javax.swing.JLabel();
        btnCaricaCSV = new javax.swing.JButton();
        btnCSV = new javax.swing.JButton();
        btnSER1 = new javax.swing.JButton();
        barEnergia = new javax.swing.JProgressBar();
        barPotenzaTiro = new javax.swing.JProgressBar();
        btnElementi = new javax.swing.JButton();
        lblElemento = new javax.swing.JLabel();
        lblElementoEv = new javax.swing.JLabel();
        lblTurno = new javax.swing.JLabel();
        lblMostraP = new javax.swing.JLabel();
        lblEvento = new javax.swing.JLabel();
        lblMostraI = new javax.swing.JLabel();
        lblPersonaggio = new javax.swing.JLabel();
        lblSfondo = new javax.swing.JLabel();

        PopUpElementi.setModal(true);
        PopUpElementi.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BackGame.setFont(new java.awt.Font("SimSun", 1, 12)); // NOI18N
        BackGame.setText("GIOCA!");
        BackGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackGameActionPerformed(evt);
            }
        });
        PopUpElementi.getContentPane().add(BackGame, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 80, -1));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foto/elements.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        PopUpElementi.getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 390, 260));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        scrollEvents.setBackground(new java.awt.Color(255, 255, 255));

        txtEvent.setColumns(20);
        txtEvent.setLineWrap(true);
        txtEvent.setRows(5);
        txtEvent.setWrapStyleWord(true);
        scrollEvents.setViewportView(txtEvent);

        getContentPane().add(scrollEvents, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 60, 240, 390));

        btnProcedi.setFont(new java.awt.Font("SimSun", 1, 18)); // NOI18N
        btnProcedi.setText("AVANZA");
        btnProcedi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcediActionPerformed(evt);
            }
        });
        getContentPane().add(btnProcedi, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 460, 240, 40));

        btnTecnica.setText("TECNICA SPECIALE");
        btnTecnica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTecnicaActionPerformed(evt);
            }
        });
        getContentPane().add(btnTecnica, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 490, 160, -1));

        lblPot.setText("POTENZA DI TIRO");
        getContentPane().add(lblPot, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 530, 110, 20));

        lblEnergia.setText("ENERGIA");
        getContentPane().add(lblEnergia, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 570, 60, -1));

        btnCaricaSER.setText("CaricaSER");
        btnCaricaSER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCaricaSERActionPerformed(evt);
            }
        });
        getContentPane().add(btnCaricaSER, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 550, 120, 30));

        btnUsaRavioli.setText("Ravioli cinesi");
        btnUsaRavioli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsaRavioliActionPerformed(evt);
            }
        });
        getContentPane().add(btnUsaRavioli, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 550, 110, -1));

        btnUsaOnigiri.setText("Onigiri");
        btnUsaOnigiri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsaOnigiriActionPerformed(evt);
            }
        });
        getContentPane().add(btnUsaOnigiri, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 490, 110, -1));

        lblNumO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNumO.setText("0");
        getContentPane().add(lblNumO, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 520, 50, -1));

        lblNumR.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNumR.setText("0");
        getContentPane().add(lblNumR, new org.netbeans.lib.awtextra.AbsoluteConstraints(373, 580, 40, -1));

        btnCaricaCSV.setText("CaricaCSV");
        btnCaricaCSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCaricaCSVActionPerformed(evt);
            }
        });
        getContentPane().add(btnCaricaCSV, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 550, 110, 30));

        btnCSV.setText("SalvaCSV");
        btnCSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCSVActionPerformed(evt);
            }
        });
        getContentPane().add(btnCSV, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 510, 110, 30));

        btnSER1.setText("SalvaSER");
        btnSER1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSER1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnSER1, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 510, 120, 30));

        barEnergia.setBackground(new java.awt.Color(255, 255, 255));
        barEnergia.setFont(new java.awt.Font("Segoe UI Black", 1, 10)); // NOI18N
        barEnergia.setForeground(new java.awt.Color(102, 255, 204));
        barEnergia.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        barEnergia.setStringPainted(true);
        getContentPane().add(barEnergia, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 570, 160, 20));

        barPotenzaTiro.setBackground(new java.awt.Color(255, 255, 255));
        barPotenzaTiro.setFont(new java.awt.Font("Segoe UI Black", 0, 10)); // NOI18N
        barPotenzaTiro.setForeground(new java.awt.Color(255, 102, 102));
        barPotenzaTiro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        barPotenzaTiro.setStringPainted(true);
        getContentPane().add(barPotenzaTiro, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 530, 160, 20));

        btnElementi.setText("Tipi Elementali");
        btnElementi.setBorder(null);
        btnElementi.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnElementi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnElementiActionPerformed(evt);
            }
        });
        getContentPane().add(btnElementi, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 110, -1));

        lblElemento.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foto/fuoco.png"))); // NOI18N
        lblElemento.setText("jLabel2");
        getContentPane().add(lblElemento, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 390, 80, 70));

        lblElementoEv.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblElementoEv.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foto/fuoco.png"))); // NOI18N
        getContentPane().add(lblElementoEv, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 500, 80, 70));

        lblTurno.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblTurno.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTurno.setText("0");
        lblTurno.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "TURNO", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SimSun", 1, 18))); // NOI18N
        getContentPane().add(lblTurno, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 0, 240, 60));

        lblMostraP.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMostraP.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(""), "PERSONAGGIO", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Serif", 1, 14))); // NOI18N
        getContentPane().add(lblMostraP, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, 300, 130));

        lblEvento.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEvento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foto/allenamento.png"))); // NOI18N
        lblEvento.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(lblEvento, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 80, 310, 500));

        lblMostraI.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "INVENTARIO", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Serif", 1, 14))); // NOI18N
        getContentPane().add(lblMostraI, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 470, 150, 130));

        lblPersonaggio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPersonaggio.setText("jLabel2");
        lblPersonaggio.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(lblPersonaggio, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 150, 460));

        lblSfondo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSfondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/progettogdr/foto/sfondoGioco.png"))); // NOI18N
        getContentPane().add(lblSfondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-70, 0, 1140, 620));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnUsaRavioliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsaRavioliActionPerformed
        p.usaOggetto(i,"ravioli cinesi", p);
        barPotenzaTiro.setValue(p.getPotenzaTiro());
        lblNumR.setText(""+i.stampaRavioli());
    }//GEN-LAST:event_btnUsaRavioliActionPerformed

    private void btnProcediActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcediActionPerformed
        lblElementoEv.setIcon(null);
        gestore.gestisciEvento(this);
        txtEvent.append(gestore.getDescrizione() + "\n"+" ----------------------------------"+"\n");
        barEnergia.setValue(p.getEnergia());
        barPotenzaTiro.setValue(p.getPotenzaTiro());
        lblTurno.setText(Integer.toString(gestore.getTurno()));
        lblNumO.setText(""+i.stampaOnigiri());
        lblNumR.setText(""+i.stampaRavioli());
        if(p.getPotenzaTiro()==100){
            btnTecnica.setEnabled(true);
        }
        if(i.stampaOnigiri()==0){
            btnUsaOnigiri.setEnabled(false);
        }
        else{
            btnUsaOnigiri.setEnabled(true);
        }
        if(i.stampaRavioli()==0){
            btnUsaRavioli.setEnabled(false);
        }else{
            btnUsaRavioli.setEnabled(true);
        }  
    }//GEN-LAST:event_btnProcediActionPerformed

    private void btnTecnicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTecnicaActionPerformed
        p.tecnicaSpeciale();
        barEnergia.setValue(p.getEnergia());
        barPotenzaTiro.setValue(p.getPotenzaTiro());
    }//GEN-LAST:event_btnTecnicaActionPerformed

    private void btnCaricaCSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCaricaCSVActionPerformed
        try {
            this.gestore=FileManager.caricaFileCSV(gestore);
            txtEvent.setText(null);
            setImageFile(gestore.getP().getNome());
            barEnergia.setValue(gestore.getP().getEnergia());
            barPotenzaTiro.setValue(gestore.getP().getPotenzaTiro());
            lblNumO.setText(""+gestore.getI().stampaOnigiri());
            lblNumR.setText(""+gestore.getI().stampaRavioli());
            lblTurno.setText(Integer.toString(gestore.getTurno()));
        } catch (IOException ex) {
            System.getLogger(FormGioco.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
    }//GEN-LAST:event_btnCaricaCSVActionPerformed

    private void btnCSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCSVActionPerformed
        FileManager.salvaFileCSV(p, i, gestore);
    }//GEN-LAST:event_btnCSVActionPerformed

    private void btnSER1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSER1ActionPerformed
        SalvataggioSER ser= new SalvataggioSER(p,i,gestore);
        FileManager.salvaSER(ser);
    }//GEN-LAST:event_btnSER1ActionPerformed

    private void btnCaricaSERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCaricaSERActionPerformed
        try {
            this.gestore=FileManager.caricaSER(gestore);
            txtEvent.setText(null);
            setImageFile(gestore.getP().getNome());
            barEnergia.setValue(gestore.getP().getEnergia());
            barPotenzaTiro.setValue(gestore.getP().getPotenzaTiro());
            lblNumO.setText(""+gestore.getI().stampaOnigiri());
            lblNumR.setText(""+gestore.getI().stampaRavioli());
            lblTurno.setText(Integer.toString(gestore.getTurno()));
        } catch (IOException ex) {
            System.getLogger(FormGioco.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        } catch (ClassNotFoundException ex) {
            System.getLogger(FormGioco.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
    }//GEN-LAST:event_btnCaricaSERActionPerformed

    private void BackGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackGameActionPerformed
        PopUpElementi.dispose();
    }//GEN-LAST:event_BackGameActionPerformed

    private void btnElementiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnElementiActionPerformed
        PopUpElementi.setSize(400,250);
        PopUpElementi.setVisible(true);
    }//GEN-LAST:event_btnElementiActionPerformed

    private void btnUsaOnigiriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsaOnigiriActionPerformed
        p.usaOggetto(i,"onigiri", p);
        barEnergia.setValue(gestore.getP().getEnergia());
        lblNumO.setText(""+i.stampaOnigiri());
        
    }//GEN-LAST:event_btnUsaOnigiriActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new FormGioco().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackGame;
    private javax.swing.JDialog PopUpElementi;
    private javax.swing.JProgressBar barEnergia;
    private javax.swing.JProgressBar barPotenzaTiro;
    private javax.swing.JButton btnCSV;
    private javax.swing.JButton btnCaricaCSV;
    private javax.swing.JButton btnCaricaSER;
    private javax.swing.JButton btnElementi;
    private javax.swing.JButton btnProcedi;
    private javax.swing.JButton btnSER1;
    private javax.swing.JButton btnTecnica;
    private javax.swing.JButton btnUsaOnigiri;
    private javax.swing.JButton btnUsaRavioli;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblElemento;
    private javax.swing.JLabel lblElementoEv;
    private javax.swing.JLabel lblEnergia;
    private javax.swing.JLabel lblEvento;
    private javax.swing.JLabel lblMostraI;
    private javax.swing.JLabel lblMostraP;
    private javax.swing.JLabel lblNumO;
    private javax.swing.JLabel lblNumR;
    private javax.swing.JLabel lblPersonaggio;
    private javax.swing.JLabel lblPot;
    private javax.swing.JLabel lblSfondo;
    private javax.swing.JLabel lblTurno;
    private javax.swing.JScrollPane scrollEvents;
    private javax.swing.JTextArea txtEvent;
    // End of variables declaration//GEN-END:variables
}

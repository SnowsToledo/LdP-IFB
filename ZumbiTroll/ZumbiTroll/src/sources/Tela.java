package sources;

public class Tela extends javax.swing.JFrame {
    public Tela() {
        initComponents();
    }
    static int option,aux,continua=1;
    static int acao,cont=0;
    static String conteudo,str;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblValor = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        text = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(1, 1, 1));
        setResizable(false);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/graphics-1658177_960_720.png"))); // NOI18N

        jLabel1.setForeground(new java.awt.Color(5, 0, 0));
        jLabel1.setText("O que deseja fazer(digite uma opção):)");
        jLabel1.setToolTipText("");

        lblValor.setBackground(new java.awt.Color(1, 1, 1));
        lblValor.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        lblValor.setForeground(new java.awt.Color(255, 0, 0));
        lblValor.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        lblValor.setToolTipText("");

        jButton2.setText("Confirmar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane2.setAutoscrolls(true);

        text.setEditable(false);
        text.setBackground(new java.awt.Color(1, 1, 1));
        text.setColumns(20);
        text.setFont(new java.awt.Font("Ubuntu", 1, 16)); // NOI18N
        text.setForeground(new java.awt.Color(255, 0, 0));
        text.setLineWrap(true);
        text.setRows(5);
        jScrollPane2.setViewportView(text);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 712, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(lblValor, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(95, 95, 95)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblValor, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE))
                .addGap(0, 29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        option = Integer.parseInt(lblValor.getText());
        lblValor.setText("");
        cont+=1;
        historia(option,cont);
    }//GEN-LAST:event_jButton2ActionPerformed

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
       /* Create and display the form */
       Tela t = new Tela();
       Textos texto = new Textos();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                t.setVisible(true);
                str = texto.intro;
                t.text.setText(str);   
            }
        });    
    }
    public void historia(int decisao,int cont){
        Textos texto = new Textos();
        //Tela t = new Tela();
        switch(cont){
            case 1://introdução
                if(continua ==1){
                    if(decisao==1){
                        this.text.append(texto.ini+texto.a1);
                    }else{
                        this.text.append(texto.nini);
                        continua = 0;
                        
                    }
                }
                break;
            case 2://ir ao terraço ou ficar no AP
                if(continua ==1){
                    if(decisao==1){
                        this.text.append(texto.b1);
                        continua = 0;
                    }else{
                       this.text.append(texto.b2); 
                    }
                }
                break;
            case 3://escolha de Armas
                if(continua ==1){
                    if(decisao==1){
                        this.text.append(texto.b2_1);
                        continua = 0;
                    }else if(decisao==2){
                        this.text.append(texto.b2_2);
                        continua = 0;
                    }else{
                        this.text.append(texto.c);
                    }
                }
                break;
            case 4://Matando o 1° zumbi
                if(continua ==1){
                    if(decisao==1){
                        this.text.append(texto.c1);
                        continua = 0;
                    }else if(decisao==2){
                        this.text.append(texto.c2);
                        continua = 0;
                    }else{
                        this.text.append(texto.c3+texto.d);
                    }
                }
                break;
            case 5://Chamar exército
                if(continua ==1){
                    if(decisao==1){
                        this.text.append(texto.d1);
                    }else{
                        this.text.append(texto.d2);
                        continua = 0;
                    }
                }
                break;
            case 6://Ajudar garoto
                if(continua ==1){
                    if(decisao==1){
                        this.text.append(texto.e1);
                        continua = 0;
                    }else{
                        this.text.append(texto.e2);
                    }
                }    
                break;            
        }    
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField lblValor;
    private javax.swing.JTextArea text;
    // End of variables declaration//GEN-END:variables
}
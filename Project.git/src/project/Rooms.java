/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.util.ArrayList;
import javax.swing.JLabel;

/**
 *
 * @author Oğuzhan
 */
public class Rooms extends javax.swing.JFrame {
     JLabel[] labelk=new JLabel[18];
     JLabel[] labeld=new JLabel[18];
     JLabel[] labels=new JLabel[18];
     JLabel[] labelsl = new JLabel[18]; 
    /**
     * Creates new form Rooms
     */
    public Rooms() {
        initComponents();
      
      
   
        
    }
    public void initial(ArrayList<Person> A)
    {
        int i,j;
       labelk[0] = K100;
       labelk[1] = K101;
       labelk[2] = K102;
       labelk[3] = K103;
       labelk[4] = K104;
       labelk[5] = K105;
       labelk[6] = K106;
       labelk[7] = K107;
       labelk[8] = K108;
       labelk[9] = K109;
       labelk[10] = K110;
       labelk[11] = K111;
       labelk[12] = K112;
       labelk[13] = K113;
       labelk[14] = K114;
       labelk[15] = K115;
       labelk[16] = K116;
       labelk[17] = K117;
       labeld[0] = L100;
       labeld[1] = L101;
       labeld[2] = L102;
       labeld[3] = L103;
       labeld[4] = L104;
       labeld[5] = L105;
       labeld[6] = L106;
       labeld[7] = L107;
       labeld[8] = L108;
       labeld[9] = L109;
       labeld[10] = L110;
       labeld[11] = L111;
       labeld[12] = L112;
       labeld[13] = L113;
       labeld[14] = L114;
       labeld[15] = L115;
       labeld[16] = L116;
       labeld[17] = L117;
       labels[0] = S100;
       labels[1] = S101;
       labels[2] = S102;
       labels[3] = S103;
       labels[4] = S104;
       labels[5] = S105;
       labels[6] = S106;
       labels[7] = S107;
       labels[8] = S108;
       labels[9] = S109;
       labels[10] = S110;
       labels[11] = S111;
       labels[12] = S112;
       labels[13] = S113;
       labels[14] = S114;
       labels[15] = S115;
       labels[16] = S116;
       labels[17] = S117;
       labelsl[0] = Z100;
       labelsl[1] = Z101;
       labelsl[2] = Z102;
       labelsl[3] = Z103;
       labelsl[4] = Z104;
       labelsl[5] = Z105;
       labelsl[6] = Z106;
       labelsl[7] = Z107;
       labelsl[8] = Z108;
       labelsl[9] = Z109;
       labelsl[10] = Z110;
       labelsl[11] = Z111;
       labelsl[12] = Z112;
       labelsl[13] = Z113;
       labelsl[14] = Z114;
       labelsl[15] = Z115;
       labelsl[16] = Z116;
       labelsl[17] = Z117;
       
       int val;
     for( i = 0 ; i < A.size() ; i++ )
     {
     switch (A.get(i).getRoomNumber().charAt(0)) {
                case 'S':
                    val = Integer.parseInt(A.get(i).getRoomNumber().substring(2));
                    labels[val].setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/red.jpg")));
                    break;
                case 'K':
                    val = Integer.parseInt(A.get(i).getRoomNumber().substring(2));
                    labelk[val].setIcon(new javax.swing.ImageIcon(getClass().getResource("red.jpg")));
                    break;
                case 'L':
                    val = Integer.parseInt(A.get(i).getRoomNumber().substring(2));
                    labeld[val].setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/red.jpg")));
                    break;
                 case 'Z':
                    val = Integer.parseInt(A.get(i).getRoomNumber().substring(2));
                    labelsl[val].setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/red.jpg")));    
                    break;
                    default:
                    break;
            }
     
     
     }
        
       
     
    }
    public void changeColor(String L,char x)
    {
        int val;
       labelk[0] = K100;
       labelk[1] = K101;
       labelk[2] = K102;
       labelk[3] = K103;
       labelk[4] = K104;
       labelk[5] = K105;
       labelk[6] = K106;
       labelk[7] = K107;
       labelk[8] = K108;
       labelk[9] = K109;
       labelk[10] = K110;
       labelk[11] = K111;
       labelk[12] = K112;
       labelk[13] = K113;
       labelk[14] = K114;
       labelk[15] = K115;
       labelk[16] = K116;
       labelk[17] = K117;
       labeld[0] = L100;
       labeld[1] = L101;
       labeld[2] = L102;
       labeld[3] = L103;
       labeld[4] = L104;
       labeld[5] = L105;
       labeld[6] = L106;
       labeld[7] = L107;
       labeld[8] = L108;
       labeld[9] = L109;
       labeld[10] = L110;
       labeld[11] = L111;
       labeld[12] = L112;
       labeld[13] = L113;
       labeld[14] = L114;
       labeld[15] = L115;
       labeld[16] = L116;
       labeld[17] = L117;
       labels[0] = S100;
       labels[1] = S101;
       labels[2] = S102;
       labels[3] = S103;
       labels[4] = S104;
       labels[5] = S105;
       labels[6] = S106;
       labels[7] = S107;
       labels[8] = S108;
       labels[9] = S109;
       labels[10] = S110;
       labels[11] = S111;
       labels[12] = S112;
       labels[13] = S113;
       labels[14] = S114;
       labels[15] = S115;
       labels[16] = S116;
       labels[17] = S117;
       labelsl[0] = Z100;
       labelsl[1] = Z101;
       labelsl[2] = Z102;
       labelsl[3] = Z103;
       labelsl[4] = Z104;
       labelsl[5] = Z105;
       labelsl[6] = Z106;
       labelsl[7] = Z107;
       labelsl[8] = Z108;
       labelsl[9] = Z109;
       labelsl[10] = Z110;
       labelsl[11] = Z111;
       labelsl[12] = Z112;
       labelsl[13] = Z113;
       labelsl[14] = Z114;
       labelsl[15] = Z115;
       labelsl[16] = Z116;
       labelsl[17] = Z117;
       
           if(x == 'A')
            switch (L.charAt(0)) {
                case 'S':
                    val = Integer.parseInt(L.substring(2));
                    labels[val].setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/red.jpg")));
                    break;
                case 'K':
                    val = Integer.parseInt(L.substring(2));
                    labelk[val].setIcon(new javax.swing.ImageIcon(getClass().getResource("red.jpg")));
                    break;
                case 'L':
                    val = Integer.parseInt(L.substring(2));
                    labeld[val].setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/red.jpg")));
                    break;
                case 'Z':
                    val = Integer.parseInt(L.substring(2));
                    labelsl[val].setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/red.jpg")));
                    break;    
                    default:
                    break;
            }
           else if(x == 'E'){
               
            switch (L.charAt(0)) {
                case 'S':
                    val = Integer.parseInt(L.substring(2));
                    
                    labels[val].setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/green.jpg")));
                    break;
                case 'K':
                    val = Integer.parseInt(L.substring(2));
                    
                    labelk[val].setIcon(new javax.swing.ImageIcon(getClass().getResource("green.jpg")));
                  
                    break;
                case 'L':
                    val = Integer.parseInt(L.substring(2));
                    
                    labeld[val].setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/green.jpg")));
                    break;
                case 'Z':
                val = Integer.parseInt(L.substring(2));
                
                labelsl[val].setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/green.jpg")));
                break;
                default:
                break;
            }
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

        Rooms = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        K100 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        K106 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        K112 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        K101 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        K107 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        K113 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        K102 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        K108 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        K114 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        K103 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        K109 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        K115 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        K104 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        K110 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        K116 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        K105 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        K111 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        K117 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        L100 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        L103 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        L109 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        L105 = new javax.swing.JLabel();
        L115 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        L111 = new javax.swing.JLabel();
        L106 = new javax.swing.JLabel();
        L104 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        L117 = new javax.swing.JLabel();
        L112 = new javax.swing.JLabel();
        L110 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        L101 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        L116 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        L107 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        L113 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        L102 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        L108 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        L114 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        Z100 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        Z103 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        Z109 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        Z105 = new javax.swing.JLabel();
        Z115 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        Z111 = new javax.swing.JLabel();
        Z106 = new javax.swing.JLabel();
        Z104 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        Z117 = new javax.swing.JLabel();
        Z112 = new javax.swing.JLabel();
        Z110 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        Z101 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        Z116 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        Z107 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        Z113 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        Z102 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        Z108 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        Z114 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        S116 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        S115 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        S111 = new javax.swing.JLabel();
        S106 = new javax.swing.JLabel();
        S104 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        S107 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        S113 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        S102 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        S108 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        S114 = new javax.swing.JLabel();
        S100 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        S103 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        S109 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        S105 = new javax.swing.JLabel();
        S117 = new javax.swing.JLabel();
        S112 = new javax.swing.JLabel();
        S110 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        jLabel86 = new javax.swing.JLabel();
        S101 = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        K100.setBackground(new java.awt.Color(0, 255, 0));
        K100.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        K100.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/green.jpg"))); // NOI18N
        K100.setToolTipText("");
        K100.setAutoscrolls(true);
        K100.setMaximumSize(new java.awt.Dimension(50, 50));
        K100.setVerifyInputWhenFocusTarget(false);
        K100.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        jLabel1.setText("K100");

        K106.setBackground(new java.awt.Color(0, 255, 0));
        K106.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        K106.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/green.jpg"))); // NOI18N
        K106.setToolTipText("");
        K106.setAutoscrolls(true);
        K106.setMaximumSize(new java.awt.Dimension(50, 50));
        K106.setVerifyInputWhenFocusTarget(false);
        K106.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        jLabel2.setText("K106");

        K112.setBackground(new java.awt.Color(0, 255, 0));
        K112.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        K112.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/green.jpg"))); // NOI18N
        K112.setToolTipText("");
        K112.setAutoscrolls(true);
        K112.setMaximumSize(new java.awt.Dimension(50, 50));
        K112.setVerifyInputWhenFocusTarget(false);
        K112.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        jLabel3.setText("K112");

        K101.setBackground(new java.awt.Color(0, 255, 0));
        K101.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        K101.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/green.jpg"))); // NOI18N
        K101.setToolTipText("");
        K101.setAutoscrolls(true);
        K101.setMaximumSize(new java.awt.Dimension(50, 50));
        K101.setVerifyInputWhenFocusTarget(false);
        K101.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        jLabel4.setText("K101");

        K107.setBackground(new java.awt.Color(0, 255, 0));
        K107.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        K107.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/green.jpg"))); // NOI18N
        K107.setToolTipText("");
        K107.setAutoscrolls(true);
        K107.setMaximumSize(new java.awt.Dimension(50, 50));
        K107.setVerifyInputWhenFocusTarget(false);
        K107.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        jLabel5.setText("K107");

        K113.setBackground(new java.awt.Color(0, 255, 0));
        K113.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        K113.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/green.jpg"))); // NOI18N
        K113.setToolTipText("");
        K113.setAutoscrolls(true);
        K113.setMaximumSize(new java.awt.Dimension(50, 50));
        K113.setVerifyInputWhenFocusTarget(false);
        K113.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        jLabel6.setText("K113");

        K102.setBackground(new java.awt.Color(0, 255, 0));
        K102.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        K102.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/green.jpg"))); // NOI18N
        K102.setToolTipText("");
        K102.setAutoscrolls(true);
        K102.setMaximumSize(new java.awt.Dimension(50, 50));
        K102.setVerifyInputWhenFocusTarget(false);
        K102.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        jLabel7.setText("K102");

        K108.setBackground(new java.awt.Color(0, 255, 0));
        K108.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        K108.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/green.jpg"))); // NOI18N
        K108.setToolTipText("");
        K108.setAutoscrolls(true);
        K108.setMaximumSize(new java.awt.Dimension(50, 50));
        K108.setVerifyInputWhenFocusTarget(false);
        K108.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        jLabel8.setText("K108");

        K114.setBackground(new java.awt.Color(0, 255, 0));
        K114.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        K114.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/green.jpg"))); // NOI18N
        K114.setToolTipText("");
        K114.setAutoscrolls(true);
        K114.setMaximumSize(new java.awt.Dimension(50, 50));
        K114.setVerifyInputWhenFocusTarget(false);
        K114.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        jLabel9.setText("K114");

        K103.setBackground(new java.awt.Color(0, 255, 0));
        K103.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        K103.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/green.jpg"))); // NOI18N
        K103.setToolTipText("");
        K103.setAutoscrolls(true);
        K103.setMaximumSize(new java.awt.Dimension(50, 50));
        K103.setVerifyInputWhenFocusTarget(false);
        K103.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        jLabel10.setText("K103");

        K109.setBackground(new java.awt.Color(0, 255, 0));
        K109.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        K109.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/green.jpg"))); // NOI18N
        K109.setToolTipText("");
        K109.setAutoscrolls(true);
        K109.setMaximumSize(new java.awt.Dimension(50, 50));
        K109.setVerifyInputWhenFocusTarget(false);
        K109.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        jLabel11.setText("K109");

        K115.setBackground(new java.awt.Color(0, 255, 0));
        K115.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        K115.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/green.jpg"))); // NOI18N
        K115.setToolTipText("");
        K115.setAutoscrolls(true);
        K115.setMaximumSize(new java.awt.Dimension(50, 50));
        K115.setVerifyInputWhenFocusTarget(false);
        K115.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        jLabel12.setText("K115");

        K104.setBackground(new java.awt.Color(0, 255, 0));
        K104.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        K104.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/green.jpg"))); // NOI18N
        K104.setToolTipText("");
        K104.setAutoscrolls(true);
        K104.setMaximumSize(new java.awt.Dimension(50, 50));
        K104.setVerifyInputWhenFocusTarget(false);
        K104.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        jLabel13.setText("K104");

        K110.setBackground(new java.awt.Color(0, 255, 0));
        K110.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        K110.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/green.jpg"))); // NOI18N
        K110.setToolTipText("");
        K110.setAutoscrolls(true);
        K110.setMaximumSize(new java.awt.Dimension(50, 50));
        K110.setVerifyInputWhenFocusTarget(false);
        K110.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        jLabel14.setText("K110");

        K116.setBackground(new java.awt.Color(0, 255, 0));
        K116.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        K116.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/green.jpg"))); // NOI18N
        K116.setToolTipText("");
        K116.setAutoscrolls(true);
        K116.setMaximumSize(new java.awt.Dimension(50, 50));
        K116.setVerifyInputWhenFocusTarget(false);
        K116.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        jLabel15.setText("K116");

        K105.setBackground(new java.awt.Color(0, 255, 0));
        K105.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        K105.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/green.jpg"))); // NOI18N
        K105.setToolTipText("");
        K105.setAutoscrolls(true);
        K105.setMaximumSize(new java.awt.Dimension(50, 50));
        K105.setVerifyInputWhenFocusTarget(false);
        K105.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        jLabel46.setText("K105");

        K111.setBackground(new java.awt.Color(0, 255, 0));
        K111.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        K111.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/green.jpg"))); // NOI18N
        K111.setToolTipText("");
        K111.setAutoscrolls(true);
        K111.setMaximumSize(new java.awt.Dimension(50, 50));
        K111.setVerifyInputWhenFocusTarget(false);
        K111.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        jLabel47.setText("K111");

        K117.setBackground(new java.awt.Color(0, 255, 0));
        K117.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        K117.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/green.jpg"))); // NOI18N
        K117.setToolTipText("");
        K117.setAutoscrolls(true);
        K117.setMaximumSize(new java.awt.Dimension(50, 50));
        K117.setVerifyInputWhenFocusTarget(false);
        K117.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        jLabel48.setText("K117");

        jLabel41.setText("1st Floor");

        jLabel42.setText("2nd Floor");

        jLabel43.setText("3rd Floor");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel43)
                    .addComponent(jLabel41)
                    .addComponent(jLabel42))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(K100, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(12, 12, 12)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(K106, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(K112, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(K101, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(12, 12, 12)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(K107, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(K113, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(K102, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(12, 12, 12)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(K108, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(K114, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(K103, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(12, 12, 12)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(K109, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(K115, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(K104, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(12, 12, 12)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(K110, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(K116, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(12, 12, 12)
                            .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(K111, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(K117, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(K105, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(K105, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(K111, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(K117, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(K104, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(K110, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(K116, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(K103, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(K109, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(K115, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(K102, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(K108, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(K114, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(K101, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(K107, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(K113, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(K100, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel42))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(K106, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel43)))
                            .addComponent(jLabel41))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(K112, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Rooms.addTab("KingSuites", jPanel1);

        L100.setBackground(new java.awt.Color(0, 255, 0));
        L100.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        L100.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/green.jpg"))); // NOI18N
        L100.setToolTipText("");
        L100.setAutoscrolls(true);
        L100.setMaximumSize(new java.awt.Dimension(50, 50));
        L100.setVerifyInputWhenFocusTarget(false);
        L100.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        jLabel16.setText("L114");

        L103.setBackground(new java.awt.Color(0, 255, 0));
        L103.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        L103.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/green.jpg"))); // NOI18N
        L103.setToolTipText("");
        L103.setAutoscrolls(true);
        L103.setMaximumSize(new java.awt.Dimension(50, 50));
        L103.setVerifyInputWhenFocusTarget(false);
        L103.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        jLabel17.setText("L103");

        L109.setBackground(new java.awt.Color(0, 255, 0));
        L109.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        L109.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/green.jpg"))); // NOI18N
        L109.setToolTipText("");
        L109.setAutoscrolls(true);
        L109.setMaximumSize(new java.awt.Dimension(50, 50));
        L109.setVerifyInputWhenFocusTarget(false);
        L109.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        jLabel18.setText("L109");

        L105.setBackground(new java.awt.Color(0, 255, 0));
        L105.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        L105.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/green.jpg"))); // NOI18N
        L105.setToolTipText("");
        L105.setAutoscrolls(true);
        L105.setMaximumSize(new java.awt.Dimension(50, 50));
        L105.setVerifyInputWhenFocusTarget(false);
        L105.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        L115.setBackground(new java.awt.Color(0, 255, 0));
        L115.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        L115.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/green.jpg"))); // NOI18N
        L115.setToolTipText("");
        L115.setAutoscrolls(true);
        L115.setMaximumSize(new java.awt.Dimension(50, 50));
        L115.setVerifyInputWhenFocusTarget(false);
        L115.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        jLabel49.setText("L105");

        jLabel19.setText("L100");

        jLabel20.setText("L115");

        L111.setBackground(new java.awt.Color(0, 255, 0));
        L111.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        L111.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/green.jpg"))); // NOI18N
        L111.setToolTipText("");
        L111.setAutoscrolls(true);
        L111.setMaximumSize(new java.awt.Dimension(50, 50));
        L111.setVerifyInputWhenFocusTarget(false);
        L111.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        L106.setBackground(new java.awt.Color(0, 255, 0));
        L106.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        L106.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/green.jpg"))); // NOI18N
        L106.setToolTipText("");
        L106.setAutoscrolls(true);
        L106.setMaximumSize(new java.awt.Dimension(50, 50));
        L106.setVerifyInputWhenFocusTarget(false);
        L106.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        L104.setBackground(new java.awt.Color(0, 255, 0));
        L104.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        L104.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/green.jpg"))); // NOI18N
        L104.setToolTipText("");
        L104.setAutoscrolls(true);
        L104.setMaximumSize(new java.awt.Dimension(50, 50));
        L104.setVerifyInputWhenFocusTarget(false);
        L104.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        jLabel50.setText("L111");

        jLabel21.setText("L106");

        jLabel22.setText("L104");

        L117.setBackground(new java.awt.Color(0, 255, 0));
        L117.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        L117.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/green.jpg"))); // NOI18N
        L117.setToolTipText("");
        L117.setAutoscrolls(true);
        L117.setMaximumSize(new java.awt.Dimension(50, 50));
        L117.setVerifyInputWhenFocusTarget(false);
        L117.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        L112.setBackground(new java.awt.Color(0, 255, 0));
        L112.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        L112.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/green.jpg"))); // NOI18N
        L112.setToolTipText("");
        L112.setAutoscrolls(true);
        L112.setMaximumSize(new java.awt.Dimension(50, 50));
        L112.setVerifyInputWhenFocusTarget(false);
        L112.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        L110.setBackground(new java.awt.Color(0, 255, 0));
        L110.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        L110.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/green.jpg"))); // NOI18N
        L110.setToolTipText("");
        L110.setAutoscrolls(true);
        L110.setMaximumSize(new java.awt.Dimension(50, 50));
        L110.setVerifyInputWhenFocusTarget(false);
        L110.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        jLabel51.setText("L117");

        jLabel23.setText("L112");

        L101.setBackground(new java.awt.Color(0, 255, 0));
        L101.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        L101.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/green.jpg"))); // NOI18N
        L101.setToolTipText("");
        L101.setAutoscrolls(true);
        L101.setMaximumSize(new java.awt.Dimension(50, 50));
        L101.setVerifyInputWhenFocusTarget(false);
        L101.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        jLabel24.setText("L110");

        L116.setBackground(new java.awt.Color(0, 255, 0));
        L116.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        L116.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/green.jpg"))); // NOI18N
        L116.setToolTipText("");
        L116.setAutoscrolls(true);
        L116.setMaximumSize(new java.awt.Dimension(50, 50));
        L116.setVerifyInputWhenFocusTarget(false);
        L116.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        jLabel25.setText("L101");

        jLabel26.setText("L116");

        L107.setBackground(new java.awt.Color(0, 255, 0));
        L107.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        L107.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/green.jpg"))); // NOI18N
        L107.setToolTipText("");
        L107.setAutoscrolls(true);
        L107.setMaximumSize(new java.awt.Dimension(50, 50));
        L107.setVerifyInputWhenFocusTarget(false);
        L107.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        jLabel27.setText("L107");

        L113.setBackground(new java.awt.Color(0, 255, 0));
        L113.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        L113.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/green.jpg"))); // NOI18N
        L113.setToolTipText("");
        L113.setAutoscrolls(true);
        L113.setMaximumSize(new java.awt.Dimension(50, 50));
        L113.setVerifyInputWhenFocusTarget(false);
        L113.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        jLabel28.setText("L113");

        L102.setBackground(new java.awt.Color(0, 255, 0));
        L102.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        L102.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/green.jpg"))); // NOI18N
        L102.setToolTipText("");
        L102.setAutoscrolls(true);
        L102.setMaximumSize(new java.awt.Dimension(50, 50));
        L102.setVerifyInputWhenFocusTarget(false);
        L102.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        jLabel29.setText("L102");

        L108.setBackground(new java.awt.Color(0, 255, 0));
        L108.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        L108.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/green.jpg"))); // NOI18N
        L108.setToolTipText("");
        L108.setAutoscrolls(true);
        L108.setMaximumSize(new java.awt.Dimension(50, 50));
        L108.setVerifyInputWhenFocusTarget(false);
        L108.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        jLabel30.setText("L108");

        L114.setBackground(new java.awt.Color(0, 255, 0));
        L114.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        L114.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/green.jpg"))); // NOI18N
        L114.setToolTipText("");
        L114.setAutoscrolls(true);
        L114.setMaximumSize(new java.awt.Dimension(50, 50));
        L114.setVerifyInputWhenFocusTarget(false);
        L114.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        jLabel38.setText("1st Floor");

        jLabel39.setText("2nd Floor");

        jLabel40.setText("3rd Floor");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel40)
                    .addComponent(jLabel38)
                    .addComponent(jLabel39))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(L100, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addGap(12, 12, 12)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(L106, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(L112, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(L101, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addGap(12, 12, 12)
                            .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(L107, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(L113, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(L102, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addGap(12, 12, 12)
                            .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(L108, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(L114, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(L103, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addGap(12, 12, 12)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(L109, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(L115, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(L104, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addGap(12, 12, 12)
                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(L110, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(L116, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addGap(12, 12, 12)
                            .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(L111, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(L117, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(L105, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(L105, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(L111, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(L117, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(L104, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(L110, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(L116, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(L103, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(L109, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(L115, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(L102, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(L108, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(L114, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(L101, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(L107, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(L113, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel38))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(L100, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel39))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(L106, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel40))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(L112, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Rooms.addTab("Luxury", jPanel5);

        Z100.setBackground(new java.awt.Color(0, 255, 0));
        Z100.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        Z100.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/green.jpg"))); // NOI18N
        Z100.setToolTipText("");
        Z100.setAutoscrolls(true);
        Z100.setMaximumSize(new java.awt.Dimension(50, 50));
        Z100.setVerifyInputWhenFocusTarget(false);
        Z100.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        jLabel52.setText("Z114");

        Z103.setBackground(new java.awt.Color(0, 255, 0));
        Z103.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        Z103.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/green.jpg"))); // NOI18N
        Z103.setToolTipText("");
        Z103.setAutoscrolls(true);
        Z103.setMaximumSize(new java.awt.Dimension(50, 50));
        Z103.setVerifyInputWhenFocusTarget(false);
        Z103.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        jLabel53.setText("Z103");

        Z109.setBackground(new java.awt.Color(0, 255, 0));
        Z109.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        Z109.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/green.jpg"))); // NOI18N
        Z109.setToolTipText("");
        Z109.setAutoscrolls(true);
        Z109.setMaximumSize(new java.awt.Dimension(50, 50));
        Z109.setVerifyInputWhenFocusTarget(false);
        Z109.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        jLabel54.setText("Z109");

        Z105.setBackground(new java.awt.Color(0, 255, 0));
        Z105.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        Z105.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/green.jpg"))); // NOI18N
        Z105.setToolTipText("");
        Z105.setAutoscrolls(true);
        Z105.setMaximumSize(new java.awt.Dimension(50, 50));
        Z105.setVerifyInputWhenFocusTarget(false);
        Z105.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        Z115.setBackground(new java.awt.Color(0, 255, 0));
        Z115.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        Z115.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/green.jpg"))); // NOI18N
        Z115.setToolTipText("");
        Z115.setAutoscrolls(true);
        Z115.setMaximumSize(new java.awt.Dimension(50, 50));
        Z115.setVerifyInputWhenFocusTarget(false);
        Z115.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        jLabel55.setText("Z105");

        jLabel56.setText("Z100");

        jLabel57.setText("Z115");

        Z111.setBackground(new java.awt.Color(0, 255, 0));
        Z111.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        Z111.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/green.jpg"))); // NOI18N
        Z111.setToolTipText("");
        Z111.setAutoscrolls(true);
        Z111.setMaximumSize(new java.awt.Dimension(50, 50));
        Z111.setVerifyInputWhenFocusTarget(false);
        Z111.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        Z106.setBackground(new java.awt.Color(0, 255, 0));
        Z106.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        Z106.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/green.jpg"))); // NOI18N
        Z106.setToolTipText("");
        Z106.setAutoscrolls(true);
        Z106.setMaximumSize(new java.awt.Dimension(50, 50));
        Z106.setVerifyInputWhenFocusTarget(false);
        Z106.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        Z104.setBackground(new java.awt.Color(0, 255, 0));
        Z104.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        Z104.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/green.jpg"))); // NOI18N
        Z104.setToolTipText("");
        Z104.setAutoscrolls(true);
        Z104.setMaximumSize(new java.awt.Dimension(50, 50));
        Z104.setVerifyInputWhenFocusTarget(false);
        Z104.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        jLabel58.setText("Z111");

        jLabel59.setText("Z106");

        jLabel60.setText("Z104");

        Z117.setBackground(new java.awt.Color(0, 255, 0));
        Z117.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        Z117.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/green.jpg"))); // NOI18N
        Z117.setToolTipText("");
        Z117.setAutoscrolls(true);
        Z117.setMaximumSize(new java.awt.Dimension(50, 50));
        Z117.setVerifyInputWhenFocusTarget(false);
        Z117.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        Z112.setBackground(new java.awt.Color(0, 255, 0));
        Z112.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        Z112.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/green.jpg"))); // NOI18N
        Z112.setToolTipText("");
        Z112.setAutoscrolls(true);
        Z112.setMaximumSize(new java.awt.Dimension(50, 50));
        Z112.setVerifyInputWhenFocusTarget(false);
        Z112.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        Z110.setBackground(new java.awt.Color(0, 255, 0));
        Z110.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        Z110.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/green.jpg"))); // NOI18N
        Z110.setToolTipText("");
        Z110.setAutoscrolls(true);
        Z110.setMaximumSize(new java.awt.Dimension(50, 50));
        Z110.setVerifyInputWhenFocusTarget(false);
        Z110.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        jLabel61.setText("Z117");

        jLabel62.setText("Z112");

        Z101.setBackground(new java.awt.Color(0, 255, 0));
        Z101.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        Z101.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/green.jpg"))); // NOI18N
        Z101.setToolTipText("");
        Z101.setAutoscrolls(true);
        Z101.setMaximumSize(new java.awt.Dimension(50, 50));
        Z101.setVerifyInputWhenFocusTarget(false);
        Z101.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        jLabel63.setText("Z110");

        Z116.setBackground(new java.awt.Color(0, 255, 0));
        Z116.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        Z116.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/green.jpg"))); // NOI18N
        Z116.setToolTipText("");
        Z116.setAutoscrolls(true);
        Z116.setMaximumSize(new java.awt.Dimension(50, 50));
        Z116.setVerifyInputWhenFocusTarget(false);
        Z116.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        jLabel64.setText("Z101");

        jLabel65.setText("Z116");

        Z107.setBackground(new java.awt.Color(0, 255, 0));
        Z107.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        Z107.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/green.jpg"))); // NOI18N
        Z107.setToolTipText("");
        Z107.setAutoscrolls(true);
        Z107.setMaximumSize(new java.awt.Dimension(50, 50));
        Z107.setVerifyInputWhenFocusTarget(false);
        Z107.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        jLabel66.setText("Z107");

        Z113.setBackground(new java.awt.Color(0, 255, 0));
        Z113.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        Z113.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/green.jpg"))); // NOI18N
        Z113.setToolTipText("");
        Z113.setAutoscrolls(true);
        Z113.setMaximumSize(new java.awt.Dimension(50, 50));
        Z113.setVerifyInputWhenFocusTarget(false);
        Z113.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        jLabel67.setText("Z113");

        Z102.setBackground(new java.awt.Color(0, 255, 0));
        Z102.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        Z102.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/green.jpg"))); // NOI18N
        Z102.setToolTipText("");
        Z102.setAutoscrolls(true);
        Z102.setMaximumSize(new java.awt.Dimension(50, 50));
        Z102.setVerifyInputWhenFocusTarget(false);
        Z102.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        jLabel68.setText("Z102");

        Z108.setBackground(new java.awt.Color(0, 255, 0));
        Z108.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        Z108.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/green.jpg"))); // NOI18N
        Z108.setToolTipText("");
        Z108.setAutoscrolls(true);
        Z108.setMaximumSize(new java.awt.Dimension(50, 50));
        Z108.setVerifyInputWhenFocusTarget(false);
        Z108.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        jLabel69.setText("Z108");

        Z114.setBackground(new java.awt.Color(0, 255, 0));
        Z114.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        Z114.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/green.jpg"))); // NOI18N
        Z114.setToolTipText("");
        Z114.setAutoscrolls(true);
        Z114.setMaximumSize(new java.awt.Dimension(50, 50));
        Z114.setVerifyInputWhenFocusTarget(false);
        Z114.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        jLabel35.setText("1st Floor");

        jLabel36.setText("2nd Floor");

        jLabel37.setText("3rd Floor");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel35)
                    .addComponent(jLabel36)
                    .addComponent(jLabel37))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Z100, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel6Layout.createSequentialGroup()
                            .addGap(12, 12, 12)
                            .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(Z106, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Z112, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel67, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel66, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Z101, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel6Layout.createSequentialGroup()
                            .addGap(12, 12, 12)
                            .addComponent(jLabel64, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(Z107, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Z113, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel69, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Z102, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel6Layout.createSequentialGroup()
                            .addGap(12, 12, 12)
                            .addComponent(jLabel68, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(Z108, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Z114, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Z103, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel6Layout.createSequentialGroup()
                            .addGap(12, 12, 12)
                            .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(Z109, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Z115, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel65, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel63, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Z104, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel6Layout.createSequentialGroup()
                            .addGap(12, 12, 12)
                            .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(Z110, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Z116, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel61, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel6Layout.createSequentialGroup()
                            .addGap(12, 12, 12)
                            .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(Z111, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Z117, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Z105, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel35)
                        .addGap(89, 89, 89)
                        .addComponent(jLabel36)
                        .addGap(90, 90, 90)
                        .addComponent(jLabel37))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel68, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel64, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(Z105, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25)
                                .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Z111, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(jLabel61, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Z117, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(Z104, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25)
                                .addComponent(jLabel63, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Z110, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(jLabel65, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Z116, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(Z103, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25)
                                .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Z109, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Z115, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(Z102, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25)
                                .addComponent(jLabel69, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Z108, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Z114, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(Z101, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25)
                                .addComponent(jLabel66, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Z107, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(jLabel67, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Z113, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(Z100, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25)
                                .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Z106, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(jLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Z112, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Rooms.addTab("SuperLux", jPanel6);

        S116.setBackground(new java.awt.Color(0, 255, 0));
        S116.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        S116.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/green.jpg"))); // NOI18N
        S116.setToolTipText("");
        S116.setAutoscrolls(true);
        S116.setMaximumSize(new java.awt.Dimension(50, 50));
        S116.setVerifyInputWhenFocusTarget(false);
        S116.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        jLabel70.setText("S101");

        jLabel71.setText("S116");

        S115.setBackground(new java.awt.Color(0, 255, 0));
        S115.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        S115.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/green.jpg"))); // NOI18N
        S115.setToolTipText("");
        S115.setAutoscrolls(true);
        S115.setMaximumSize(new java.awt.Dimension(50, 50));
        S115.setVerifyInputWhenFocusTarget(false);
        S115.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        jLabel72.setText("S105");

        jLabel73.setText("S100");

        jLabel74.setText("S115");

        S111.setBackground(new java.awt.Color(0, 255, 0));
        S111.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        S111.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/green.jpg"))); // NOI18N
        S111.setToolTipText("");
        S111.setAutoscrolls(true);
        S111.setMaximumSize(new java.awt.Dimension(50, 50));
        S111.setVerifyInputWhenFocusTarget(false);
        S111.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        S106.setBackground(new java.awt.Color(0, 255, 0));
        S106.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        S106.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/green.jpg"))); // NOI18N
        S106.setToolTipText("");
        S106.setAutoscrolls(true);
        S106.setMaximumSize(new java.awt.Dimension(50, 50));
        S106.setVerifyInputWhenFocusTarget(false);
        S106.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        S104.setBackground(new java.awt.Color(0, 255, 0));
        S104.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        S104.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/green.jpg"))); // NOI18N
        S104.setToolTipText("");
        S104.setAutoscrolls(true);
        S104.setMaximumSize(new java.awt.Dimension(50, 50));
        S104.setVerifyInputWhenFocusTarget(false);
        S104.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        jLabel75.setText("S111");

        jLabel76.setText("S106");

        jLabel77.setText("S104");

        S107.setBackground(new java.awt.Color(0, 255, 0));
        S107.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        S107.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/green.jpg"))); // NOI18N
        S107.setToolTipText("");
        S107.setAutoscrolls(true);
        S107.setMaximumSize(new java.awt.Dimension(50, 50));
        S107.setVerifyInputWhenFocusTarget(false);
        S107.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        jLabel78.setText("S107");

        S113.setBackground(new java.awt.Color(0, 255, 0));
        S113.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        S113.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/green.jpg"))); // NOI18N
        S113.setToolTipText("");
        S113.setAutoscrolls(true);
        S113.setMaximumSize(new java.awt.Dimension(50, 50));
        S113.setVerifyInputWhenFocusTarget(false);
        S113.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        jLabel79.setText("S113");

        S102.setBackground(new java.awt.Color(0, 255, 0));
        S102.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        S102.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/green.jpg"))); // NOI18N
        S102.setToolTipText("");
        S102.setAutoscrolls(true);
        S102.setMaximumSize(new java.awt.Dimension(50, 50));
        S102.setVerifyInputWhenFocusTarget(false);
        S102.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        jLabel80.setText("S102");

        S108.setBackground(new java.awt.Color(0, 255, 0));
        S108.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        S108.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/green.jpg"))); // NOI18N
        S108.setToolTipText("");
        S108.setAutoscrolls(true);
        S108.setMaximumSize(new java.awt.Dimension(50, 50));
        S108.setVerifyInputWhenFocusTarget(false);
        S108.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        jLabel81.setText("S108");

        S114.setBackground(new java.awt.Color(0, 255, 0));
        S114.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        S114.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/green.jpg"))); // NOI18N
        S114.setToolTipText("");
        S114.setAutoscrolls(true);
        S114.setMaximumSize(new java.awt.Dimension(50, 50));
        S114.setVerifyInputWhenFocusTarget(false);
        S114.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        S100.setBackground(new java.awt.Color(0, 255, 0));
        S100.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        S100.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/green.jpg"))); // NOI18N
        S100.setToolTipText("");
        S100.setAutoscrolls(true);
        S100.setMaximumSize(new java.awt.Dimension(50, 50));
        S100.setVerifyInputWhenFocusTarget(false);
        S100.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        jLabel82.setText("S114");

        S103.setBackground(new java.awt.Color(0, 255, 0));
        S103.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        S103.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/green.jpg"))); // NOI18N
        S103.setToolTipText("");
        S103.setAutoscrolls(true);
        S103.setMaximumSize(new java.awt.Dimension(50, 50));
        S103.setVerifyInputWhenFocusTarget(false);
        S103.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        jLabel83.setText("S103");

        S109.setBackground(new java.awt.Color(0, 255, 0));
        S109.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        S109.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/green.jpg"))); // NOI18N
        S109.setToolTipText("");
        S109.setAutoscrolls(true);
        S109.setMaximumSize(new java.awt.Dimension(50, 50));
        S109.setVerifyInputWhenFocusTarget(false);
        S109.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        jLabel84.setText("S109");

        S105.setBackground(new java.awt.Color(0, 255, 0));
        S105.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        S105.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/green.jpg"))); // NOI18N
        S105.setToolTipText("");
        S105.setAutoscrolls(true);
        S105.setMaximumSize(new java.awt.Dimension(50, 50));
        S105.setVerifyInputWhenFocusTarget(false);
        S105.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        S117.setBackground(new java.awt.Color(0, 255, 0));
        S117.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        S117.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/green.jpg"))); // NOI18N
        S117.setToolTipText("");
        S117.setAutoscrolls(true);
        S117.setMaximumSize(new java.awt.Dimension(50, 50));
        S117.setVerifyInputWhenFocusTarget(false);
        S117.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        S112.setBackground(new java.awt.Color(0, 255, 0));
        S112.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        S112.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/green.jpg"))); // NOI18N
        S112.setToolTipText("");
        S112.setAutoscrolls(true);
        S112.setMaximumSize(new java.awt.Dimension(50, 50));
        S112.setVerifyInputWhenFocusTarget(false);
        S112.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        S110.setBackground(new java.awt.Color(0, 255, 0));
        S110.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        S110.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/green.jpg"))); // NOI18N
        S110.setToolTipText("");
        S110.setAutoscrolls(true);
        S110.setMaximumSize(new java.awt.Dimension(50, 50));
        S110.setVerifyInputWhenFocusTarget(false);
        S110.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        jLabel85.setText("S117");

        jLabel86.setText("S112");

        S101.setBackground(new java.awt.Color(0, 255, 0));
        S101.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        S101.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/green.jpg"))); // NOI18N
        S101.setToolTipText("");
        S101.setAutoscrolls(true);
        S101.setMaximumSize(new java.awt.Dimension(50, 50));
        S101.setVerifyInputWhenFocusTarget(false);
        S101.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        jLabel87.setText("S110");

        jLabel32.setText("1st Floor");

        jLabel33.setText("2nd Floor");

        jLabel34.setText("3rd Floor");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel34)
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel33)
                            .addComponent(jLabel32))
                        .addGap(18, 18, 18)))
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(S100, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel7Layout.createSequentialGroup()
                            .addGap(12, 12, 12)
                            .addComponent(jLabel73, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(S106, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(S112, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel86, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel76, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel79, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel78, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(S101, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel7Layout.createSequentialGroup()
                            .addGap(12, 12, 12)
                            .addComponent(jLabel70, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(S107, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(S113, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel82, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel81, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(S102, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel7Layout.createSequentialGroup()
                            .addGap(12, 12, 12)
                            .addComponent(jLabel80, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(S108, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(S114, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel74, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel84, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(S103, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel7Layout.createSequentialGroup()
                            .addGap(12, 12, 12)
                            .addComponent(jLabel83, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(S109, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(S115, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel71, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel87, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(S104, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel7Layout.createSequentialGroup()
                            .addGap(12, 12, 12)
                            .addComponent(jLabel77, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(S110, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(S116, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel85, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel75, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel7Layout.createSequentialGroup()
                            .addGap(12, 12, 12)
                            .addComponent(jLabel72, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(S111, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(S117, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(S105, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel72, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(S105, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(jLabel75, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(S111, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel85, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(S117, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel77, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(S104, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(jLabel87, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(S110, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel71, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(S116, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel83, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(S103, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(jLabel84, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(S109, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel74, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(S115, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel80, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(S102, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(jLabel81, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(S108, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel82, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(S114, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel70, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(S101, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(jLabel78, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(S107, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel79, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(S113, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel73, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel32))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(S100, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel76, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel33))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(S106, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel86, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel34))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(S112, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Rooms.addTab("Standart", jPanel7);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Rooms, javax.swing.GroupLayout.PREFERRED_SIZE, 576, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Rooms, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Rooms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Rooms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Rooms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Rooms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Rooms().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel K100;
    private javax.swing.JLabel K101;
    private javax.swing.JLabel K102;
    private javax.swing.JLabel K103;
    private javax.swing.JLabel K104;
    private javax.swing.JLabel K105;
    private javax.swing.JLabel K106;
    private javax.swing.JLabel K107;
    private javax.swing.JLabel K108;
    private javax.swing.JLabel K109;
    private javax.swing.JLabel K110;
    private javax.swing.JLabel K111;
    private javax.swing.JLabel K112;
    private javax.swing.JLabel K113;
    private javax.swing.JLabel K114;
    private javax.swing.JLabel K115;
    private javax.swing.JLabel K116;
    private javax.swing.JLabel K117;
    private javax.swing.JLabel L100;
    private javax.swing.JLabel L101;
    private javax.swing.JLabel L102;
    private javax.swing.JLabel L103;
    private javax.swing.JLabel L104;
    private javax.swing.JLabel L105;
    private javax.swing.JLabel L106;
    private javax.swing.JLabel L107;
    private javax.swing.JLabel L108;
    private javax.swing.JLabel L109;
    private javax.swing.JLabel L110;
    private javax.swing.JLabel L111;
    private javax.swing.JLabel L112;
    private javax.swing.JLabel L113;
    private javax.swing.JLabel L114;
    private javax.swing.JLabel L115;
    private javax.swing.JLabel L116;
    private javax.swing.JLabel L117;
    private javax.swing.JTabbedPane Rooms;
    private javax.swing.JLabel S100;
    private javax.swing.JLabel S101;
    private javax.swing.JLabel S102;
    private javax.swing.JLabel S103;
    private javax.swing.JLabel S104;
    private javax.swing.JLabel S105;
    private javax.swing.JLabel S106;
    private javax.swing.JLabel S107;
    private javax.swing.JLabel S108;
    private javax.swing.JLabel S109;
    private javax.swing.JLabel S110;
    private javax.swing.JLabel S111;
    private javax.swing.JLabel S112;
    private javax.swing.JLabel S113;
    private javax.swing.JLabel S114;
    private javax.swing.JLabel S115;
    private javax.swing.JLabel S116;
    private javax.swing.JLabel S117;
    private javax.swing.JLabel Z100;
    private javax.swing.JLabel Z101;
    private javax.swing.JLabel Z102;
    private javax.swing.JLabel Z103;
    private javax.swing.JLabel Z104;
    private javax.swing.JLabel Z105;
    private javax.swing.JLabel Z106;
    private javax.swing.JLabel Z107;
    private javax.swing.JLabel Z108;
    private javax.swing.JLabel Z109;
    private javax.swing.JLabel Z110;
    private javax.swing.JLabel Z111;
    private javax.swing.JLabel Z112;
    private javax.swing.JLabel Z113;
    private javax.swing.JLabel Z114;
    private javax.swing.JLabel Z115;
    private javax.swing.JLabel Z116;
    private javax.swing.JLabel Z117;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    // End of variables declaration//GEN-END:variables
}

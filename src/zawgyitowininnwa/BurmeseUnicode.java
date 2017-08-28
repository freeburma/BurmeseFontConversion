/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zawgyitowininnwa;

import java.io.FileOutputStream;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JFrame;


import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;


/**

 @author Kiwi
 */
public class BurmeseUnicode extends JFrame

{
    public void BurmeseUnicode (String str)
    {
        try
        {
            // Creating an input dialogue 
            // String fileName = JOptionPane.showInputDialog(null, "Enter the File Name to Save", "File Name", 1); 
            String fileName = "", currentDirectory = ""; 
            FileOutputStream fileSave = null;
            JFileChooser saveFile = new JFileChooser(); 
            saveFile.setDialogTitle("Save a File");
            
            
            int checkSave = saveFile.showSaveDialog(BurmeseUnicode.this);
            
       
            if (checkSave == JFileChooser.APPROVE_OPTION)
            {
                fileName = saveFile.getSelectedFile().getName(); 
                
                currentDirectory = saveFile.getCurrentDirectory().toString(); 
                
                System.out.println ("File Name : " + currentDirectory + "\\" + fileName);
            
            
                // Creating a word document and saving 
                if (fileName.contains(".docx"))
                    fileSave = new FileOutputStream(currentDirectory + "\\" + fileName);
                else 
                    fileSave = new FileOutputStream(currentDirectory + "\\" + fileName + ".docx");
                
                // FileOutputStream fileSave = new FileOutputStream(currentDirectory + "\\" + fileName + ".docx");

                XWPFDocument docx = new XWPFDocument(); 
                XWPFParagraph paragraph = docx.createParagraph(); 

                // Run the paragraph 
                XWPFRun paragrahRun = paragraph.createRun(); 
                char singChar; 

                for (int i = 0; i < str.length (); i++)
                {
                    char originalChar = str.charAt (i); 

                    switch (originalChar)
                    {
                        // Special Chars from ASCII table 
                        case 0x000A: // 
                            System.out.printf ("Break - %04x \n", (int) originalChar); 
                            paragrahRun.addBreak();
                            break;
                        
                        // Zawgyi to Win Innwaa ttf font
                        
                        // Ka
                        case 0x1000: // 
                            System.out.printf ("%c - %04x >> %c \n", originalChar, (int) originalChar, 0x0041);
                            singChar = 0x0075;
                            paragrahRun.setText(Character.toString(singChar));
                            break;
                        // Kha
                        case 0x1001:
                            System.out.printf ("%c - %04x >> %c \n", originalChar, (int) originalChar, 0x0042);
                            singChar = 0x0063;
                            paragrahRun.setText(Character.toString(singChar));
                            break;
                            
                        // Ga
                        case 0x1002:
                            System.out.printf ("%c - %04x >> %c \n", originalChar, (int) originalChar, 0x0043);
                            singChar = 0x002A;
                            paragrahRun.setText(Character.toString(singChar));
                            break;
                            
                        // Gha
                        case 0x1003:
                            System.out.printf ("%c - %04x >> %c \n", originalChar, (int) originalChar, 0x0044);
                            singChar = 0x0043;
                            paragrahRun.setText(Character.toString(singChar));
                            break;
                            
                        // Nga
                        case 0x1004:
                            System.out.printf ("%c - %04x >> %c \n", originalChar, (int) originalChar, 0x0045);
                            singChar = 0x0069;
                            paragrahRun.setText(Character.toString(singChar));
                            break;
                            
                        // Ca
                        case 0x1005:
                            System.out.printf ("%c - %04x >> %c \n", originalChar, (int) originalChar, 0x0046);
                            singChar = 0x0070;
                            paragrahRun.setText(Character.toString(singChar));
                            break;
                            
                        // Cha
                        case 0x1006:
                            System.out.printf ("%c - %04x >> %c \n", originalChar, (int) originalChar, 0x0047);
                            singChar = 0x0071;
                            paragrahRun.setText(Character.toString(singChar));
                            break;
                         
                        // Ja
                        case 0x1007:
                           System.out.printf ("%c - %04x >> %c \n", originalChar, (int) originalChar, 0x0048);
                           singChar = 0x005A;
                           paragrahRun.setText(Character.toString(singChar));
                           break;
                           
                        // Jha
                        case 0x1008:
                           System.out.printf ("%c - %04x >> %c \n", originalChar, (int) originalChar, 0x0048);
                           singChar = 0x005A;
                           paragrahRun.setText(Character.toString(singChar));
                           break;
                           
                        // NYA   
                        case 0x1009:
                           System.out.printf ("%c - %04x >> %c \n", originalChar, (int) originalChar, 0x0048);
                           singChar = 0x005A;
                           paragrahRun.setText(Character.toString(singChar));
                           break;
                        
                        // Nnya
                        case 0x100A:
                           System.out.printf ("%c - %04x >> %c \n", originalChar, (int) originalChar, 0x0048);
                           singChar = 0x005A;
                           paragrahRun.setText(Character.toString(singChar));
                           break;
                           
                        // Tta   
                        case 0x100B:
                           System.out.printf ("%c - %04x >> %c \n", originalChar, (int) originalChar, 0x0048);
                           singChar = 0x005A;
                           paragrahRun.setText(Character.toString(singChar));
                           break;                           
                        
                        // Ttha
                        case 0x100C:
                           System.out.printf ("%c - %04x >> %c \n", originalChar, (int) originalChar, 0x0048);
                           singChar = 0x005A;
                           paragrahRun.setText(Character.toString(singChar));
                           break;
                           
                        // Dda   
                        case 0x100D:
                           System.out.printf ("%c - %04x >> %c \n", originalChar, (int) originalChar, 0x0048);
                           singChar = 0x005A;
                           paragrahRun.setText(Character.toString(singChar));
                           break;   
                           
                        // Ddha   
                        case 0x100E:
                           System.out.printf ("%c - %04x >> %c \n", originalChar, (int) originalChar, 0x0048);
                           singChar = 0x005A;
                           paragrahRun.setText(Character.toString(singChar));
                           break;   

                        // Nna
                        case 0x100F:
                           System.out.printf ("%c - %04x >> %c \n", originalChar, (int) originalChar, 0x0048);
                           singChar = 0x005A;
                           paragrahRun.setText(Character.toString(singChar));
                           break;   
                        
                        // Ta  
                        case 0x1010: 
                            System.out.printf ("%c - %04x >> %c \n", originalChar, (int) originalChar, 0x0041);
                            singChar = 0x0075;
                            paragrahRun.setText(Character.toString(singChar));
                            break;
                            
                        // Tha
                        case 0x1011:
                            System.out.printf ("%c - %04x >> %c \n", originalChar, (int) originalChar, 0x0042);
                            singChar = 0x0063;
                            paragrahRun.setText(Character.toString(singChar));
                            break;
                            
                        // Da
                        case 0x1012:
                            System.out.printf ("%c - %04x >> %c \n", originalChar, (int) originalChar, 0x0043);
                            singChar = 0x002A;
                            paragrahRun.setText(Character.toString(singChar));
                            break;
                            
                        // Dha
                        case 0x1013:
                            System.out.printf ("%c - %04x >> %c \n", originalChar, (int) originalChar, 0x0044);
                            singChar = 0x0043;
                            paragrahRun.setText(Character.toString(singChar));
                            break;
                            
                        // Na
                        case 0x1014:
                            System.out.printf ("%c - %04x >> %c \n", originalChar, (int) originalChar, 0x0045);
                            singChar = 0x0069;
                            paragrahRun.setText(Character.toString(singChar));
                            break;
                            
                        // Pa
                        case 0x1015:
                            System.out.printf ("%c - %04x >> %c \n", originalChar, (int) originalChar, 0x0046);
                            singChar = 0x0070;
                            paragrahRun.setText(Character.toString(singChar));
                            break;
                            
                        // Pha
                        case 0x1016:
                            System.out.printf ("%c - %04x >> %c \n", originalChar, (int) originalChar, 0x0047);
                            singChar = 0x0071;
                            paragrahRun.setText(Character.toString(singChar));
                            break;
                         
                        // Ba
                        case 0x1017:
                           System.out.printf ("%c - %04x >> %c \n", originalChar, (int) originalChar, 0x0048);
                           singChar = 0x005A;
                           paragrahRun.setText(Character.toString(singChar));
                           break;
                 
                        // Bha                          
                        case 0x1018:
                           System.out.printf ("%c - %04x >> %c \n", originalChar, (int) originalChar, 0x0048);
                           singChar = 0x005A;
                           paragrahRun.setText(Character.toString(singChar));
                           break;
                           
                        // Ma                          
                        case 0x1019:
                           System.out.printf ("%c - %04x >> %c \n", originalChar, (int) originalChar, 0x0048);
                           singChar = 0x005A;
                           paragrahRun.setText(Character.toString(singChar));
                           break;
                           
                        // Ya                          
                        case 0x101A:
                           System.out.printf ("%c - %04x >> %c \n", originalChar, (int) originalChar, 0x0048);
                           singChar = 0x005A;
                           paragrahRun.setText(Character.toString(singChar));
                           break;
                           
                        // Ra                          
                        case 0x101B:
                           System.out.printf ("%c - %04x >> %c \n", originalChar, (int) originalChar, 0x0048);
                           singChar = 0x005A;
                           paragrahRun.setText(Character.toString(singChar));
                           break;                           
                        
                        // La                           
                        case 0x101C:
                           System.out.printf ("%c - %04x >> %c \n", originalChar, (int) originalChar, 0x0048);
                           singChar = 0x005A;
                           paragrahRun.setText(Character.toString(singChar));
                           break;
                           
                        // Wa                          
                        case 0x101D:
                           System.out.printf ("%c - %04x >> %c \n", originalChar, (int) originalChar, 0x0048);
                           singChar = 0x005A;
                           paragrahRun.setText(Character.toString(singChar));
                           break;   
                           
                        // Sa                          
                        case 0x101E:
                           System.out.printf ("%c - %04x >> %c \n", originalChar, (int) originalChar, 0x0048);
                           singChar = 0x005A;
                           paragrahRun.setText(Character.toString(singChar));
                           break;   

                        // Ha                           
                        case 0x101F:
                           System.out.printf ("%c - %04x >> %c \n", originalChar, (int) originalChar, 0x0048);
                           singChar = 0x005A;
                           paragrahRun.setText(Character.toString(singChar));
                           break;   
                           
                        // Lla 
                        case 0x1020: 
                            System.out.printf ("%c - %04x >> %c \n", originalChar, (int) originalChar, 0x0041);
                            singChar = 0x0075;
                            paragrahRun.setText(Character.toString(singChar));
                            break;
                        
                        ///
                        /// Independent Vowels 
                        ///
                            
                        // A
                        case 0x1021:
                            System.out.printf ("%c - %04x >> %c \n", originalChar, (int) originalChar, 0x0042);
                            singChar = 0x0063;
                            paragrahRun.setText(Character.toString(singChar));
                            break;
                            
                        // Shan A
                        case 0x1022:
                            System.out.printf ("%c - %04x >> %c \n", originalChar, (int) originalChar, 0x0043);
                            singChar = 0x002A;
                            paragrahRun.setText(Character.toString(singChar));
                            break;
                            
                        // I
                        case 0x1023:
                            System.out.printf ("%c - %04x >> %c \n", originalChar, (int) originalChar, 0x0044);
                            singChar = 0x0043;
                            paragrahRun.setText(Character.toString(singChar));
                            break;
                            
                        // Ii
                        case 0x1024:
                            System.out.printf ("%c - %04x >> %c \n", originalChar, (int) originalChar, 0x0045);
                            singChar = 0x0069;
                            paragrahRun.setText(Character.toString(singChar));
                            break;
                            
                        // U
                        case 0x1025:
                            System.out.printf ("%c - %04x >> %c \n", originalChar, (int) originalChar, 0x0046);
                            singChar = 0x0070;
                            paragrahRun.setText(Character.toString(singChar));
                            break;
                            
                        // Uu
                        case 0x1026:
                            System.out.printf ("%c - %04x >> %c \n", originalChar, (int) originalChar, 0x0047);
                            singChar = 0x0071;
                            paragrahRun.setText(Character.toString(singChar));
                            break;
                         
                        // E
                        case 0x1027:
                           System.out.printf ("%c - %04x >> %c \n", originalChar, (int) originalChar, 0x0048);
                           singChar = 0x005A;
                           paragrahRun.setText(Character.toString(singChar));
                           break;
                 
                        // Mon E                          
                        case 0x1028:
                           System.out.printf ("%c - %04x >> %c \n", originalChar, (int) originalChar, 0x0048);
                           singChar = 0x005A;
                           paragrahRun.setText(Character.toString(singChar));
                           break;
                           
                        // O                         
                        case 0x1029:
                           System.out.printf ("%c - %04x >> %c \n", originalChar, (int) originalChar, 0x0048);
                           singChar = 0x005A;
                           paragrahRun.setText(Character.toString(singChar));
                           break;
                           
                        // Au                          
                        case 0x102A:
                           System.out.printf ("%c - %04x >> %c \n", originalChar, (int) originalChar, 0x0048);
                           singChar = 0x005A;
                           paragrahRun.setText(Character.toString(singChar));
                           break;
                        
                        ///
                        /// Dependent Vowels 
                        ///
                           
                        // Tall AA                           
                        case 0x102B:
                           System.out.printf ("%c - %04x >> %c \n", originalChar, (int) originalChar, 0x0048);
                           singChar = 0x005A;
                           paragrahRun.setText(Character.toString(singChar));
                           break;                           
                        
                        // AA                          
                        case 0x102C:
                           System.out.printf ("%c - %04x >> %c \n", originalChar, (int) originalChar, 0x0048);
                           singChar = 0x005A;
                           paragrahRun.setText(Character.toString(singChar));
                           break;
                           
                        // I                          
                        case 0x102D:
                           System.out.printf ("%c - %04x >> %c \n", originalChar, (int) originalChar, 0x0048);
                           singChar = 0x005A;
                           paragrahRun.setText(Character.toString(singChar));
                           break;   
                           
                        // Ii                          
                        case 0x102E:
                           System.out.printf ("%c - %04x >> %c \n", originalChar, (int) originalChar, 0x0048);
                           singChar = 0x005A;
                           paragrahRun.setText(Character.toString(singChar));
                           break;   

                        // U                         
                        case 0x102F:
                           System.out.printf ("%c - %04x >> %c \n", originalChar, (int) originalChar, 0x0048);
                           singChar = 0x005A;
                           paragrahRun.setText(Character.toString(singChar));
                           break;
                           
                        // Uu                         
                        case 0x1030:  
                            System.out.printf ("%c - %04x >> %c \n", originalChar, (int) originalChar, 0x0041);
                            singChar = 0x0075;
                            paragrahRun.setText(Character.toString(singChar));
                            break;
                            
                        // E
                        case 0x1031:
                            System.out.printf ("%c - %04x >> %c \n", originalChar, (int) originalChar, 0x0042);
                            singChar = 0x0063;
                            paragrahRun.setText(Character.toString(singChar));
                            break;
                            
                        // Ai
                        case 0x1032:
                            System.out.printf ("%c - %04x >> %c \n", originalChar, (int) originalChar, 0x0043);
                            singChar = 0x002A;
                            paragrahRun.setText(Character.toString(singChar));
                            break;
                            
                        // Mon Ii
                        case 0x1033:
                            System.out.printf ("%c - %04x >> %c \n", originalChar, (int) originalChar, 0x0044);
                            singChar = 0x0043;
                            paragrahRun.setText(Character.toString(singChar));
                            break;
                            
                        // Mon O
                        case 0x1034:
                            System.out.printf ("%c - %04x >> %c \n", originalChar, (int) originalChar, 0x0045);
                            singChar = 0x0069;
                            paragrahRun.setText(Character.toString(singChar));
                            break;
                            
                        // E Above
                        case 0x1035:
                            System.out.printf ("%c - %04x >> %c \n", originalChar, (int) originalChar, 0x0046);
                            singChar = 0x0070;
                            paragrahRun.setText(Character.toString(singChar));
                            break;
                        
                        ///
                        /// Various Signs
                        ///    
                            
                        // Anusvara
                        case 0x1036:
                            System.out.printf ("%c - %04x >> %c \n", originalChar, (int) originalChar, 0x0047);
                            singChar = 0x0071;
                            paragrahRun.setText(Character.toString(singChar));
                            break;
                         
                        // Dot Below
                        case 0x1037:
                           System.out.printf ("%c - %04x >> %c \n", originalChar, (int) originalChar, 0x0048);
                           singChar = 0x005A;
                           paragrahRun.setText(Character.toString(singChar));
                           break;

                        // Visarga                           
                        case 0x1038:
                           System.out.printf ("%c - %04x >> %c \n", originalChar, (int) originalChar, 0x0048);
                           singChar = 0x005A;
                           paragrahRun.setText(Character.toString(singChar));
                           break;
                           
                        // Virama                           
                        case 0x1039:
                           System.out.printf ("%c - %04x >> %c \n", originalChar, (int) originalChar, 0x0048);
                           singChar = 0x005A;
                           paragrahRun.setText(Character.toString(singChar));
                           break;
                           
                        // Asat                         
                        case 0x103A:
                           System.out.printf ("%c - %04x >> %c \n", originalChar, (int) originalChar, 0x0048);
                           singChar = 0x005A;
                           paragrahRun.setText(Character.toString(singChar));
                           break;
                        
                        ///
                        /// Dependent Consonant Signs
                        ///   
                           
                        // Ya                           
                        case 0x103B:
                           System.out.printf ("%c - %04x >> %c \n", originalChar, (int) originalChar, 0x0048);
                           singChar = 0x005A;
                           paragrahRun.setText(Character.toString(singChar));
                           break;                           
                        
                        // Ra                           
                        case 0x103C:
                           System.out.printf ("%c - %04x >> %c \n", originalChar, (int) originalChar, 0x0048);
                           singChar = 0x005A;
                           paragrahRun.setText(Character.toString(singChar));
                           break;
                           
                        // Wa                           
                        case 0x103D:
                           System.out.printf ("%c - %04x >> %c \n", originalChar, (int) originalChar, 0x0048);
                           singChar = 0x005A;
                           paragrahRun.setText(Character.toString(singChar));
                           break;   
                           
                        // Ha                          
                        case 0x103E:
                           System.out.printf ("%c - %04x >> %c \n", originalChar, (int) originalChar, 0x0048);
                           singChar = 0x005A;
                           paragrahRun.setText(Character.toString(singChar));
                           break;   

                        ///
                        /// Consonant
                        ///   
                           
                        // Sa                           
                        case 0x103F:
                           System.out.printf ("%c - %04x >> %c \n", originalChar, (int) originalChar, 0x0048);
                           singChar = 0x005A;
                           paragrahRun.setText(Character.toString(singChar));
                           break; 
                        
                        ///
                        /// Digits
                        ///     
                           
                        // 0                            
                        case 0x1040:  
                            System.out.printf ("%c - %04x >> %c \n", originalChar, (int) originalChar, 0x0041);
                            singChar = 0x0075;
                            paragrahRun.setText(Character.toString(singChar));
                            break;
                            
                        // 1
                        case 0x1041:
                            System.out.printf ("%c - %04x >> %c \n", originalChar, (int) originalChar, 0x0042);
                            singChar = 0x0063;
                            paragrahRun.setText(Character.toString(singChar));
                            break;
                            
                        // 2
                        case 0x1042:
                            System.out.printf ("%c - %04x >> %c \n", originalChar, (int) originalChar, 0x0043);
                            singChar = 0x002A;
                            paragrahRun.setText(Character.toString(singChar));
                            break;
                            
                        // 3
                        case 0x1043:
                            System.out.printf ("%c - %04x >> %c \n", originalChar, (int) originalChar, 0x0044);
                            singChar = 0x0043;
                            paragrahRun.setText(Character.toString(singChar));
                            break;
                            
                        // 4
                        case 0x1044:
                            System.out.printf ("%c - %04x >> %c \n", originalChar, (int) originalChar, 0x0045);
                            singChar = 0x0069;
                            paragrahRun.setText(Character.toString(singChar));
                            break;
                            
                        // 5
                        case 0x1045:
                            System.out.printf ("%c - %04x >> %c \n", originalChar, (int) originalChar, 0x0046);
                            singChar = 0x0070;
                            paragrahRun.setText(Character.toString(singChar));
                            break;
                            
                        // 6
                        case 0x1046:
                            System.out.printf ("%c - %04x >> %c \n", originalChar, (int) originalChar, 0x0047);
                            singChar = 0x0071;
                            paragrahRun.setText(Character.toString(singChar));
                            break;
                         
                        // 7
                        case 0x1047:
                           System.out.printf ("%c - %04x >> %c \n", originalChar, (int) originalChar, 0x0048);
                           singChar = 0x005A;
                           paragrahRun.setText(Character.toString(singChar));
                           break;
                 
                        // 8                           
                        case 0x1048:
                           System.out.printf ("%c - %04x >> %c \n", originalChar, (int) originalChar, 0x0048);
                           singChar = 0x005A;
                           paragrahRun.setText(Character.toString(singChar));
                           break;
                           
                        // 9                          
                        case 0x1049:
                           System.out.printf ("%c - %04x >> %c \n", originalChar, (int) originalChar, 0x0048);
                           singChar = 0x005A;
                           paragrahRun.setText(Character.toString(singChar));
                           break;
                           
                        ///
                        /// Punctutation
                        ///  
                           
                        // Little Section                          
                        case 0x104A:
                           System.out.printf ("%c - %04x >> %c \n", originalChar, (int) originalChar, 0x0048);
                           singChar = 0x005A;
                           paragrahRun.setText(Character.toString(singChar));
                           break;
                           
                        //Section                           
                        case 0x104B:
                           System.out.printf ("%c - %04x >> %c \n", originalChar, (int) originalChar, 0x0048);
                           singChar = 0x005A;
                           paragrahRun.setText(Character.toString(singChar));
                           break;  
                           
                        ///
                        /// Various Signs
                        ///  
                           
                        // Locative                          
                        case 0x104C:
                           System.out.printf ("%c - %04x >> %c \n", originalChar, (int) originalChar, 0x0048);
                           singChar = 0x005A;
                           paragrahRun.setText(Character.toString(singChar));
                           break;
                           
                        // Completed                           
                        case 0x104D:
                           System.out.printf ("%c - %04x >> %c \n", originalChar, (int) originalChar, 0x0048);
                           singChar = 0x005A;
                           paragrahRun.setText(Character.toString(singChar));
                           break;   
                           
                        // Aforementioned                          
                        case 0x104E:
                           System.out.printf ("%c - %04x >> %c \n", originalChar, (int) originalChar, 0x0048);
                           singChar = 0x005A;
                           paragrahRun.setText(Character.toString(singChar));
                           break;   

                        // Genitive                          
                        case 0x104F:
                           System.out.printf ("%c - %04x >> %c \n", originalChar, (int) originalChar, 0x0048);
                           singChar = 0x005A;
                           paragrahRun.setText(Character.toString(singChar));
                           break;   
                        
                        /* 
                        
                        // Left for Pali and Sanskrit and Other Ethnic Charactes 
                           
                        //                           
                        case 0x1050:  
                            System.out.printf ("%c - %04x >> %c \n", originalChar, (int) originalChar, 0x0041);
                            singChar = 0x0075;
                            paragrahRun.setText(Character.toString(singChar));
                            break;
                            
                        // Ca
                        case 0x1051:
                            System.out.printf ("%c - %04x >> %c \n", originalChar, (int) originalChar, 0x0042);
                            singChar = 0x0063;
                            paragrahRun.setText(Character.toString(singChar));
                            break;
                            
                        // Ga
                        case 0x1052:
                            System.out.printf ("%c - %04x >> %c \n", originalChar, (int) originalChar, 0x0043);
                            singChar = 0x002A;
                            paragrahRun.setText(Character.toString(singChar));
                            break;
                            
                        // Ga Kyi
                        case 0x1053:
                            System.out.printf ("%c - %04x >> %c \n", originalChar, (int) originalChar, 0x0044);
                            singChar = 0x0043;
                            paragrahRun.setText(Character.toString(singChar));
                            break;
                            
                        // Nga
                        case 0x1054:
                            System.out.printf ("%c - %04x >> %c \n", originalChar, (int) originalChar, 0x0045);
                            singChar = 0x0069;
                            paragrahRun.setText(Character.toString(singChar));
                            break;
                            
                        // Tsa
                        case 0x1055:
                            System.out.printf ("%c - %04x >> %c \n", originalChar, (int) originalChar, 0x0046);
                            singChar = 0x0070;
                            paragrahRun.setText(Character.toString(singChar));
                            break;
                            
                        // Sa
                        case 0x1056:
                            System.out.printf ("%c - %04x >> %c \n", originalChar, (int) originalChar, 0x0047);
                            singChar = 0x0071;
                            paragrahRun.setText(Character.toString(singChar));
                            break;
                         
                        // Za
                        case 0x1057:
                           System.out.printf ("%c - %04x >> %c \n", originalChar, (int) originalChar, 0x0048);
                           singChar = 0x005A;
                           paragrahRun.setText(Character.toString(singChar));
                           break;
                 
                        //                           
                        case 0x1058:
                           System.out.printf ("%c - %04x >> %c \n", originalChar, (int) originalChar, 0x0048);
                           singChar = 0x005A;
                           paragrahRun.setText(Character.toString(singChar));
                           break;
                           
                        //                           
                        case 0x1059:
                           System.out.printf ("%c - %04x >> %c \n", originalChar, (int) originalChar, 0x0048);
                           singChar = 0x005A;
                           paragrahRun.setText(Character.toString(singChar));
                           break;
                         
                        //                           
                        case 0x105A:
                           System.out.printf ("%c - %04x >> %c \n", originalChar, (int) originalChar, 0x0048);
                           singChar = 0x005A;
                           paragrahRun.setText(Character.toString(singChar));
                           break;
                         
                        //                           
                        case 0x105B:
                           System.out.printf ("%c - %04x >> %c \n", originalChar, (int) originalChar, 0x0048);
                           singChar = 0x005A;
                           paragrahRun.setText(Character.toString(singChar));
                           break;                           
                        
                        //                           
                        case 0x105C:
                           System.out.printf ("%c - %04x >> %c \n", originalChar, (int) originalChar, 0x0048);
                           singChar = 0x005A;
                           paragrahRun.setText(Character.toString(singChar));
                           break;
                           
                        //                           
                        case 0x105D:
                           System.out.printf ("%c - %04x >> %c \n", originalChar, (int) originalChar, 0x0048);
                           singChar = 0x005A;
                           paragrahRun.setText(Character.toString(singChar));
                           break;   
                           
                        //                           
                        case 0x105E:
                           System.out.printf ("%c - %04x >> %c \n", originalChar, (int) originalChar, 0x0048);
                           singChar = 0x005A;
                           paragrahRun.setText(Character.toString(singChar));
                           break;   

                        //                           
                        case 0x105F:
                           System.out.printf ("%c - %04x >> %c \n", originalChar, (int) originalChar, 0x0048);
                           singChar = 0x005A;
                           paragrahRun.setText(Character.toString(singChar));
                           break;   

                        //                           
                        case 0x1060: // 
                            System.out.printf ("%c - %04x >> %c \n", originalChar, (int) originalChar, 0x0041);
                            singChar = 0x0075;
                            paragrahRun.setText(Character.toString(singChar));
                            break;
                            
                        // Ca
                        case 0x1061:
                            System.out.printf ("%c - %04x >> %c \n", originalChar, (int) originalChar, 0x0042);
                            singChar = 0x0063;
                            paragrahRun.setText(Character.toString(singChar));
                            break;
                            
                        // Ga
                        case 0x1062:
                            System.out.printf ("%c - %04x >> %c \n", originalChar, (int) originalChar, 0x0043);
                            singChar = 0x002A;
                            paragrahRun.setText(Character.toString(singChar));
                            break;
                            
                        // Ga Kyi
                        case 0x1063:
                            System.out.printf ("%c - %04x >> %c \n", originalChar, (int) originalChar, 0x0044);
                            singChar = 0x0043;
                            paragrahRun.setText(Character.toString(singChar));
                            break;
                            
                        // Nga
                        case 0x1064:
                            System.out.printf ("%c - %04x >> %c \n", originalChar, (int) originalChar, 0x0045);
                            singChar = 0x0069;
                            paragrahRun.setText(Character.toString(singChar));
                            break;
                            
                        // Tsa
                        case 0x1065:
                            System.out.printf ("%c - %04x >> %c \n", originalChar, (int) originalChar, 0x0046);
                            singChar = 0x0070;
                            paragrahRun.setText(Character.toString(singChar));
                            break;
                            
                        // Sa
                        case 0x1066:
                            System.out.printf ("%c - %04x >> %c \n", originalChar, (int) originalChar, 0x0047);
                            singChar = 0x0071;
                            paragrahRun.setText(Character.toString(singChar));
                            break;
                         
                        // Za
                        case 0x1067:
                           System.out.printf ("%c - %04x >> %c \n", originalChar, (int) originalChar, 0x0048);
                           singChar = 0x005A;
                           paragrahRun.setText(Character.toString(singChar));
                           break;
                           
                        //                                                  
                        case 0x1068:
                           System.out.printf ("%c - %04x >> %c \n", originalChar, (int) originalChar, 0x0048);
                           singChar = 0x005A;
                           paragrahRun.setText(Character.toString(singChar));
                           break;
                           
                        //                           
                        case 0x1069:
                           System.out.printf ("%c - %04x >> %c \n", originalChar, (int) originalChar, 0x0048);
                           singChar = 0x005A;
                           paragrahRun.setText(Character.toString(singChar));
                           break;
                           
                        //                           
                        case 0x106A:
                           System.out.printf ("%c - %04x >> %c \n", originalChar, (int) originalChar, 0x0048);
                           singChar = 0x005A;
                           paragrahRun.setText(Character.toString(singChar));
                           break;
                         
                        //                           
                        case 0x106B:
                           System.out.printf ("%c - %04x >> %c \n", originalChar, (int) originalChar, 0x0048);
                           singChar = 0x005A;
                           paragrahRun.setText(Character.toString(singChar));
                           break;                           
                        
                        //                           
                        case 0x106C:
                           System.out.printf ("%c - %04x >> %c \n", originalChar, (int) originalChar, 0x0048);
                           singChar = 0x005A;
                           paragrahRun.setText(Character.toString(singChar));
                           break;

                        //                           
                        case 0x106D:
                           System.out.printf ("%c - %04x >> %c \n", originalChar, (int) originalChar, 0x0048);
                           singChar = 0x005A;
                           paragrahRun.setText(Character.toString(singChar));
                           break;   
                           
                        //                           
                        case 0x106E:
                           System.out.printf ("%c - %04x >> %c \n", originalChar, (int) originalChar, 0x0048);
                           singChar = 0x005A;
                           paragrahRun.setText(Character.toString(singChar));
                           break;   

                        //                           
                        case 0x106F:
                           System.out.printf ("%c - %04x >> %c \n", originalChar, (int) originalChar, 0x0048);
                           singChar = 0x005A;
                           paragrahRun.setText(Character.toString(singChar));
                           break;
                           
                        //                           
                        case 0x1070: // 
                            System.out.printf ("%c - %04x >> %c \n", originalChar, (int) originalChar, 0x0041);
                            singChar = 0x0075;
                            paragrahRun.setText(Character.toString(singChar));
                            break;
                            
                        // Ca
                        case 0x1071:
                            System.out.printf ("%c - %04x >> %c \n", originalChar, (int) originalChar, 0x0042);
                            singChar = 0x0063;
                            paragrahRun.setText(Character.toString(singChar));
                            break;
                            
                        // Ga
                        case 0x1072:
                            System.out.printf ("%c - %04x >> %c \n", originalChar, (int) originalChar, 0x0043);
                            singChar = 0x002A;
                            paragrahRun.setText(Character.toString(singChar));
                            break;
                            
                        // Ga Kyi
                        case 0x1073:
                            System.out.printf ("%c - %04x >> %c \n", originalChar, (int) originalChar, 0x0044);
                            singChar = 0x0043;
                            paragrahRun.setText(Character.toString(singChar));
                            break;
                            
                        // Nga
                        case 0x1074:
                            System.out.printf ("%c - %04x >> %c \n", originalChar, (int) originalChar, 0x0045);
                            singChar = 0x0069;
                            paragrahRun.setText(Character.toString(singChar));
                            break;
                            
                        // Tsa
                        case 0x1075:
                            System.out.printf ("%c - %04x >> %c \n", originalChar, (int) originalChar, 0x0046);
                            singChar = 0x0070;
                            paragrahRun.setText(Character.toString(singChar));
                            break;
                            
                        // Sa
                        case 0x1076:
                            System.out.printf ("%c - %04x >> %c \n", originalChar, (int) originalChar, 0x0047);
                            singChar = 0x0071;
                            paragrahRun.setText(Character.toString(singChar));
                            break;
                         
                        // Za
                        case 0x1077:
                           System.out.printf ("%c - %04x >> %c \n", originalChar, (int) originalChar, 0x0048);
                           singChar = 0x005A;
                           paragrahRun.setText(Character.toString(singChar));
                           break;

                        //                           
                        case 0x1078:
                           System.out.printf ("%c - %04x >> %c \n", originalChar, (int) originalChar, 0x0048);
                           singChar = 0x005A;
                           paragrahRun.setText(Character.toString(singChar));
                           break;
                           
                        //                           
                        case 0x1079:
                           System.out.printf ("%c - %04x >> %c \n", originalChar, (int) originalChar, 0x0048);
                           singChar = 0x005A;
                           paragrahRun.setText(Character.toString(singChar));
                           break;
                           
                        //                           
                        case 0x107A:
                           System.out.printf ("%c - %04x >> %c \n", originalChar, (int) originalChar, 0x0048);
                           singChar = 0x005A;
                           paragrahRun.setText(Character.toString(singChar));
                           break;
                           
                        //                           
                        case 0x107B:
                           System.out.printf ("%c - %04x >> %c \n", originalChar, (int) originalChar, 0x0048);
                           singChar = 0x005A;
                           paragrahRun.setText(Character.toString(singChar));
                           break;                           
                        
                        //                           
                        case 0x107C:
                           System.out.printf ("%c - %04x >> %c \n", originalChar, (int) originalChar, 0x0048);
                           singChar = 0x005A;
                           paragrahRun.setText(Character.toString(singChar));
                           break;
                           
                        //                           
                        case 0x107D:
                           System.out.printf ("%c - %04x >> %c \n", originalChar, (int) originalChar, 0x0048);
                           singChar = 0x005A;
                           paragrahRun.setText(Character.toString(singChar));
                           break;   
                           
                        //                           
                        case 0x107E:
                           System.out.printf ("%c - %04x >> %c \n", originalChar, (int) originalChar, 0x0048);
                           singChar = 0x005A;
                           paragrahRun.setText(Character.toString(singChar));
                           break;   

                        //                           
                        case 0x107F:
                           System.out.printf ("%c - %04x >> %c \n", originalChar, (int) originalChar, 0x0048);
                           singChar = 0x005A;
                           paragrahRun.setText(Character.toString(singChar));
                           break; 
                           
                        //                           
                        case 0x1080: // 
                            System.out.printf ("%c - %04x >> %c \n", originalChar, (int) originalChar, 0x0041);
                            singChar = 0x0075;
                            paragrahRun.setText(Character.toString(singChar));
                            break;
                            
                        // Ca
                        case 0x1081:
                            System.out.printf ("%c - %04x >> %c \n", originalChar, (int) originalChar, 0x0042);
                            singChar = 0x0063;
                            paragrahRun.setText(Character.toString(singChar));
                            break;
                            
                        // Ga
                        case 0x1082:
                            System.out.printf ("%c - %04x >> %c \n", originalChar, (int) originalChar, 0x0043);
                            singChar = 0x002A;
                            paragrahRun.setText(Character.toString(singChar));
                            break;
                            
                        // Ga Kyi
                        case 0x1083:
                            System.out.printf ("%c - %04x >> %c \n", originalChar, (int) originalChar, 0x0044);
                            singChar = 0x0043;
                            paragrahRun.setText(Character.toString(singChar));
                            break;
                            
                        // Nga
                        case 0x1084:
                            System.out.printf ("%c - %04x >> %c \n", originalChar, (int) originalChar, 0x0045);
                            singChar = 0x0069;
                            paragrahRun.setText(Character.toString(singChar));
                            break;
                            
                        // Tsa
                        case 0x1085:
                            System.out.printf ("%c - %04x >> %c \n", originalChar, (int) originalChar, 0x0046);
                            singChar = 0x0070;
                            paragrahRun.setText(Character.toString(singChar));
                            break;
                            
                        // Sa
                        case 0x1086:
                            System.out.printf ("%c - %04x >> %c \n", originalChar, (int) originalChar, 0x0047);
                            singChar = 0x0071;
                            paragrahRun.setText(Character.toString(singChar));
                            break;
                         
                        // Za
                        case 0x1087:
                           System.out.printf ("%c - %04x >> %c \n", originalChar, (int) originalChar, 0x0048);
                           singChar = 0x005A;
                           paragrahRun.setText(Character.toString(singChar));
                           break;
                 
                        //                           
                        case 0x1088:
                           System.out.printf ("%c - %04x >> %c \n", originalChar, (int) originalChar, 0x0048);
                           singChar = 0x005A;
                           paragrahRun.setText(Character.toString(singChar));
                           break;
                           
                        //                           
                        case 0x1089:
                           System.out.printf ("%c - %04x >> %c \n", originalChar, (int) originalChar, 0x0048);
                           singChar = 0x005A;
                           paragrahRun.setText(Character.toString(singChar));
                           break;
                          
                        //                           
                        case 0x108A:
                           System.out.printf ("%c - %04x >> %c \n", originalChar, (int) originalChar, 0x0048);
                           singChar = 0x005A;
                           paragrahRun.setText(Character.toString(singChar));
                           break;
                           
                        //                           
                        case 0x108B:
                           System.out.printf ("%c - %04x >> %c \n", originalChar, (int) originalChar, 0x0048);
                           singChar = 0x005A;
                           paragrahRun.setText(Character.toString(singChar));
                           break;                           
                        
                        //                           
                        case 0x108C:
                           System.out.printf ("%c - %04x >> %c \n", originalChar, (int) originalChar, 0x0048);
                           singChar = 0x005A;
                           paragrahRun.setText(Character.toString(singChar));
                           break;
                           
                        //                           
                        case 0x108D:
                           System.out.printf ("%c - %04x >> %c \n", originalChar, (int) originalChar, 0x0048);
                           singChar = 0x005A;
                           paragrahRun.setText(Character.toString(singChar));
                           break;   
                           
                        //                           
                        case 0x108E:
                           System.out.printf ("%c - %04x >> %c \n", originalChar, (int) originalChar, 0x0048);
                           singChar = 0x005A;
                           paragrahRun.setText(Character.toString(singChar));
                           break;   

                        //                           
                        case 0x108F:
                           System.out.printf ("%c - %04x >> %c \n", originalChar, (int) originalChar, 0x0048);
                           singChar = 0x005A;
                           paragrahRun.setText(Character.toString(singChar));
                           break;   
                           
                        //                           
                        case 0x1090: // 
                            System.out.printf ("%c - %04x >> %c \n", originalChar, (int) originalChar, 0x0041);
                            singChar = 0x0075;
                            paragrahRun.setText(Character.toString(singChar));
                            break;
                            
                        // Ca
                        case 0x1091:
                            System.out.printf ("%c - %04x >> %c \n", originalChar, (int) originalChar, 0x0042);
                            singChar = 0x0063;
                            paragrahRun.setText(Character.toString(singChar));
                            break;
                            
                        // Ga
                        case 0x1092:
                            System.out.printf ("%c - %04x >> %c \n", originalChar, (int) originalChar, 0x0043);
                            singChar = 0x002A;
                            paragrahRun.setText(Character.toString(singChar));
                            break;
                            
                        // Ga Kyi
                        case 0x1093:
                            System.out.printf ("%c - %04x >> %c \n", originalChar, (int) originalChar, 0x0044);
                            singChar = 0x0043;
                            paragrahRun.setText(Character.toString(singChar));
                            break;
                            
                        // Nga
                        case 0x1094:
                            System.out.printf ("%c - %04x >> %c \n", originalChar, (int) originalChar, 0x0045);
                            singChar = 0x0069;
                            paragrahRun.setText(Character.toString(singChar));
                            break;
                            
                        // Tsa
                        case 0x1095:
                            System.out.printf ("%c - %04x >> %c \n", originalChar, (int) originalChar, 0x0046);
                            singChar = 0x0070;
                            paragrahRun.setText(Character.toString(singChar));
                            break;
                            
                        // Sa
                        case 0x1096:
                            System.out.printf ("%c - %04x >> %c \n", originalChar, (int) originalChar, 0x0047);
                            singChar = 0x0071;
                            paragrahRun.setText(Character.toString(singChar));
                            break;
                         
                        // Za
                        case 0x1097:
                           System.out.printf ("%c - %04x >> %c \n", originalChar, (int) originalChar, 0x0048);
                           singChar = 0x005A;
                           paragrahRun.setText(Character.toString(singChar));
                           break;
                 
                        //                           
                        case 0x1098:
                           System.out.printf ("%c - %04x >> %c \n", originalChar, (int) originalChar, 0x0048);
                           singChar = 0x005A;
                           paragrahRun.setText(Character.toString(singChar));
                           break;
                           
                        //                           
                        case 0x1099:
                           System.out.printf ("%c - %04x >> %c \n", originalChar, (int) originalChar, 0x0048);
                           singChar = 0x005A;
                           paragrahRun.setText(Character.toString(singChar));
                           break;
                           
                        //                           
                        case 0x109A:
                           System.out.printf ("%c - %04x >> %c \n", originalChar, (int) originalChar, 0x0048);
                           singChar = 0x005A;
                           paragrahRun.setText(Character.toString(singChar));
                           break;
                           
                        //                           
                        case 0x109B:
                           System.out.printf ("%c - %04x >> %c \n", originalChar, (int) originalChar, 0x0048);
                           singChar = 0x005A;
                           paragrahRun.setText(Character.toString(singChar));
                           break;                           
                        
                        //                           
                        case 0x109C:
                           System.out.printf ("%c - %04x >> %c \n", originalChar, (int) originalChar, 0x0048);
                           singChar = 0x005A;
                           paragrahRun.setText(Character.toString(singChar));
                           break;
                           
                        //                           
                        case 0x109D:
                           System.out.printf ("%c - %04x >> %c \n", originalChar, (int) originalChar, 0x0048);
                           singChar = 0x005A;
                           paragrahRun.setText(Character.toString(singChar));
                           break;   
                          
                        //                           
                        case 0x109E:
                           System.out.printf ("%c - %04x >> %c \n", originalChar, (int) originalChar, 0x0048);
                           singChar = 0x005A;
                           paragrahRun.setText(Character.toString(singChar));
                           break;   

                        //                           
                        case 0x109F:
                           System.out.printf ("%c - %04x >> %c \n", originalChar, (int) originalChar, 0x0048);
                           singChar = 0x005A;
                           paragrahRun.setText(Character.toString(singChar));
                           break;   
                        */
                           
                        //                           
                        default:
                            paragrahRun.setText(Character.toString(originalChar));
                            System.out.printf ("%c - %04x\n", originalChar, (int) originalChar);
                            break;

                    }// end switch 
                }// end for 

                // Writing to a file 
                docx.write(fileSave);

                // Closing the file
                fileSave.close();

                JOptionPane.showMessageDialog(null, "The doc file has created successfully");
            }// end if
            
        }
        catch (Exception e)
        {
        }
    }
}

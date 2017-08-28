/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zawgyitowininnwa;

import java.io.FileOutputStream;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

// For *.docx Docunments
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;



/**

 @author Kiwi
 */
public class WinInnwaToZawgyi extends JFrame
{
    public void winInnwaToZawgyi (String words)
    {
        try
        {
               
            String fileName, currentDirectory; 
            FileOutputStream fileSave;
            
            FileNameExtensionFilter docxFile = new FileNameExtensionFilter(".docx", "docx");
            FileNameExtensionFilter docFile = new FileNameExtensionFilter(".doc", "doc");
            JFileChooser saveFile = new JFileChooser(); 
            saveFile.setFileFilter(docxFile);
            saveFile.setFileFilter(docFile);
            saveFile.setDialogTitle("Save a File");
            
            
            int checkSave = saveFile.showSaveDialog(WinInnwaToZawgyi.this);
            
       
            if (checkSave == JFileChooser.APPROVE_OPTION)
            {
                fileName = saveFile.getSelectedFile().getName(); 
                
                currentDirectory = saveFile.getCurrentDirectory().toString(); 
                
                // System.out.println ("File Name : " + currentDirectory + "\\" + fileName);
                
               
                // Creating a word document and saving 
                if (fileName.endsWith(".doc") || fileName.endsWith(".docx"))
                    fileSave = new FileOutputStream(currentDirectory + "\\" + fileName);
                else 
                    fileSave = new FileOutputStream(currentDirectory + "\\" + fileName + saveFile.getFileFilter().getDescription());
                
                // FileOutputStream fileSave = new FileOutputStreams(currentDirectory + "\\" + fileName + ".docx");

                XWPFDocument docx = new XWPFDocument(); 
                XWPFParagraph paragraph = docx.createParagraph(); 
                
                
                XWPFRun paragrahRun = paragraph.createRun(); 
                paragrahRun.setFontFamily("Zawgyi-One");
                paragrahRun.setFontSize(11);
                // paragrahRun.setText(Character.toString(getString(words)));
                
                // System.out.println(words);
               
                
                for (int i = 0; i < words.length (); i++)
                {
                    char originalChar = words.charAt (i); 
                    paragrahRun.setText(Character.toString(WordToChar(originalChar)));

                }
               

                // Writing to a file 
                docx.write(fileSave);

                // Closing the file
                fileSave.close();

                JOptionPane.showMessageDialog(null, "The doc file has created successfully by TestClass.java");
            }// end if
            
        }
        catch (Exception e)
        {
        }
    }
    
    
    public char WordToChar (char originalChar)
    {
        char singChar;  
        
        switch (originalChar)
        {
            // Special Chars from ASCII table 
            case 0x000A: // 
                // System.out.printf ("Break - %04x \n", (int) originalChar); 
                singChar = 0x000A;
                break;

            // Zawgyi to Win Innwaa ttf font

            // Ka
            case 0x0075: // 
                singChar = 0x1000;
                
                break;

            // Kha
            case 0x0063:
                singChar = 0x1001;
                
                break;

            // Ga
            case 0x002A:
                singChar = 0x1002;
                
                break;

            // Gha
            case 0x0043:
                singChar = 0x1003;
                
                break;

            // Nga
            case 0x0069:
                singChar = 0x1004;
                
                break;

            // Ca
            case 0x0070:
                singChar = 0x1005;
                
                break;

            // Cha
            case 0x0071:
                singChar = 0x1006;
                
                break;

            // Ja
            case 0x005A:
               singChar = 0x1007;
               
               break;

            /*
            // Jha
            case 0x1008:
               singChar = 0x0070;
               

               // singChar = 0x0073;
               // 
               break;
            */

            // NYA   
            case 0x00da:
               singChar = 0x1009;
               
               break;

            // Nnya
            case 0x006e:
               singChar = 0x100A;
               
               break;

            // Tta   
            case 0x0023:
               singChar = 0x100B;
               
               break;                           

            // Ttha
            case 0x0058:
               singChar = 0x100C;
               
               break;

            // Dda   
            case 0x0021:
               singChar = 0x100D;
               
               break;   

            // Ddha   
            case 0x00a1:
               singChar = 0x100E;
               
               break;   

            // Nna
            case 0x0050:
               singChar = 0x100F;
               
               break;   

            // Ta  
            case 0x0077: 
                singChar = 0x1010;
                
                break;

            // Tha
            case 0x0078:
                singChar = 0x1011;
                
                break;

            // Da
            case 0x0027:
                singChar = 0x1012;
                
                break;

            // Dha
            case 0x0022:
                singChar = 0x1013;
                
                break;

            // Na
            case 0x0065:
                singChar = 0x1014;
                
                break;

            // Pa
            case 0x0079:
                singChar = 0x1015;
                
                break;

            // Pha
            case 0x007a:
                singChar = 0x1016;
                
                break;

            // Ba
            case 0x0041:
               singChar = 0x1017;
               
               break;

            // Bha                          
            case 0x0062:
               singChar = 0x1018;
               
               break;

            // Ma                          
            case 0x0072:
               singChar = 0x1019;
               
               break;

            // Ya                          
            case 0x002c:
               singChar = 0x101A;
               
               break;

            // Ra                          
            case 0x0026:
               singChar = 0x101B;
               
               break;                           

            // La                           
            case 0x0076:
               singChar = 0x101C;
               
               break;

            // Wa                          
            case 0x0030:
               singChar = 0x101D;
               
               break;   

            // Sa                          
            case 0x006f:
               singChar = 0x101E;
               
               break;   

            // Ha                           
            case 0x005b:
               singChar = 0x101F;
               
               break;   

            // Lla 
            case 0x0056: 
                singChar = 0x1020;
                
                break;

            ///
            /// Independent Vowels 
            ///

            // A
            case 0x0074:
                singChar = 0x1021;
                
                break;



            // I
            case 0x00a3:
                singChar = 0x1023;
                
                break;

            // Ii
            case 0x00fe:
                singChar = 0x1024;
                
                break;

            // U
            case 0x004f:
                singChar = 0x1025;
                
                break;
            /*    
            // Uu
            case 0x1026:
                singChar = 0x004f;
                

                singChar = 0x0044;
                
                break;
                */

            // E
            case 0x007b:
               singChar = 0x1027;
               
               break;

           /*                            
            // O                         
            case 0x1029:
               singChar = 0x004d;
               

               singChar = 0x006f;
               
               break;

            // Au                          
            case 0x102A:
               singChar = 0x0061;
               

               singChar = 0x004d;
               

               singChar = 0x006f ;
               

               singChar = 0x006d;
               

               singChar = 0x0066;
               
               break;
               */

            ///
            /// Dependent Vowels 
            ///

            // Tall AA                           
            case 0x0067:
               singChar = 0x102B;
               
               break;                           

            // AA                          
            case 0x006d:
               singChar = 0x102C;
               
               break;

            // I                          
            case 0x0064:
               singChar = 0x102D;
               
               break;   

            // Ii                          
            case 0x0044:
               singChar = 0x102E;
               
               break;   

            // Short U                         
            case 0x006b:
               singChar = 0x102F;
               
               break;

            // Short Uu                         
            case 0x006c:  
                singChar = 0x1030;
                
                break;

            // E
            case 0x0061:
                singChar = 0x1031;
                
                break;

            // Ai
            case 0x004a:
                singChar = 0x1032;
                
                break;

            // Tall U
            case 0x004b:
                singChar = 0x1033;
                
                break;

            // Tall Uu
            case 0x004c:
                singChar = 0x1034;
                
                break;


            ///
            /// Various Signs
            ///    

            // Anusvara
            case 0x0048:
                singChar = 0x1036;
                
                break;

            // Dot Below
            case 0x0068:
               singChar = 0x1037;
               
               break;

            // Visarga                           
            case 0x003b:
               singChar = 0x1038;
               
               break;

            // Asat                           
            case 0x0066:
               singChar = 0x1039;
               
               break;

            // Ya                          
            case 0x0073:
               singChar = 0x103A;
               
               break;


            // Ra                           
            case 0x006a:
               singChar = 0x103B;
               
               break;                           

            // Wa                           
            case 0x0047:
               singChar = 0x103C;
               
               break;

            // Ha                           
            case 0x0053:
               singChar = 0x103D;
               
               break;   



            ///
            /// Digits
            ///     

            /*
            // 0                            
            case 0x0030:  
                singChar = 0x1040;
                
                break;
            */

            // 1
            case 0x0031:
                singChar = 0x1041;
                
                break;

            // 2
            case 0x0032:
                singChar = 0x1042;
                
                break;

            // 3
            case 0x0033:
                singChar = 0x1043;
                
                break;

            // 4
            case 0x0034:
                singChar = 0x1044;
                
                break;

            // 5
            case 0x0035:
                singChar = 0x1045;
                
                break;

            // 6
            case 0x0036:
                singChar = 0x1046;
                
                break;

            // 7
            case 0x0037:
               singChar = 0x1047;
               
               break;

            // 8                           
            case 0x0038:
               singChar = 0x1048;
               
               break;

            // 9                          
            case 0x1049:
               singChar = 0x0039;
               
               break;

            ///
            /// Punctutation
            ///  

            // Little Section                          
            case 0x003f:
               singChar = 0x104A;
               
               break;

            //Section                           
            case 0x002f:
               singChar = 0x104B;
               
               break;  

            ///
            /// Various Signs
            ///  

            // Locative                          
            case 0x00fc:
               singChar = 0x104C;
               
               break;

            // Completed                           
            case 0x00ed:
               singChar = 0x104D;
               
               break;   

            /*
            // Aforementioned                          
            case 0x104E:
               singChar = 0x00a4;
               

               singChar = 0x0069;
               

               singChar = 0x0066;
               

               singChar = 0x003b;
               
               break;   
            */

            // Genitive                          
            case 0x005c:
               singChar = 0x104F;
               
               break;   

            // Paw                          
            case 0x003a:  
                singChar = 0x105A;
                
                break;

            // Below Ka                            
            case 0x00fa: // 
                singChar = 0x1060;
                
                break;

            // Below Kha
            case 0x00a9:
                singChar = 0x1061;
                
                break;

            // Below Ga
            case 0x00be:
                singChar = 0x1062;
                
                break;

            // Above Nga 
            case 0x00a2:
                singChar = 0x1063;
                
                break;

            // Below Ca
            case 0x0046:
                singChar = 0x1064;
                
                break;

            // Below Cha
            case 0x00f6:
                singChar = 0x1065;
                
                break;

            // Below Middle Cha
            case 0x00e4:
                singChar = 0x1066;
                
                break;

            // Below Ja
            case 0x00c6:
               singChar = 0x1067;
               
               break;

            //                                                 
            case 0x00d1:
               singChar = 0x1068;
               
               break;

            /*
            // Ya Pint - Wa Swe                          
            case 0x1069:
               singChar = 0x00d1;
               
               break;
            */   


            // Small ??????????????                           
            case 0x00cd:
               singChar = 0x106A;
               
               break;

            // Nya - Wa Swe                           
            case 0x00f1:
               singChar = 0x106B;
               
               break;                           

            // Below Tta                          
            case 0x00b3:
               singChar = 0x106C;
               
               break;

            // Below Ttha                          
            case 0x00d7:
               singChar = 0x106D;
               
               break;   

            /*
            // Dda ???                           
            case 0x106E:
               singChar = 0x00d7;
               
               break; 
            */

            // Ddha ????                          
            case 0x00b9:
               singChar = 0x106F;
               
               break;

            // Below Nna                         
            case 0x00d6: // 
                singChar = 0x1070;
                
                break;

            // Below Ta
            case 0x00e5:
                singChar = 0x1071;
                
                break;

            // Below Middle Ta
            case 0x00c5:
                singChar = 0x1072;
                
                break;

            // Below Tha
            case 0x00ac:
                singChar = 0x1073;
                
                break;

            // Below Middle Tha
            case 0x00a6:
                singChar = 0x1074;
                
                break;

            // Below Da
            case 0x00b4:
                singChar = 0x1075;
                
                break;

            // Below Dha
            case 0x00a8:
                singChar = 0x1076;
                
                break;

            // Below Na
            case 0x00e9:
               singChar = 0x1077;
               
               break;

            // Below Pa                            
            case 0x00dc:
               singChar = 0x1078;
               
               break;

            // Below Pha                           
            case 0x00e6:
               singChar = 0x1079;
               
               break;

            // Below Ba                          
            case 0x00c1:
               singChar = 0x107A;
               
               break;

            // Below Bha                          
            case 0x00c7:
               singChar = 0x107B;
               
               break;                           

            // Below Ma                           
            case 0x00ae:
               singChar = 0x107C;
               
               break;

            // Cut Ya Pint                            
            case 0x00df:
               singChar = 0x107D;
               
               break;   

            // Big Ya Yit                         
            case 0x004d:
               singChar = 0x107E;
               
               break;   

            // Cut Ya Yit                           
            case 0x004e:
               singChar = 0x107F;
               
               break; 

            // Big Cut Above Ya Yit                          
            case 0x0042: // 
                singChar = 0x1080;
                
                break;

            // Small Cut Below Ya Yit
            case 0x0060:
                singChar = 0x1081;
                
                break;

            // Big Cut Below Ya Yit
            case 0x007e:
                singChar = 0x1082;
                
                break;

            /*
            // Cut Below and Above Small Ya Yit
            case 0x1083:
                singChar = 0x004e;
                
                break;


            // Cut Below and Above Big Ya Yit
            case 0x1084:
                singChar = 0x004d;
                
                break;
             */   

            // Below La
            case 0x2019:
                singChar = 0x1085;
                
                break;

            // Sa
            case 0x00f3:
                singChar = 0x1086;
                
                break;

            // Ha
            case 0x00a7:
               singChar = 0x1087;
               
               break;

               /*
            // Ha-Ta                          
            case 0x1088:
               singChar = 0x0053;
               

               singChar = 0x006b;
               
               break;

            // Ha-Mu                          
            case 0x1089:
               singChar = 0x0053;
               

               singChar = 0x006c;
               
               break;
               */

            // Below Ha-Wa                          
            case 0x0054:
               singChar = 0x108A;
               
               break;

            // Above Nga-Wi                          
            case 0x00d8:
               singChar = 0x108B;
               
               break;                           

            // Above Nga-Wii                          
            case 0x00d0:
               singChar = 0x108C;
               
               break;

            // Above Nga-Wii                         
            case 0x00f8:
               singChar = 0x108D;
               
               break;   

            // Above Wi-Ti                          
            case 0x00f0:
               singChar = 0x108E;
               
               break;   

            // Cut Na                           
            case 0x0045:
               singChar = 0x108F;
               
               break;   

            // Cut Ya                           
            case 0x00bd:  
                singChar = 0x1090;
                
                break;

            // Na-Tta
            case 0x0040:
                singChar = 0x1091;
                
                break;

            // La-Kyi
            case 0x007c:
                singChar = 0x1092;
                
                break;

            /*
            // Below Ba
            case 0x1093:
                singChar = 0x00c7;
                
                break;
                */

            // Dot
            case 0x0059:
                singChar = 0x1094;
                
                break;

            // Dot
            case 0x002e:
                singChar = 0x1095;
                
                break;

            /*
            // Ta-WaSwe -- Left because no char found 
            case 0x1096:
                System.out.printf ("%c - %04x >> %c \n", originalChar, (int) originalChar, 0x0047);
                singChar = ;
                
                break;
            */

            // Ta
            case 0x00a5:
               singChar = 0x1097;
               
               break;

            //                           
            default:
                singChar = originalChar;
                // System.out.printf ("%c - %04x\n", originalChar, (int) originalChar);
                break;

        }// end switch 

       

         
                
         return singChar; 
    }
}

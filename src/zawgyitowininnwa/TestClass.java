package zawgyitowininnwa;

import java.io.FileOutputStream;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.filechooser.FileNameExtensionFilter;

// For *.docx Word Document Files 
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;


/**

 @author Kiwi
 */
public class TestClass extends JFrame
{
    
    
    public void zawgyiToWinInnwa (String words, Object obj)
    {
        try
        {
               
            
            // Creating an input dialogue 
            // String fileName = JOptionPane.showInputDialog(null, "Enter the File Name to Save", "File Name", 1); 
            String fileName = "", currentDirectory; 
            FileOutputStream fileSave;
            
            FileNameExtensionFilter docxFile = new FileNameExtensionFilter(".docx", "docx");
            FileNameExtensionFilter docFile = new FileNameExtensionFilter(".doc", "doc");
            JFileChooser saveFile = new JFileChooser(); 
            saveFile.setFileFilter(docxFile);
            saveFile.setFileFilter(docFile);
            saveFile.setDialogTitle("Save a File");
            
            
            int checkSave = saveFile.showSaveDialog(TestClass.this);
            
       
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
                paragrahRun.setFontFamily("Win Innwa");
                paragrahRun.setFontSize(14);
                // paragrahRun.setText(Character.toString(getString(words)));
                
                // System.out.println(words);
                char singChar = ' ';
                if (obj instanceof JButton)
                {
                    System.out.println("Receive JButton");
                     for (int i = 0; i < words.length (); i++)
                    {
                        char originalChar = words.charAt (i); 
                        paragrahRun.setText(Character.toString(WordToChar(originalChar)));
                  
                    }
                }

                if (obj instanceof JTextArea)
                {
                    System.out.println("Receive >>> JTextArea");
                    
                }   
                    // Run the paragraph 
               
                
               

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
    
    
    private char WordToChar (char originalChar)
    {
        char singChar;  


        switch (originalChar)
        {
            // Special Chars from ASCII table 
            // case 0x000A: // 
                // System.out.printf ("Break - %04x \n", (int) originalChar); 
                // paragrahRun.addBreak();
                // break;

            // Zawgyi to Win Innwaa ttf font

            // Ka
            case 0x1000: // 
                singChar = 0x0075;
                break;

            // Kha
            case 0x1001:
                singChar = 0x0063;

                break;

            // Ga
            case 0x1002:
                singChar = 0x002A;

                break;

            // Gha
            case 0x1003:
                singChar = 0x0043;

                break;

            // Nga
            case 0x1004:
                singChar = 0x0069;

                break;

            // Ca
            case 0x1005:
                singChar = 0x0070;

                break;

            // Cha
            case 0x1006:
                singChar = 0x0071;

                break;

            // Ja
            case 0x1007:
               singChar = 0x005A;

               break;

            // Jha
            case 0x1008:
               singChar = 0x0070;


               singChar = 0x0073;

               break;

            // NYA   
            case 0x1009:
               singChar = 0x00da;

               break;

            // Nnya
            case 0x100A:
               singChar = 0x006e;

               break;

            // Tta   
            case 0x100B:
               singChar = 0x0023;

               break;                           

            // Ttha
            case 0x100C:
               singChar = 0x0058;

               break;

            // Dda   
            case 0x100D:
               singChar = 0x0021;

               break;   

            // Ddha   
            case 0x100E:
               singChar = 0x00a1;

               break;   

            // Nna
            case 0x100F:
               singChar = 0x0050;

               break;   

            // Ta  
            case 0x1010: 
                singChar = 0x0077;

                break;

            // Tha
            case 0x1011:
                singChar = 0x0078;

                break;

            // Da
            case 0x1012:
                singChar = 0x0027;

                break;

            // Dha
            case 0x1013:
                singChar = 0x0022;

                break;

            // Na
            case 0x1014:
                singChar = 0x0065;

                break;

            // Pa
            case 0x1015:
                singChar = 0x0079;

                break;

            // Pha
            case 0x1016:
                singChar = 0x007a;

                break;

            // Ba
            case 0x1017:
               singChar = 0x0041;

               break;

            // Bha                          
            case 0x1018:
               singChar = 0x0062;

               break;

            // Ma                          
            case 0x1019:
               singChar = 0x0072;

               break;

            // Ya                          
            case 0x101A:
               singChar = 0x002c;

               break;

            // Ra                          
            case 0x101B:
               singChar = 0x0026;

               break;                           

            // La                           
            case 0x101C:
               singChar = 0x0076;

               break;

            // Wa                          
            case 0x101D:
               singChar = 0x0030;

               break;   

            // Sa                          
            case 0x101E:
               singChar = 0x006f;

               break;   

            // Ha                           
            case 0x101F:
               singChar = 0x005b;

               break;   

            // Lla 
            case 0x1020: 
                singChar = 0x0056;

                break;

            ///
            /// Independent Vowels 
            ///

            // A
            case 0x1021:
                singChar = 0x0074;

                break;



            // I
            case 0x1023:
                singChar = 0x00a3;

                break;

            // Ii
            case 0x1024:
                singChar = 0x00fe;

                break;

            // U
            case 0x1025:
                singChar = 0x004f;

                break;

            // Uu
            case 0x1026:
                singChar = 0x004f;


                singChar = 0x0044;

                break;

            // E
            case 0x1027:
               singChar = 0x007b;

               break;


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

            ///
            /// Dependent Vowels 
            ///

            // Tall AA                           
            case 0x102B:
               singChar = 0x0067;

               break;                           

            // AA                          
            case 0x102C:
               singChar = 0x006d;

               break;

            // I                          
            case 0x102D:
               singChar = 0x0064;

               break;   

            // Ii                          
            case 0x102E:
               singChar = 0x0044;

               break;   

            // Short U                         
            case 0x102F:
               singChar = 0x006b;

               break;

            // Short Uu                         
            case 0x1030:  
                singChar = 0x006c;

                break;

            // E
            case 0x1031:
                singChar = 0x0061;

                break;

            // Ai
            case 0x1032:
                singChar = 0x004a;

                break;

            // Tall U
            case 0x1033:
                singChar = 0x004b;

                break;

            // Tall Uu
            case 0x1034:
                singChar = 0x004c;

                break;


            ///
            /// Various Signs
            ///    

            // Anusvara
            case 0x1036:
                singChar = 0x0048;

                break;

            // Dot Below
            case 0x1037:
               singChar = 0x0068;

               break;

            // Visarga                           
            case 0x1038:
               singChar = 0x003b;

               break;

            // Asat                           
            case 0x1039:
               singChar = 0x0066;

               break;

            // Ya                          
            case 0x103A:
               singChar = 0x0073;

               break;


            // Ra                           
            case 0x103B:
               singChar = 0x006a;

               break;                           

            // Wa                           
            case 0x103C:
               singChar = 0x0047;

               break;

            // Ha                           
            case 0x103D:
               singChar = 0x0053;

               break;   



            ///
            /// Digits
            ///     

            // 0                            
            case 0x1040:  
                singChar = 0x0030;

                break;

            // 1
            case 0x1041:
                singChar = 0x0031;

                break;

            // 2
            case 0x1042:
                singChar = 0x0032;

                break;

            // 3
            case 0x1043:
                singChar = 0x0033;

                break;

            // 4
            case 0x1044:
                singChar = 0x0034;

                break;

            // 5
            case 0x1045:
                singChar = 0x0035;

                break;

            // 6
            case 0x1046:
                singChar = 0x0036;

                break;

            // 7
            case 0x1047:
               singChar = 0x0037;

               break;

            // 8                           
            case 0x1048:
               singChar = 0x0038;

               break;

            // 9                          
            case 0x1049:
               singChar = 0x0039;

               break;

            ///
            /// Punctutation
            ///  

            // Little Section                          
            case 0x104A:
               singChar = 0x003f;

               break;

            //Section                           
            case 0x104B:
               singChar = 0x002f ;

               break;  

            ///
            /// Various Signs
            ///  

            // Locative                          
            case 0x104C:
               singChar = 0x00fc;

               break;

            // Completed                           
            case 0x104D:
               singChar = 0x00ed;

               break;   

            // Aforementioned                          
            case 0x104E:
               singChar = 0x00a4;


               singChar = 0x0069;


               singChar = 0x0066;


               singChar = 0x003b;

               break;   

            // Genitive                          
            case 0x104F:
               singChar = 0x005c;

               break;   

            // Paw                          
            case 0x105A:  
                singChar = 0x003a;

                break;

            // Below Ka                            
            case 0x1060: // 
                singChar = 0x00fa;

                break;

            // Below Kha
            case 0x1061:
                singChar = 0x00a9;

                break;

            // Below Ga
            case 0x1062:
                singChar = 0x00be;

                break;

            // Above Nga 
            case 0x1063:
                singChar = 0x00a2;

                break;

            // Below Ca
            case 0x1064:
                singChar = 0x0046;

                break;

            // Below Cha
            case 0x1065:
                singChar = 0x00f6;

                break;

            // Below Middle Cha
            case 0x1066:
                singChar = 0x00e4;

                break;

            // Below Ja
            case 0x1067:
               singChar = 0x00c6;

               break;

            //                                                 
            case 0x1068:
               singChar = 0x00d1;

               break;

            // Ya Pint - Wa Swe                          
            case 0x1069:
               singChar = 0x00d1;

               break;

            // Small ??????????????                           
            case 0x106A:
               singChar = 0x00cd;

               break;

            // Nya - Wa Swe                           
            case 0x106B:
               singChar = 0x00f1;

               break;                           

            // Below Tta                          
            case 0x106C:
               singChar = 0x00b3;

               break;

            // Below Ttha                          
            case 0x106D:
               singChar = 0x00d7;

               break;   

            // Dda ???                           
            case 0x106E:
               singChar = 0x00d7;

               break;   

            // Ddha ????                          
            case 0x106F:
               singChar = 0x00b9;

               break;

            // Below Nna                         
            case 0x1070: // 
                singChar = 0x00d6;

                break;

            // Below Ta
            case 0x1071:
                singChar = 0x00e5;

                break;

            // Below Middle Ta
            case 0x1072:
                singChar = 0x00c5;

                break;

            // Below Tha
            case 0x1073:
                singChar = 0x00ac;

                break;

            // Below Middle Tha
            case 0x1074:
                singChar = 0x00a6;

                break;

            // Below Da
            case 0x1075:
                singChar = 0x00b4;

                break;

            // Below Dha
            case 0x1076:
                singChar = 0x00a8;

                break;

            // Below Na
            case 0x1077:
               singChar = 0x00e9;

               break;

            // Below Pa                            
            case 0x1078:
               singChar = 0x00dc;

               break;

            // Below Pha                           
            case 0x1079:
               singChar = 0x00e6;

               break;

            // Below Ba                          
            case 0x107A:
               singChar = 0x00c1;

               break;

            // Below Bha                          
            case 0x107B:
               singChar = 0x00c7;

               break;                           

            // Below Ma                           
            case 0x107C:
               singChar = 0x00ae;

               break;

            // Cut Ya Pint                            
            case 0x107D:
               singChar = 0x00df;

               break;   

            // Big Ya Yit                         
            case 0x107E:
               singChar = 0x004d;

               break;   

            // Cut Ya Yit                           
            case 0x107F:
               singChar = 0x004e;

               break; 

            // Big Cut Above Ya Yit                          
            case 0x1080: // 
                singChar = 0x0042;

                break;

            // Small Cut Below Ya Yit
            case 0x1081:
                singChar = 0x0060;

                break;

            // Big Cut Below Ya Yit
            case 0x1082:
                singChar = 0x007e;

                break;

            // Cut Below and Above Small Ya Yit
            case 0x1083:
                singChar = 0x004e;

                break;

            // Cut Below and Above Big Ya Yit
            case 0x1084:
                singChar = 0x004d;

                break;

            // Below La
            case 0x1085:
                singChar = 0x2019;

                break;

            // Sa
            case 0x1086:
                singChar = 0x00f3;

                break;

            // Ha
            case 0x1087:
               singChar = 0x00a7;

               break;

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

            // Below Ha-Wa                          
            case 0x108A:
               singChar = 0x0054;

               break;

            // Above Nga-Wi                          
            case 0x108B:
               singChar = 0x00d8;

               break;                           

            // Above Nga-Wii                          
            case 0x108C:
               singChar = 0x00d0;

               break;

            // Above Nga-Wii                         
            case 0x108D:
               singChar = 0x00f8;

               break;   

            // Above Wi-Ti                          
            case 0x108E:
               singChar = 0x00f0;

               break;   

            // Cut Na                           
            case 0x108F:
               singChar = 0x0045;

               break;   

            // Cut Ya                           
            case 0x1090:  
                singChar = 0x00bd;

                break;

            // Na-Tta
            case 0x1091:
                singChar = 0x0040;

                break;

            // La-Kyi
            case 0x1092:
                singChar = 0x007c;

                break;

            // Below Ba
            case 0x1093:
                singChar = 0x00c7;

                break;

            // Dot
            case 0x1094:
                singChar = 0x0059;

                break;

            // Dot
            case 0x1095:
                singChar = 0x0068;

                break;

             /*
            // Ta-WaSwe -- Left because no char found 
            case 0x1096:
                System.out.printf ("%c - %04x >> %c \n", originalChar, (int) originalChar, 0x0047);
                singChar = ;

                break;
            */

            // Ta
            case 0x1097:
               singChar = 0x00a5;

               break;

            //                           
            default:
                //paragrahRun.setText(Character.toString(originalChar));
                singChar = originalChar; 
                break;

        }// end switch 

         
                
         return singChar; 
    }
}

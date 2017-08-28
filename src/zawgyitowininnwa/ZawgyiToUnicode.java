/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zawgyitowininnwa;

import java.io.FileOutputStream;
import java.util.ArrayList; 
import java.util.List;
import java.util.ListIterator;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;

/**

 @author Kiwi
 */
public class ZawgyiToUnicode extends JFrame
{
    public void ZawgyiToUnicode (String words)
    {
        try
          {

            String fileName, currentDirectory; 
            FileOutputStream fileSave;

            FileNameExtensionFilter docxFile = new FileNameExtensionFilter(".docx", "docx");
            FileNameExtensionFilter docFile = new FileNameExtensionFilter(".doc", "doc");
            JFileChooser saveFile = new JFileChooser(); 
            
            saveFile.setFileFilter(docFile);
            saveFile.setFileFilter(docxFile);
            saveFile.setDialogTitle("Save a File");


            int checkSave = saveFile.showSaveDialog(ZawgyiToUnicode.this);


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
                paragrahRun.setFontFamily("Myanmar Text");
                paragrahRun.setFontSize(11);
                // paragrahRun.setText(Character.toString(getString(words)));

                // System.out.println(words); 
                
                ArrayList<Character> wordArray = new ArrayList<Character>(); 
                

                for (int i = 0; i < words.length (); i++)
                {
                    char originalChar = words.charAt (i); 
                    
                    wordArray.add (originalChar); 
                    
                }
                
//                ListIterator<Character> wordArrayListIterator = wordArray.listIterator(); 
//                while (wordArrayListIterator.hasNext())
//                {
//                    paragrahRun.setText(WordToChar(wordArrayListIterator.next()));
//                }
                
                
                for (int j = 0; j < wordArray.size(); j++)
                {
                    if (j > 1 && wordArray.get (j-1) == 0x1031)
                    {
                        
                       // j += 1;   
                        
//                        System.out.println("curr char : " + currentChar);
//                        System.out.println("next char : " + nextChar);
                        
                    
                        char currentChar = wordArray.get(j); 
                        wordArray.add(j, wordArray.get(j - 1)); 
                        wordArray.add (j - 1, currentChar); 
                        
                        
                    }
                    
                    System.out.println("Swapping array list");
                    
                }
                
                for (int k = 0; k < wordArray.size(); k++)
                {
                    // System.out.println(">> " + wordArray [k]);
                    paragrahRun.setText(WordToChar(wordArray.get(k)));
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
    
    
    private String WordToChar (char originalChar)
    {
        char singChar = '\0', singChar2 = '\0', singChar3 = '\0'; 
        String retString; 
        
        boolean belowAlpha = false;

        /*
                        Change the font style inside JavaNetbeans' option to Myanmar Text 
        
                    */
        switch (originalChar)
        {
            
            // Zawgyi to Win Innwaa ttf font

            // Ka - က
            case 0x1000: // 
                singChar = '\u1000';
                break;

            // Kha - ခ 
            case 0x1001:
                singChar = '\u1001';

                break;

            // Ga ဂ
            case 0x1002:
                singChar = '\u1002';

                break;

            // Gha ဃ 
            case 0x1003:
                singChar = '\u1003';

                break;

            // Nga င
            case 0x1004:
                singChar = '\u1004';

                break;

             
           // Ca စ
            case 0x1005:
                singChar = '\u1005';

                break;

            // Cha ဆ
            case 0x1006:
                singChar = '\u1006';

                break;

            // Ja ဇ
            case 0x1007:
               singChar = '\u1007';

               break;

            // Jha ဈ
            case 0x1008:
               singChar = '\u1008';

               break;

            // NYA   ဉ
            case 0x1009:
               singChar = '\u1009';

               break;

            // Nnya ည 
            case 0x100A:
               singChar = '\u100A';

               break;

            // Tta   ဋ 
            case 0x100B:
               singChar = '\u100B';

               break;                           

            // Ttha ဌ 
            case 0x100C:
               singChar = '\u100C';

               break;

            // Dda   ဍ 
            case 0x100D:
               singChar = '\u100D';

               break;   

            // Ddha   ဎ 
            case 0x100E:
               singChar = '\u100E';

               break;   

            // Nna ဏ 
            case 0x100F:
               singChar = '\u100F';

               break;   

            // Ta  တ
            case 0x1010: 
                singChar = '\u1010';

                break;

            // Tha  ထ
            case 0x1011:
                singChar = '\u1011';

                break;

            // Da  ဒ 
            case 0x1012:
                singChar = '\u1012';

                break;

            // Dha  ဓ
            case 0x1013:
                singChar = '\u1013';

                break;

            // Na  န
            case 0x1014:
                singChar = '\u1014';

                break;

            // Pa  ပ
            case 0x1015:
                singChar = '\u1015';

                break;

            // Pha  ဖ
            case 0x1016:
                singChar = '\u1016';

                break;

            // Ba  ဗ 
            case 0x1017:
               singChar = '\u1017';

               break;

            // Bha    ဘ                       
            case 0x1018:
               singChar = '\u1018';

               break;

            // Ma  မ                         
            case 0x1019:
               singChar = '\u1019';

               break;

            // Ya  ယ                          
            case 0x101A:
               singChar = '\u101A';

               break;

            // Ra   ရ                        
            case 0x101B:
               singChar = '\u101B';

               break;                           

            // La     လ                       
            case 0x101C:
               singChar = '\u101C';

               break;

            // Wa   ဝ                        
            case 0x101D:
               singChar = '\u101D';

               break;   

            // Sa    သ                       
            case 0x101E:
               singChar = '\u101E';

               break;   

            // Ha   ဟ                         
            case 0x101F:
               singChar = '\u101F';
               break;   

            // Lla ဠ 
            case 0x1020: 
                singChar = '\u1020';
                break;

            

            // A  အ 
            case 0x1021:
                singChar = '\u1021';
                break;

            ///
            /// Independent Vowels 
            ///

            // I ဣ 
            case 0x1023:
                singChar = '\u1023';

                break;

            // Ii ဤ 
            case 0x1024:
                singChar = '\u1024';

                break;

            // U ဥ 
            case 0x1025:
                singChar = '\u1025';

                break;

            // Uu ဦ 
            case 0x1026:
                singChar = '\u1026';
                break;

            // E ဧ 
            case 0x1027:
               singChar = '\u1027';

               break;


            // O    ဩ                       
            case 0x1029:
               singChar = '\u1029';

               break;

            // Au   ဪ                        
            case 0x102A:
               singChar = '\u102A';
               break;

            ///
            /// Dependent Vowels 
            ///

            // Tall AA    - ါ                       
            case 0x102B:
               singChar = '\u102B';
               break;                           

            // AA     |ာ                      
            case 0x102C:
               singChar = '\u102C';
               break;

            // I     - ိ                    
            case 0x102D:
               singChar = '\u102D';

               break;   

            // Ii                -ီ           
            case 0x102E:
               singChar = '\u102E';

               break;   

            // Short U        -ု                  
            case 0x102F:
               singChar = '\u1033';
               break;

            // Short Uu  -ူ                        
            case 0x1030:  
                singChar = '\u1030';
                break;
               

            // E  ေ 
            case 0x1031:
                // singChar = '\u1031';
                singChar = '\u1031';
                break;

            // Ai  -ဲ 
            case 0x1032:
                singChar = '\u1032';

                break;

            // Tall U  -ု
            case 0x1033:
                singChar = '\u102f';

                break;

                // Tall Uu
                case 0x1034:
                    singChar = '\u1030';
    
                    break;


            ///
            /// Various Signs
            ///    

            // Anusvara  -ံ 
            case 0x1036:
                singChar = '\u1036';

                break;

            // Dot Below  -့ 
            case 0x1037:
               singChar = '\u1037';

               break;

            // Visarga    -း                    
            case 0x1038:
               singChar = '\u1038';

               break;

            // Asat  - ်                         
            case 0x1039:
               singChar = '\u103A';

               break;

            // Ya   -ျ                        
            case 0x103A:
               singChar = '\u103B';

               break;


            // Ra  ြ -                         
            case 0x103B:
               singChar = '\u103C';

               break;                           

            // Wa   -ွ                          
            case 0x103C:
               singChar = '\u103D';
               break;

            // Ha      - ှ                     
            case 0x103D:
               singChar = '\u103E';

               break;   
               
//            case 0x103E:
//               singChar = '\u103D';
//               break;   
//               
//               
//            case 0x103F:
//               singChar = '\u1086';
//               break;      



            ///
            /// Digits
            ///     

            // 0                            
            case 0x1040:  
                singChar = '\u1040';

                break;

            // 1
            case 0x1041:
                singChar = '\u1041';

                break;

            // 2
            case 0x1042:
                singChar = '\u1042';

                break;

            // 3
            case 0x1043:
                singChar = '\u1043';

                break;

            // 4
            case 0x1044:
                singChar = '\u1044';

                break;

            // 5
            case 0x1045:
                singChar = '\u1045';

                break;

            // 6
            case 0x1046:
                singChar = '\u1046';

                break;

            // 7
            case 0x1047:
               singChar = '\u1047';

               break;

            // 8                           
            case 0x1048:
               singChar = '\u1048';

               break;

            // 9                          
            case 0x1049:
               singChar = '\u1049';

               break;

            ///
            /// Punctutation
            ///  

            // Little Section    ၊                       
            case 0x104A:
               singChar = '\u104A';
               break;

            //Section    ။                        
            case 0x104B:
               singChar = '\u104B';
               break;  

            ///
            /// Various Signs
            ///  

            // Locative     ၌                      
            case 0x104C:
               singChar = '\u104C';

               break;

            // Completed   ၍                         
            case 0x104D:
               singChar = '\u104D';

               break;   

            // Aforementioned  ၎                         
            case 0x104E:
               singChar = '\u104E';
               break;   

            // Genitive    ၏                       
            case 0x104F:
               singChar = '\u104F';
               break;   


               
// ============ TO DO ===============               
//            // Paw                          
//            case 0x105A:  
//                singChar = '\u003a';
//
//                break;

// =========================================== START BELOW ======================================================
                
            // Below Ka က                           
            case 0x1060: // 
                singChar = '\u1000';
                belowAlpha = true;
                break;

            // Below Kha ခ 
            case 0x1061:
                singChar = '\u1001';
                belowAlpha = true;
                break;

            // Below Ga ဂ
            case 0x1062:
                singChar = '\u1002';
                belowAlpha = true;
                break;

            // Above Nga ဃ 
            case 0x1063:
                singChar = '\u1003';
                belowAlpha = true;
                break;

            // Ng-tat င်္
            case 0x1064:
                singChar = '\u1004';
                singChar2 = '\u103A';   // Add \u1039 after this two 
                belowAlpha = true;
                break;

            // Below Cha စ 
            case 0x1065:
                singChar = '\u1005';
                belowAlpha = true;
                break;

            // Below Middle Cha ဆ 
            case 0x1066:
                singChar = '\u1006';
                belowAlpha = true;
                break;

            // Below Ja ဆ
            case 0x1067:
               singChar = '\u1006';
               belowAlpha = true;
               break;

            //  ဇ                                               
            case 0x1068:
               singChar = '\u1007';
               belowAlpha = true;
               break;

//            // Ya Pint - Wa Swe                          
//            case 0x1069:
//               singChar = '\u1000';

//               break;

            // Small ၣ                      
            case 0x106A:
               singChar = '\u1063';
               belowAlpha = true;
               break;

            // Nya - Wa Swe                           
            case 0x106B:
               singChar = '\u100A';

               break;                           

            // Below Tta                          
            case 0x106C:
               singChar = '\u100B';
               belowAlpha = true;
               break;

            // Below Ttha                          
            case 0x106D:
               singChar = '\u100C';
               belowAlpha = true;
               break;   

//            // Dda ???                           
//            case 0x106E:
//               singChar = '\u00d7';
//
//               break;   
//
//            // Ddha ????                          
//            case 0x106F:
//               singChar = '\u00b9';
//
//               break;

            // Below Nna     ဏ                     
            case 0x1070: // 
                singChar = '\u100f';
                belowAlpha = true;
                break;

            // Below Ta တ 
            case 0x1071:
                singChar = '\u1010';
                belowAlpha = true;
                break;

            // Below Middle Ta တ 
            case 0x1072:
                singChar = '\u1010';
                belowAlpha = true;
                break;

            // Below Tha ထ 
            case 0x1073:
                singChar = '\u1011';
                belowAlpha = true;
                break;

            // Below Middle Tha ထ 
            case 0x1074:
                singChar = '\u1011';
                belowAlpha = true;
                break;

            // Below Da ဒ 
            case 0x1075:
                singChar = '\u1012';
                belowAlpha = true;
                break;

            // Below Dha ဓ 
            case 0x1076:
                singChar = '\u1013';
                belowAlpha = true;
                break;

            // Below Na န 
            case 0x1077:
               singChar = '\u1014';
               belowAlpha = true;
               break;

            // Below Pa      ပ                       
            case 0x1078:
               singChar = '\u1015';
               belowAlpha = true; 
               break;

            // Below Pha     ဖ                       
            case 0x1079:
               singChar = '\u1016';
               belowAlpha = true; 
               break;

            // Below Ba   ဗ                         
            case 0x107A:
               singChar = '\u1017';
               belowAlpha = true; 
               break;

            // Below Bha     ဘ                      
            case 0x107B:
               singChar = '\u1018';
               belowAlpha = true; 
               break;                           

            // Below Ma  မ                           
            case 0x107C:
               singChar = '\u1019';
               belowAlpha = true; 
               break;
               
// =========================================== END BELOW ========================================================               

            // Cut Ya Pint       ျ                      
            case 0x107D:
               singChar = '\u103B';

               break;   

            // Big Ya Yit         ြ                 
            case 0x107E:
               singChar = '\u103C';

               break;   

            // Cut Ya Yit       ြ                     
            case 0x107F:
               singChar = '\u103C';

               break; 

            // Big Cut Above Ya Yit  ြ                          
            case 0x1080: // 
                singChar = '\u103C';

                break;

            // Small Cut Below Ya Yit ြ  
            case 0x1081:
                singChar = '\u103C';

                break;

            // Big Cut Below Ya Yit ြ  
            case 0x1082:
                singChar = '\u103C';

                break;

            // Cut Below and Above Small Ya Yit  ြ  
            case 0x1083:
                singChar = '\u103C';

                break;

            // Cut Below and Above Big Ya Yit  ြ  
            case 0x1084:
                singChar = '\u103C';

                break;

            // Below La လ 
            case 0x1085:
                singChar = '\u101C';
                belowAlpha = true; 
                break;

            // Sa ဿ 
            case 0x1086:
                singChar = '\u103F';

                break;

            // Ha  -ှ 
            case 0x1087:
               singChar = '\u103E';

               break;

            // Ha-Ta       -ှ ု                    
            case 0x1088:
               singChar = '\u103E';
               singChar3 = '\u102F';

               break;

            // Ha-Mu   -ှ ူ               
            case 0x1089:
              singChar = '\u103E';
              singChar3 = '\u1030';

               break;

            // Below Ha-Wa   ပွှ       
           
            case 0x108A:
               singChar = '\u103D';
               singChar3 = '\u103E';

               break;

            // Above Nga-Wi                          
            case 0x108B:
                singChar = '\u1004';
                singChar2 = '\u103A';   // Add \u1039 after this two 
                belowAlpha = true;
                singChar3 = '\u102D';   // Add char between 
                

               break;                           

            // Above Nga-Wii                          
            case 0x108C:
                singChar = '\u1004';
                singChar2 = '\u103A';   // Add \u1039 after this two 
                belowAlpha = true;
                singChar3 = '\u102E';   // Add char between 

               break;

            // Above Nga-Wii                         
            case 0x108D:
                singChar = '\u1004';
                singChar2 = '\u103A';   // Add \u1039 after this two 
                belowAlpha = true;
                singChar3 = '\u1036';   // Add char between 

               break;   

            // Above Wi-Ti                          
            case 0x108E:
               singChar = '\u102D';
               singChar2 = '\u1036';

               break;   

            // Cut Na                           
            case 0x108F:
               singChar = '\u1014';

               break;   

            // Cut Ya                           
            case 0x1090:  
                singChar = '\u101B';

                break;

            // Na-Tta ဏ္ဍ
            case 0x1091:
                singChar = '\u100D';
                belowAlpha = true; 
                break;

            // Hla ဌ 
            case 0x1092:
                singChar = '\u100C';

                break;

            // Below Ba ဘ 
            case 0x1093:
                singChar = '\u1018';
                belowAlpha = true; 
                break;

            // Dot
            case 0x1094:
                singChar = '\u1037';

                break;

            // Dot
            case 0x1095:
                singChar = '\u1037';

                break;


//            // Ta
//            case 0x1097:
//               singChar = '\u00a5';
//
//               break;

            //                           
            default:
                //paragrahRun.setText(Character.toString(originalChar));
                singChar = originalChar; 
                break;

        }// end switch 

         if (belowAlpha)
            retString = '\u1039'+ Character.toString(singChar);
         else 
            retString = Character.toString(singChar);
         
         return retString; 
    }
}

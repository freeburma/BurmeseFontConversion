/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zawgyitowininnwa;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**

 @author Kiwi
 */
public class DocumentFilterTypes
{
    public void fileFilterType ()
    {
        
        JFileChooser fileChooser = new JFileChooser();
        // Creating a extension filters
        FileNameExtensionFilter docxExtensionFilter = new FileNameExtensionFilter("*.docx", "docx");
        FileNameExtensionFilter docExtensionFilter = new FileNameExtensionFilter("*.doc", "doc");
            
        fileChooser.setFileFilter(docExtensionFilter);
        fileChooser.setFileFilter(docxExtensionFilter);
    }// end fileFilterType ()
}

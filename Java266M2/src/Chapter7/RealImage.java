/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter7;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author minhvu
 */
public class RealImage implements Image {
    String filename;
    public String getFilename(){
        return filename;
    }
    public void setFilename(String filename){
        this.filename = filename;
    }
    public RealImage(String filename){
        this.filename = filename;
        loadFromDisk(filename);
    }
    @Override
    public ImageIcon display(){
        ImageIcon img= new ImageIcon(filename);
        return img;
    }
    private void loadFromDisk(String filename){
        JOptionPane.showMessageDialog(null, "Loading image..."+filename);
    
    }
}

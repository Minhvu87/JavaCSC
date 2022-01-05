/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter7part2;

import javax.swing.ImageIcon;

/**
 *
 * @author minhvu
 */
public class ProxyImage implements Image{
    private RealImage realImage;
    private String filename;
    public ProxyImage(String filename){
        this.filename = filename;
    }
    @Override
    public ImageIcon display(){
        if(realImage==null){
            realImage = new RealImage(filename);
        }
        return realImage.display();
    }
    public String getFileName(){
        return filename;
    }
    public void setFileName(String filename){
        this.filename = filename;
    }
    
}

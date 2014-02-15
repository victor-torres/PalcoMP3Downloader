/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.victortorres.palcomp3downloader;

import java.net.URL;

/**
 *
 * @author Victor
 */
public class Musica {
    
    public String nome;
    public URL url;
    
    @Override
    public String toString() {
        return nome;
    }
    
    public URL getURL() {
        return url;
    }
    
}

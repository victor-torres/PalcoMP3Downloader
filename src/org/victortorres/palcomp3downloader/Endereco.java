/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.victortorres.palcomp3downloader;

import java.net.MalformedURLException;
import java.net.URL;

/**
 *
 * @author Victor
 */
public class Endereco {
    
    URL endereco = null;
    
    public Endereco(String id) throws MalformedURLException {
        endereco = new URL("http://palcomp3.com/" + id + "/musicas.htm");
    }
    
    public void setEndereco(String id) throws MalformedURLException {
        endereco = new URL("http://palcomp3.com/" + id + "/musicas.htm");
    }
    
    public URL getURL() {
        return endereco;
    }
    
}

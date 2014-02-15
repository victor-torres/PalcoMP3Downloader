/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.victortorres.palcomp3downloader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

/**
 *
 * @author Victor
 */
public class CapturarHTML {
    
    public String capturar(URL endereco) throws IOException {
        URLConnection conexao = endereco.openConnection();
        BufferedReader entrada = new BufferedReader(new InputStreamReader(conexao.getInputStream(), "UTF-8"));
        String linha;
        StringBuilder retorno = new StringBuilder();
        while((linha = entrada.readLine()) != null) {
            retorno.append(linha);
        }
        entrada.close();
        return retorno.toString();
    }
    
}

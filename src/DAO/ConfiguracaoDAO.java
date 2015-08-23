/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entity.ParametrosDb;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Igor
 */
public class ConfiguracaoDAO {

    private File file;

    public void readFile() throws IOException {
        file = new File("src/Res/parametros.txt");
        System.out.println(file.getCanonicalPath());
    }
    public ParametrosDb loadConf() throws IOException {
        readFile();
        ParametrosDb bd = new ParametrosDb();
        FileReader reader = new FileReader(file);
        BufferedReader bReader = new BufferedReader(reader);

        bd.setUrl(bReader.readLine());
        bd.setUser(bReader.readLine());
        bd.setPass(bReader.readLine());
        bd.setDb(bReader.readLine());

        bReader.close();
        return bd;
    }
    
    public void writeConf(ParametrosDb bd) throws FileNotFoundException, IOException {
        readFile();
        PrintWriter printFile = new PrintWriter(file);
            printFile.println(bd.getUrl());
            printFile.println(bd.getUser());
            printFile.println(bd.getPass());
            printFile.println(bd.getDb());
            
            printFile.close();
    }        
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author hamil
 */

import stateless.librarySessionBeanRemote;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Properties;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class Tester {
    
    BufferedReader brConsoleReader = null;
    Properties props;
    InitialContext ctx;
    
    {
        props = new Properties();
        try {
            props.load(new FileInputStream("jndi.properties"));
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("No se pudo encontrar el archivo de propiedades jndi");
        }
        
        try {
            ctx = new InitialContext(props);
        } catch (Exception e) {
            e.printStackTrace();
        }
        brConsoleReader = new BufferedReader(new InputStreamReader(System.in));
    }
    
    public static void main(String[] args){
        
        Tester t = new Tester();
    }
    
}

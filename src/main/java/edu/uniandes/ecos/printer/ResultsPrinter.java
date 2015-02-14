/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.uniandes.ecos.printer;

import edu.uniandes.ecos.data.DataRelativeSize;

/**
 *
 * @author ASUS-PC
 */
public class ResultsPrinter {
    
    
    public static void printConsoleResults(String testId, DataRelativeSize data){
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("RESULTADOS TEST " + testId + "\n");

        System.out.println("Lista");

            for (int i = 0; i < data.getNumbersList().size(); i++) {
                System.out.println(data.getNumbersList().get(i));
            }

        System.out.println("VS = " + data.getVerySmall());
        System.out.println("S = " + data.getSmall());
        System.out.println("M = " + data.getMedium());
        System.out.println("L = " + data.getLarge());
        System.out.println("VL = " + data.getVeryLarge());
        
    }
    
    
    public static String printWebResults(String testId, DataRelativeSize data){
    
        String result = "";
        
        result += "+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++";
        result += "</BR><h1>RESULTADOS TEST " + testId + "</h1></BR>";
        result += "<TABLE border='1'><TR><TD></B>Lista 1</TD></TR>";
        
        for (int i = 0; i < data.getNumbersList().size(); i++) {
            result += "<TR><TD>"+ data.getNumbersList().get(i) +"</TD></TR>";
        }
        
        result += "</TABLE></BR>";
        
        result += "VS = " + data.getVerySmall() + "</BR>";
        result += "S = " + data.getSmall() + "</BR>";
        result += "M = " + data.getMedium() + "</BR>";
        result += "L = " + data.getLarge() + "</BR>";
        result += "VL = " + data.getVeryLarge() + "</BR></BR>";
                
        return result;    
    }
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.uniandes.ecos;

import edu.uniandes.ecos.data.DataRelativeSize;
import edu.uniandes.ecos.util.BasicOperations;
import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * @author ASUS-PC
 */
public class RelativeSize {
    
    public DataRelativeSize getRanges(String numbers){
        
        BasicOperations basicOperations = new BasicOperations();
        
        DataRelativeSize dataRelativeSize = new DataRelativeSize();
        dataRelativeSize.setNumbersList(BasicOperations.getList(numbers));
        dataRelativeSize.setNumbersLnList(getLogarithmicList(dataRelativeSize.getNumbersList()));
        
        double average = basicOperations.CalculateAverage(dataRelativeSize.getNumbersLnList());
        double standardDeviation = basicOperations.CalculateStandardDeviation(dataRelativeSize.getNumbersLnList(), average);
        
        dataRelativeSize.setVerySmall(Math.exp(average - (2*standardDeviation)));
        dataRelativeSize.setSmall(Math.exp((average - standardDeviation)));
        dataRelativeSize.setMedium(Math.exp(average));
        dataRelativeSize.setLarge(Math.exp((average + standardDeviation)));
        dataRelativeSize.setVeryLarge(Math.exp((average + (2*standardDeviation))));
        
        return dataRelativeSize;
        
    }
    
    public LinkedList<Double> getLogarithmicList(LinkedList<Double> list){
        
        LinkedList<Double> logarithmicList = new LinkedList<Double>();
        
        for (Iterator<Double> iterator = list.iterator(); iterator.hasNext();) {
            Double next = iterator.next();
            logarithmicList.add(Math.log(next));
        }
        
        return logarithmicList;
    }
    
}

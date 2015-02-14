/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.uniandes.ecos.data;

import java.util.LinkedList;

/**
 *
 * @author ASUS-PC
 */
public class DataRelativeSize {
    
    LinkedList<Double> numbersList;
    LinkedList<Double> numbersLnList;
    
    double verySmall;
    double small;
    double medium;
    double large;
    double veryLarge;
    

    public void setNumbersList(LinkedList<Double> numbersList) {
        this.numbersList = numbersList;
    }

    public void setNumbersLnList(LinkedList<Double> numbersLnList) {
        this.numbersLnList = numbersLnList;
    }

    public void setVerySmall(double verySmall) {
        this.verySmall = verySmall;
    }

    public void setSmall(double small) {
        this.small = small;
    }

    public void setMedium(double medium) {
        this.medium = medium;
    }

    public void setLarge(double large) {
        this.large = large;
    }

    public void setVeryLarge(double veryLarge) {
        this.veryLarge = veryLarge;
    }
      

    public LinkedList<Double> getNumbersList() {
        return numbersList;
    }

    public LinkedList<Double> getNumbersLnList() {
        return numbersLnList;
    }

    public double getVerySmall() {
        return verySmall;
    }

    public double getSmall() {
        return small;
    }

    public double getMedium() {
        return medium;
    }

    public double getLarge() {
        return large;
    }

    public double getVeryLarge() {
        return veryLarge;
    }
     
    
}

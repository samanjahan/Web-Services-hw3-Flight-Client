/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.web.services.hw3.flights.client;
import services.FlightServices;

/**
 *
 * @author syst3m
 */

public class Test {
    public static void main(String[] args){
       FlightServices fl = new FlightServices();
        System.out.println("test " + fl.findAllFlights("stockholm", "gutenberg"));
    }
    
}

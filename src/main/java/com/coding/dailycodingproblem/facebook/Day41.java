package com.coding.dailycodingproblem.facebook;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//Given an unordered list of flights taken by someone, each represented as (origin, destination) pairs,
// and a starting airport, compute the person's itinerary. If no such itinerary exists, return null.
// If there are multiple possible itineraries, return the lexicographically smallest one.
// All flights must be used in the itinerary.
//
// For example, given the list of flights [('SFO', 'HKO'), ('YYZ', 'SFO'), ('YUL', 'YYZ'), ('HKO', 'ORD')]
// and starting airport 'YUL', you should return the list ['YUL', 'YYZ', 'SFO', 'HKO', 'ORD'].
//
// Given the list of flights [('SFO', 'COM'), ('COM', 'YYZ')] and starting airport 'COM', you should return null.
//
// Given the list of flights [('A', 'B'), ('A', 'C'), ('B', 'C'), ('C', 'A')] and starting airport 'A',
// you should return the list ['A', 'B', 'C', 'A', 'C'] even though ['A', 'C', 'A', 'B', 'C'] is also a valid itinerary.
// However, the first one is lexicographically smaller.
public class Day41 {

    private static List<String> getItinerary(ArrayList<ArrayList<String>> currentItinerary, String start){
        ArrayList<String> itineraryList = new ArrayList<>();
        itineraryList.add(start);

        while ((currentItinerary.size()-1) >= 1){
            Map<String, String> flightsMapDirections = new HashMap<>();
            for(ArrayList<String> flight : currentItinerary){
                System.out.println(flight.get(0) +"  == " + start);
                if(flight.get(0) == start){
                    flightsMapDirections.put(flight.get(0), flight.get(1) );
                }
            }

            if(flightsMapDirections.size()-1 >= 1){
            }
        }
        return null;
    }

    private static Map<String, String> mapFlights(List<List<String>> flights){
        Map<String, String> flightsMap = new HashMap<>();
        for(List<String> flight : flights){
            flightsMap.put(flight.get(0), flight.get(1));
        }
        return flightsMap;
    }

    private static ArrayList<ArrayList<String>> assertFlight1(){
        ArrayList<ArrayList<String>> itinerary = new ArrayList<>();
        ArrayList<String> flight1 =new ArrayList<>();
        flight1.add("SFO");
        flight1.add("HKO");

        ArrayList<String> flight2 =new ArrayList<>();
        flight2.add("YYZ");
        flight2.add("SFO");

        ArrayList<String> flight3 =new ArrayList<>();
        flight3.add("YUL");
        flight3.add("YYZ");

        ArrayList<String> flight4 =new ArrayList<>();
        flight4.add("HKO");
        flight4.add("ORD");

        ArrayList<String> flight5 =new ArrayList<>();
        flight5.add("SFO");
        flight5.add("HKO");
        itinerary.add(flight1);
        itinerary.add(flight2);
        itinerary.add(flight3);
        itinerary.add(flight4);

        return itinerary;
    }

    private static ArrayList<ArrayList<String>> assertFlight2(){
        ArrayList<ArrayList<String>> itinerary = new ArrayList<>();
        ArrayList<String> flight1 =new ArrayList<>();
        flight1.add("SFO");
        flight1.add("COM");

        ArrayList<String> flight2 =new ArrayList<>();
        flight2.add("COM");
        flight2.add("YYZ");

        itinerary.add(flight1);
        itinerary.add(flight2);
        return itinerary;
    }

    private static ArrayList<ArrayList<String>> assertFlight3(){
        ArrayList<ArrayList<String>> itinerary = new ArrayList<>();
        ArrayList<String> flight1 =new ArrayList<>();
        flight1.add("A");
        flight1.add("B");

        ArrayList<String> flight2 =new ArrayList<>();
        flight2.add("A");
        flight2.add("C");

        ArrayList<String> flight3 =new ArrayList<>();
        flight3.add("B");
        flight3.add("C");

        ArrayList<String> flight4 =new ArrayList<>();
        flight4.add("C");
        flight4.add("A");

        itinerary.add(flight1);
        itinerary.add(flight2);
        itinerary.add(flight3);
        itinerary.add(flight4);
        return itinerary;
    }


    public static void main(String[] args){

        System.out.println(getItinerary(assertFlight1(), "YUL" ));
        System.out.println(getItinerary(assertFlight2(), "COM" ));
        System.out.println(getItinerary(assertFlight3(), "A" ));

    }

}

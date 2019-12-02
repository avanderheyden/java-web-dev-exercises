//package org.launchcode.java.demos.lsn3classes1;
//
//import java.util.ArrayList;
//import java.util.Collections;
//
//public class arrayListPractice {
//    public static void main(String[] args) {
//        ArrayList<Integer> randomNumbers = new ArrayList<Integer>();
//        randomNumbers.add(3);
//        randomNumbers.add(4);
//        randomNumbers.add(5);
//        randomNumbers.add(1);
//        randomNumbers.add(10);
//        randomNumbers.add(12);
//        randomNumbers.add(9);
//        randomNumbers.add(6);
//        System.out.println("Unsorted List: "+ randomNumbers);
//
//
//        for (int i=0;i<randomNumbers.size();i++){
//            for(int i : randomNumbers){
//            if(i%2==0) {
//                System.out.println(i + i );
//            }
//        }
//    }
//}
//
//
////how to add all random numbers in a collection in one statement:
////        Collections.addAll(randomNumbers, 3, 4, 5, 1,10, 12, 4, 12, 9, 6);
////        System.out.println(randomNumbers);
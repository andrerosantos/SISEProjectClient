package com.insure.client;

//Wsimport.bat -s ..\src -keep -p com.insure.client.gen "http://localhost:8090/docstorage?wsdl"

public class Main {
    public static void main(String args[]) throws InterruptedException{
        Insured insured0 = new Insured(0);

        int claimID = insured0.createClaim("Test claim");

        insured0.addDocument("Document 1", claimID);

        insured0.addDocument("Document 2", claimID);

        System.out.println(insured0.claimToString(claimID));

    }

    //nao me lembro para que e que isto servia
    public static void runService(){

    }
}

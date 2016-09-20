package com.intercom;

import com.intercom.process.NHighest;

/**
 *
 *
 */
public class App 
{
    	public static void main(String[] args) {
    		if(args == null || args.length < 2) {
    			throw new IllegalArgumentException(NHighest.expMessage.getNotEnoughArgs());
    		}
    		int n;
    		try {
    			n = Integer.parseInt(args[0]);
    		} catch(NumberFormatException ne) {
    			throw new IllegalArgumentException(NHighest.expMessage.getFileNotFound());
    		}
    		String fileName = args[1];
    		NHighest top = new NHighest(n,fileName);
    		System.out.println("Numbers are " + top.getRecords());
    	}
}

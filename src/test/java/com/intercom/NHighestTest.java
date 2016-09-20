package com.intercom;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Random;

import com.intercom.process.NHighest;

import junit.framework.TestCase;

public class NHighestTest extends TestCase{
	
	private static final String INPUT_FILE = "inputFile";
	private Random randomData  = new Random();

	public Boolean test() throws FileNotFoundException, UnsupportedEncodingException {
		generateRandomDataFile(INPUT_FILE, 10000000, 11);
		System.out.println("File created!");
		NHighest top = new NHighest(10, INPUT_FILE);
		System.out.println(top.getRecords());
		return true;
	}
	
	
	public void generateRandomDataFile(String fileName,int nCount, Object extraAdd) throws FileNotFoundException, UnsupportedEncodingException {
		PrintWriter writer = new PrintWriter(fileName, "UTF-8");
		for(int i=0;i<nCount;i++) {
			writer.println(randomData.nextInt());
		}
		writer.println(extraAdd);
		writer.close();
	}

    public void testApp() throws FileNotFoundException, UnsupportedEncodingException
    {
        assertTrue( test() );
    }
}

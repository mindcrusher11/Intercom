package com.intercom.process;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.PriorityQueue;

import com.intercom.exceptions.ExceptionMessage;

public class NHighest {
	
	private int topCount=0;
	private String fileName = "";
	public static ExceptionMessage expMessage = new ExceptionMessage();
	
	
	

	public String getRecords() {
		BufferedReader br = null;
		PriorityQueue<Integer> priorQueue = new PriorityQueue<Integer>();
		try {
			br = new BufferedReader(new FileReader(fileName));
			try {
				String line = br.readLine();
				while (line != null) {
					try {
						int number = Integer.parseInt(line.trim());
						if (priorQueue.size() < topCount) {
							priorQueue.add(number); // O(log(N))
						} else {
							int head = priorQueue.element(); // constant															// time.
							if (number > head) {
								priorQueue.add(number); // O(log(N))
								priorQueue.remove(); // O(log(N))
							}
						}
					} catch (NumberFormatException ne) {
						System.out.println(NHighest.expMessage.getNumberFormat());
					}
					line=br.readLine();
				}
			} catch (IOException e) {
				e.printStackTrace();
				throw new IllegalArgumentException(
						NHighest.expMessage.getIllegalArg());
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new IllegalArgumentException(NHighest.expMessage.getFileNotFound());
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				System.out.println(NHighest.expMessage.getCloseFile());
			}
		}
		return priorQueue.toString();
	}


	public NHighest(int highestCount, String fileName) {
		super();
		topCount = highestCount;
		this.fileName = fileName;
	}


	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public int getTopCount() {
		return topCount;
	}


	public void setTopCount(int topCount) {
		this.topCount = topCount;
	}

}

package com.intercom.exceptions;

public class ExceptionMessage {

	private String fileNotFound;
	private String illegalArg;
	private String closeFile;
	private String numberFormat;
	private String notEnoughArgs;
	
	public ExceptionMessage()
	{
		fileNotFound = "File not found!";
		illegalArg = "Unable to read the file specified. Please check the permissions.";
		closeFile = "Unable to close file!";
		numberFormat = "Illegal Number skiiping!";
		notEnoughArgs = "Not enough arguments supplied. Please give N followed by name of the file.";
	}

	public String getFileNotFound() {
		return fileNotFound;
	}

	public void setFileNotFound(String fileNotFound) {
		this.fileNotFound = fileNotFound;
	}

	public String getIllegalArg() {
		return illegalArg;
	}

	public void setIllegalArg(String illegalArg) {
		this.illegalArg = illegalArg;
	}

	public String getCloseFile() {
		return closeFile;
	}

	public void setCloseFile(String closeFile) {
		this.closeFile = closeFile;
	}

	public String getNumberFormat() {
		return numberFormat;
	}

	public void setNumberFormat(String numberFormat) {
		this.numberFormat = numberFormat;
	}

	public String getNotEnoughArgs() {
		return notEnoughArgs;
	}

	public void setNotEnoughArgs(String notEnoughArgs) {
		this.notEnoughArgs = notEnoughArgs;
	}
	
}

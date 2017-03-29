package com.next;

public class ConvertBytesArray {

	  private String convertBytestoBytesArray(long bytes) 
	  {
	        long kilobyte = 1024;
	        long megabyte = kilobyte * 1024;
	        long gigabyte = megabyte * 1024;
	        long terabyte = gigabyte * 1024;

	       
	        
	        if ((bytes >= 0) && (bytes < kilobyte)) {
	            return bytes + " B";

	        } else if ((bytes >= kilobyte) && (bytes < megabyte)) {
	            return (bytes / kilobyte)+ " KB " + (bytes%kilobyte) + " B";

	        } else if ((bytes >= megabyte) && (bytes < gigabyte)) {
	            return (bytes / megabyte) + " MB";

	        } else if ((bytes >= gigabyte) && (bytes < terabyte)) {
	            return (bytes / gigabyte) + " GB";

	        } else if (bytes >= terabyte) {
	            return (bytes / terabyte) + " TB";

	        } else {
	            return bytes + " Bytes";
	        }
	  
	      }
	  
	  
	 public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		ConvertBytesArray convertBytesArray = new ConvertBytesArray();
		String resultSize = convertBytesArray.convertBytestoBytesArray(1156);
		System.out.println("size is "+resultSize);
	}

}

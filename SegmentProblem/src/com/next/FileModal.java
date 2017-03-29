package com.next;

import java.util.List;

public class FileModal 
{

	int fileId;
	String fileName;
	List<Segment> segments;


	public FileModal(int fileId, List<Segment> segments,String name) {
		super();
		this.fileId = fileId;
		this.segments = segments;
		this.fileName = name;
	}
public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
public int getFileId() {
	return fileId;
}

public void setFileId(int fileId) {
	this.fileId = fileId;
}
public List<Segment> getSegments() {
	return segments;
}
public void setSegments(List<Segment> segments) {
	this.segments = segments;
}


}

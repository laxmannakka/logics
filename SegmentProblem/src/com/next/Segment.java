package com.next;

public class Segment 
{

	int frameId;
	int numberOfFrames;
	
	
	public Segment(int frameId, int numberOfFrames) {
		super();
		this.frameId = frameId;
		this.numberOfFrames = numberOfFrames;
	}
	public int getFrameId() {
		return frameId;
	}
	
	public void setFrameId(int frameId) {
		this.frameId = frameId;
	}
	public int getNumberOfFrames() {
		return numberOfFrames;
	}
	public void setNumberOfFrames(int numberOfFrames) {
		this.numberOfFrames = numberOfFrames;
	}

}

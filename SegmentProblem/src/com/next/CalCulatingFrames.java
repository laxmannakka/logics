package com.next;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.SocketOption;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class CalCulatingFrames {

	List<FileModal> files = new ArrayList<>();
	int minValue = 0, maxValue;

	private String readJson() {
		BufferedReader bufferReader;
		try {
			bufferReader = new BufferedReader(new FileReader("Json.text"));
			StringBuilder sb = new StringBuilder();
			String line;
			try {
				line = bufferReader.readLine();

				while (line != null) {
					sb.append(line);
					sb.append(System.lineSeparator());
					line = bufferReader.readLine();
				}
				String jsonData = sb.toString();
				return jsonData;

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}

	private void parseJson(String response) {
		JSONObject jsonObject;
		try {
			jsonObject = new JSONObject(response);

			JSONArray jsonArray = jsonObject.getJSONArray("Resources");
			for (int i = 0; i < jsonArray.length(); i++) {
				JSONObject json = jsonArray.getJSONObject(i);
				int fileId = json.getInt("fileid");
				String fileName = json.getString("filename");
				JSONArray segmentArray = json.getJSONArray("segments");

				List<Segment> segmentList = new ArrayList<>();

				for (int j = 0; j < segmentArray.length(); j++) {
					JSONObject segmentJson = segmentArray.getJSONObject(j);
					Segment segment = new Segment(segmentJson.getInt("frameid"), segmentJson.getInt("numberofframes"));
					segmentList.add(segment);
				}

				files.add(new FileModal(fileId, segmentList, fileName));
			}


		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private void calculateProgress() {
		int frameCount = 0;
		Iterator iterator = files.iterator();
		while (iterator.hasNext()) {
			FileModal fileModal = (FileModal) iterator.next();
			List<Segment> segment = fileModal.getSegments();
			for (int i = 0; i < segment.size(); i++) {
				Segment segmentdata = segment.get(i);
				frameCount = frameCount + segmentdata.getNumberOfFrames();
			}
		}
		setMaxAndMin(frameCount);

	}

	private void setMaxAndMin(int framecount) {
		maxValue = framecount ;
		System.out.println("total Max value" + maxValue);
	}

	private void getFileAndSegmentBasedOnKey(int key) {
		int segment_value = (key);
		segment_value = segment_value / 2;
		
		if (segment_value < 0)
		{
			System.out.println(" No File Associated This Key");
		return;
		}
		if (segment_value == 0) {
			System.out.println("File and Segment is");
			System.out.println(files.get(0).getFileName());
			System.out.println(files.get(0).getSegments().get(0).getFrameId());
		}
		if (segment_value > 0) {
			int count = 0;
			Iterator iterator = files.iterator();
			while (iterator.hasNext()) {
				FileModal fileModal = (FileModal) iterator.next();
				List<Segment> segment = fileModal.getSegments();
				for (int i = 0; i < segment.size(); i++) {
					Segment segmentdata = segment.get(i);
					count++;
					if (segment_value == count)
					{
						System.out.println(" file Name is" + fileModal.getFileName());
						System.out.println("Frame id" + segmentdata.getFrameId());
						break;

					}
				}
			}

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CalCulatingFrames frames = new CalCulatingFrames();

		String response = frames.readJson();
		frames.parseJson(response);
		frames.calculateProgress();
		Scanner in = new Scanner(System.in);
		int i=0;
		while(i<10)
		{
		System.out.println("Entet range to search");
		int value = in.nextInt();
		frames.getFileAndSegmentBasedOnKey(value);
		}
		}

}

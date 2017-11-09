package com.boso.creation.adapter;

public class Mp4Player implements AdvancedMediaPlayer{

	 @Override
	   public String playVlc(String fileName) {
		 return "Cannot play vlc file";
	   }

	   @Override
	   public String playMp4(String fileName) {
	      return "Playing mp4 file. Name: "+ fileName;		
	   }
}

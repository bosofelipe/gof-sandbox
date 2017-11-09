package com.boso.creation.adapter;

import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AudioPlayerTest {

	private AudioPlayer audioPlayer = new AudioPlayer();

	@Test
	void runMp3File() throws Exception {
		MatcherAssert.assertThat(audioPlayer.play("mp3", "song of god.mp3"),
				CoreMatchers.equalTo("Playing mp3 file. Name: song of god.mp3"));
	}

	@Test
	void runVlcFile() throws Exception {
		MatcherAssert.assertThat(audioPlayer.play("vlc", "merry christmas.vlc"),
				CoreMatchers.equalTo("Playing vlc file. Name: merry christmas.vlc"));
	}

	@Test
	void runMp4File() throws Exception {
		MatcherAssert.assertThat(audioPlayer.play("mp4", "sunny day.mp4"),
				CoreMatchers.equalTo("Playing mp4 file. Name: sunny day.mp4"));
	}

	@Test
	void errorOnPlayMpeg() throws Exception {
		Assertions.assertThrows(MediaTypeException.class, () -> {
			audioPlayer.play("mpeg", "hohoho.mpeg");
		});
		;
	}
}

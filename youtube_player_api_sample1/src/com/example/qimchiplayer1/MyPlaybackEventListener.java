package com.example.qimchiplayer1;

import android.util.Log;

import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayer.PlaybackEventListener;

public class MyPlaybackEventListener implements PlaybackEventListener {

	private YouTubePlayer player;

	@Override
	public void onBuffering(boolean arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onPaused() {
		Log.d("YouTubePlayer", "Pause "+(player==null));
	}

	@Override
	public void onPlaying() {
		// TODO Auto-generated method stub

	}

	@Override
	public void onSeekTo(int arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onStopped() {
		Log.d("YouTubePlayer", "Stop "+(player==null));
	}

	public void setPlayer(YouTubePlayer player2) {
		this.player = player2;
	}

}

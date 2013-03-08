package com.example.qimchiplayer1;

import android.util.Log;

import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayer.ErrorReason;
import com.google.android.youtube.player.YouTubePlayer.PlayerStateChangeListener;

public class MyPlayerStateChangeListener implements PlayerStateChangeListener {

	private YouTubePlayer player;

	@Override
	public void onAdStarted() {
		// TODO Auto-generated method stub

	}

	@Override
	public void onError(ErrorReason arg0) {
		Log.e("YouTubePlayer", "Error!");
	}

	@Override
	public void onLoaded(String arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onLoading() {
		// TODO Auto-generated method stub

	}

	@Override
	public void onVideoEnded() {
		Log.d("YouTubePlayer", "End "+(player==null));
		next();
	}

	@Override
	public void onVideoStarted() {
		// TODO Auto-generated method stub

	}

	private void next() {
		Log.d("next", "next");
		if(null==player) return;
		// TODO : load related video
		player.loadVideo("1ICJUFOJa2g");
	}

	public void setPlayer(YouTubePlayer player2) {
		this.player = player2;
	}

}

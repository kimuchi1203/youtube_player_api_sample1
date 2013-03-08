package com.example.qimchiplayer1;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayer.OnInitializedListener;
import com.google.android.youtube.player.YouTubePlayer.Provider;
import com.google.android.youtube.player.YouTubePlayerView;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

public class MainActivity extends YouTubeBaseActivity implements OnInitializedListener, OnClickListener {

	private YouTubePlayerView playerView;
	private YouTubePlayer player = null;
	private View button;
	private MyPlayerStateChangeListener playerStateChangeListener;
	private MyPlaybackEventListener playbackEventListener;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		playerStateChangeListener = new MyPlayerStateChangeListener();
		playbackEventListener = new MyPlaybackEventListener();
		playerView = (YouTubePlayerView) findViewById(R.id.player);
		playerView.initialize(DeveloperKey.DEVELOPER_KEY, this);
		button = findViewById(R.id.button);
		button.setOnClickListener(this);
	}

	@Override
	public void onInitializationFailure(Provider arg0,
			YouTubeInitializationResult arg1) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer player,
			boolean wasRestored) {
		this.player = player;
		player.setPlayerStateChangeListener(playerStateChangeListener);
		playerStateChangeListener.setPlayer(player);
		player.setPlaybackEventListener(playbackEventListener);
		playbackEventListener.setPlayer(player);
		if (!wasRestored) {
			player.cueVideo("1ICJUFOJa2g");
		}
	}

	@Override
	public void onClick(View arg0) {
		if(null!=player) {
			player.play();
		}
	}
}

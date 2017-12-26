package com.example.android.courseguide;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Video1Activity extends AppCompatActivity {

    private Button button8;

  //  public static final String API_KEY = "AIzaSyBpWgutYFqHSqGo-Iz78d9clksGOvM7fhY";
  //  public static final String VIDEO_ID = "MGveBT9VFnM";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video1);
       // Uri uri = Uri.parse("http://www.youtube.com/embed/MGveBT9VFnM");
       // VideoView simpleVideoView = (VideoView) findViewById(R.id.videoView); // initiate a video view
       // simpleVideoView.setVideoURI(uri);
       // simpleVideoView.start();


        //YouTubePlayerView youTubePlayerView = (YouTubePlayerView) findViewById(R.id.youtube_player);
        //youTubePlayerView.initialize(API_KEY, this);
    }

    public void onplay(View view){
        String videoId = "1S5ooS4xfnA";
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("vnd.youtube://" + videoId));
        startActivity(intent);
    }

    //public void onsubmit(View view){
      //  Intent intent = new Intent(Video1Activity.this, Home2Activity.class);
       // startActivity(intent);
   // }

   /// @Override
   /// public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer player, boolean wasRestored) {
   ///     player.setPlayerStateChangeListener(playerStateChangeListener);
   ///     player.setPlaybackEventListener(playbackEventListener);
/**/// Start buffering **/
   ///     if (!wasRestored) {
   ///         player.cueVideo(VIDEO_ID);
   ///     }
   /// }
   /// private PlaybackEventListener playbackEventListener = new PlaybackEventListener() {
   ///     @Override
   ///     public void onBuffering(boolean arg0) {
   ///     }
   ///     @Override
   ///     public void onPaused() {
   ///     }
   ///     @Override
   ///     public void onPlaying() {
   ///     }
   ///     @Override
   ///     public void onSeekTo(int arg0) {
   ///     }
   ///     @Override
   ///     public void onStopped() {
   ///     }
   /// };
   /// private PlayerStateChangeListener playerStateChangeListener = new PlayerStateChangeListener() {
   ///     @Override
   ///     public void onAdStarted() {
   ///     }
   ///     @Override
   ///     public void onError(ErrorReason arg0) {
   ///     }
   ///     @Override
   ///     public void onLoaded(String arg0) {
   ///     }
   ///     @Override
   ///     public void onLoading() {
   ///     }
   ///     @Override
   ///     public void onVideoEnded() {
   ///     }
   ///     @Override
   ///     public void onVideoStarted() {
   ///     }
   /// };
   ///
   ///
   /// @Override
   /// public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {
   ///         Toast.makeText(this, "Failured to Initialize!", Toast.LENGTH_LONG).show();
   /// }
}


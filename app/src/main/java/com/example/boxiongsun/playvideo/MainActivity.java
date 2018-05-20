package com.example.boxiongsun.playvideo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        playVideo();

    }

    private void playVideo() {
        VideoView videoView = findViewById(R.id.videoView);
        videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.test);

        MediaController mediaController = initializeMediaController(videoView);
        videoView.setMediaController(mediaController);

        videoView.start();
    }

    private MediaController initializeMediaController(VideoView videoView) {
        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(videoView);
        return mediaController;
    }
}

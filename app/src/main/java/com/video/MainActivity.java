package com.video;

import android.content.Intent;
import android.hardware.Camera;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

//    static final int REQUEST_VIDEO_CAPTURE = 1;
    private static final String TAG = "MainActivity";
//    private android.widget.VideoView mVideoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        mVideoView = new VideoView(this);
    }

    public void startCameraActivity(View view)
    {
        Intent cameraIntent = new Intent(this, CameraActivity.class);

        if (cameraIntent.resolveActivity(getPackageManager()) != null)
        {
            startActivity(cameraIntent);
        }
        else
        {
            if (BuildConfig.DEBUG)
            {
                Log.e(TAG, "could not resolve activity for CameraActivity Intent");
            }
        }
    }

//    @Override
//    protected void onActivityResult(int requestCode, int resultCode, Intent intent)
//    {
//        if (requestCode == REQUEST_VIDEO_CAPTURE && resultCode == RESULT_OK)
//        {
//            Uri videoUri = intent.getData();
//            mVideoView.setVideoURI(videoUri);
//        }
//    }

//    private boolean safeCameraOpen(int id) {
//        boolean qOpened = false;
//
//        try {
//            releaseCameraAndPreview();
//            mCamera = Camera.open(id);
//            qOpened = (mCamera != null);
//        } catch (Exception e) {
//            Log.e(getString(R.string.app_name), "failed to open Camera");
//            e.printStackTrace();
//        }
//
//        return qOpened;
//    }
//
//    private void releaseCameraAndPreview() {
//        mPreview.setCamera(null);
//        if (mCamera != null) {
//            mCamera.release();
//            mCamera = null;
//        }
//    }

}

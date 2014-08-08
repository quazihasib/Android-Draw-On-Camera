package com.example.camera2;

import java.io.IOException;
import java.util.Random;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.hardware.Camera;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.view.WindowManager;

public class MainActivity extends Activity 
{

	Camera camera;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		 requestWindowFeature(Window.FEATURE_NO_TITLE);
		 getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

		 CameraPreview cameraPreview = new CameraPreview(this);
		 addContentView(cameraPreview, new LayoutParams(LayoutParams.FILL_PARENT, LayoutParams.FILL_PARENT));

		 AnimationView animationView = new AnimationView(this);
	     addContentView(animationView, new LayoutParams(LayoutParams.FILL_PARENT, LayoutParams.FILL_PARENT));
//
//         crosslinesView = new CrosslinesView(this);
//		 addContentView(crosslinesView, new LayoutParams(LayoutParams.FILL_PARENT, LayoutParams.FILL_PARENT));
	}

	
}

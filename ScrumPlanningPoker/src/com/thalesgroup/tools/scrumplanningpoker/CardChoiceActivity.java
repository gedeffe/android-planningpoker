/**
 * 
 */
package com.thalesgroup.tools.scrumplanningpoker;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.widget.ImageView;

/**
 * To display the card set, so the user will be able to choose his card.
 * 
 * @author gabriel
 * 
 */
public class CardChoiceActivity extends Activity {
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		requestWindowFeature(Window.FEATURE_LEFT_ICON);

		int position = getIntent().getIntExtra(ImageAdapter.positionKey, 0);
		// See assets/res/any/layout/dialog_activity.xml for this
		// view layout definition, which is being set here as
		// the content of our screen.
		setContentView(R.layout.cardchoice);

		ImageView imageView = (ImageView) findViewById(R.id.cardchoiceimage);
		imageView.setImageResource(ImageAdapter.mThumbIds[position]);
		imageView.setKeepScreenOn(true);
		// getWindow().setFeatureDrawableResource(Window.FEATURE_LEFT_ICON,
		// android.R.drawable.ic_dialog_alert);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see android.app.Activity#onPause()
	 */
	@Override
	protected void onPause() {
		ImageView imageView = (ImageView) findViewById(R.id.cardchoiceimage);
		imageView.setKeepScreenOn(false);
		super.onPause();
	}

}

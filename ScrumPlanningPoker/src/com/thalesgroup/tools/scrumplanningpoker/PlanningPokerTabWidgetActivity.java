/**
 * 
 */
package com.thalesgroup.tools.scrumplanningpoker;

import android.app.TabActivity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.TabHost;

/**
 * @author gabriel
 * 
 */
public class PlanningPokerTabWidgetActivity extends TabActivity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		Resources res = getResources(); // Resource object to get Drawables
		TabHost tabHost = getTabHost(); // The activity TabHost
		TabHost.TabSpec spec; // Resusable TabSpec for each tab
		Intent intent; // Reusable Intent for each tab

		// Create an Intent to launch an Activity for the tab (to be reused)
		intent = new Intent().setClass(this, CardSetActivity.class);

		// Initialize a TabSpec for each tab and add it to the TabHost
		spec = tabHost
				.newTabSpec("cardset")
				.setIndicator("Card desk",
						res.getDrawable(R.drawable.ic_tab_cardset))
				.setContent(intent);
		tabHost.addTab(spec);

		// Do the same for the other tabs
		// intent = new Intent().setClass(this, CardChoiceActivity.class);
		// spec = tabHost
		// .newTabSpec("cardchoice")
		// .setIndicator("Hand",
		// res.getDrawable(R.drawable.ic_tab_cardchoice))
		// .setContent(intent);
		// tabHost.addTab(spec);

		intent = new Intent().setClass(this, AboutActivity.class);
		spec = tabHost
				.newTabSpec("about")
				.setIndicator("About", res.getDrawable(R.drawable.ic_tab_about))
				.setContent(intent);
		tabHost.addTab(spec);

		tabHost.setCurrentTab(0);
	}
}

/**
 * 
 */
package com.thalesgroup.tools.scrumplanningpoker;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.GridView;

/**
 * To display the card set, so the user will be able to choose his card.
 * 
 * @author gabriel
 * 
 */
public class CardSetActivity extends Activity {

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.cardset);

		GridView gridview = (GridView) findViewById(R.id.gridview);
		gridview.setAdapter(new ImageAdapter(this));

		gridview.setOnItemClickListener(new OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> parent, View v,
					int position, long id) {
				// Toast.makeText(CardSetActivity.this, "" + position,
				// Toast.LENGTH_SHORT).show();
				Intent intent = new Intent(CardSetActivity.this,
						CardChoiceActivity.class);
				intent.putExtra(ImageAdapter.positionKey, position);
				startActivity(intent);
			}
		});
	}

}

/**
 * 
 */
package com.thalesgroup.tools.scrumplanningpoker;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

/**
 * @author gabriel
 * 
 */
public class ImageAdapter extends BaseAdapter {
	private final Context mContext;

	public ImageAdapter(Context c) {
		mContext = c;
	}

	@Override
	public int getCount() {
		return mThumbIds.length;
	}

	@Override
	public Object getItem(int position) {
		return null;
	}

	@Override
	public long getItemId(int position) {
		return 0;
	}

	// create a new ImageView for each item referenced by the Adapter
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		ImageView imageView;
		if (convertView == null) { // if it's not recycled, initialize some
									// attributes
			imageView = new ImageView(mContext);
			imageView.setLayoutParams(new GridView.LayoutParams(85, 85));
			imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
			imageView.setPadding(8, 8, 8, 8);
		} else {
			imageView = (ImageView) convertView;
		}

		imageView.setImageResource(mThumbIds[position]);
		return imageView;
	}

	// references to our images
	public static final Integer[] mThumbIds = { R.drawable.ic_cardwildcard,
			R.drawable.ic_cardzero, R.drawable.ic_cardhalf,
			R.drawable.ic_cardone, R.drawable.ic_cardtwo,
			R.drawable.ic_cardthree, R.drawable.ic_cardfive,
			R.drawable.ic_cardeight, R.drawable.ic_cardthirteen,
			R.drawable.ic_cardtwentyone, R.drawable.ic_cardthirtyfour,
			R.drawable.ic_cardfiftyfive, R.drawable.ic_cardeightynine,
			R.drawable.ic_cardcoffee };

	public static final String positionKey = "card_position";
}

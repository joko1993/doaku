package sak.lem.bar.lapdater;

import sak.lem.bar.R;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class DoaAdapterView extends LinearLayout {

	public DoaAdapterView(Context context, Adapter entry) {
		super(context);

		this.setOrientation(VERTICAL);
		this.setTag(entry);

		View v = inflate(context, R.layout.row, null);

		TextView noAyat = (TextView) v.findViewById(R.id.noAyat);
		noAyat.setText(entry.getAyatNo());
		
		ImageView imgAyat = (ImageView) v.findViewById(R.id.ayat);
		imgAyat.setImageResource(entry.getImageAyat());

		TextView terjemahan = (TextView) v.findViewById(R.id.terjemahan);
		terjemahan.setText(entry.getTerjemahan());

		addView(v);
	}

}

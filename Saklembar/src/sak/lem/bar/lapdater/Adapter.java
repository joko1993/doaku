package sak.lem.bar.lapdater;

import android.graphics.drawable.BitmapDrawable;

public class Adapter {
	private BitmapDrawable imageAyat;
	private String terjemahan;

	public Adapter(BitmapDrawable imageAyat, String terjemahan) {
		super();
		this.imageAyat = imageAyat;
		this.terjemahan = terjemahan;
	}

	public BitmapDrawable getImageAyat() {
		return imageAyat;
	}

	public void setImageAyat(BitmapDrawable imageAyat) {
		this.imageAyat = imageAyat;
	}

	public String getTerjemahan() {
		return terjemahan;
	}

	public void setTerjemahan(String terjemahan) {
		this.terjemahan = terjemahan;
	}

}

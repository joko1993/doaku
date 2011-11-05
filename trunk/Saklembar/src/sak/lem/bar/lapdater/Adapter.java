package sak.lem.bar.lapdater;

import android.graphics.drawable.BitmapDrawable;

public class Adapter {
	private int imageAyat;
	private int ayatNo;
	private String terjemahan;

	public Adapter(int imageAyat, int ayatNo, String terjemahan) {
		super();
		this.imageAyat = imageAyat;
		this.terjemahan = terjemahan;
		this.ayatNo = ayatNo;
	}

	public int getAyatNo() {
		return ayatNo;
	}

	public void setAyatNo(int ayatNo) {
		this.ayatNo = ayatNo;
	}

	public int getImageAyat() {
		return imageAyat;
	}

	public void setImageAyat(int imageAyat) {
		this.imageAyat = imageAyat;
	}

	public String getTerjemahan() {
		return terjemahan;
	}

	public void setTerjemahan(String terjemahan) {
		this.terjemahan = terjemahan;
	}

}

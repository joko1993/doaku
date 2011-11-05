package sak.lem.bar;

import java.util.ArrayList;
import java.util.List;

import sak.lem.bar.lapdater.Adapter;
import sak.lem.bar.lapdater.DoaAdapter;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.widget.ListView;

public class SaklembarActivity extends Activity {
	private ListView list;
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.main);
		list = (ListView) findViewById(R.id.doa);
		List<Adapter> adapters = new ArrayList<Adapter>();
		adapters.add(new Adapter(R.drawable.satu, 1, "Segala puji bagi Allah Yang membangunkan kami setelah ditidurkan-Nya dan kepada-Nya kami dibangkitkan"));
		adapters.add(new Adapter(R.drawable.dua, 2, "Tiada Tuhan selain Allah, Yang Maha Esa, tiada sekutu bagi-Nya. Bagi-Nya kerajaan dan pujian. Dia-lah Yang Maha Kuasa atas segala sesuatu. Maha suci Allah, segala puji bagi Allah, tiada Tuhan selain Allah, Allah Maha Besar, tiada daya dan kekuatan kecuali dengan pertolongan Allah yang Maha Tinggi dan Maha Agung. Ya Tuhanku, ampunilah dosaku"));
		adapters.add(new Adapter(R.drawable.tiga, 3, "Segala puji bagi Allah Yang telah memberikan kesehatan kepada-ku, mengembalikan ruh dan merestuiku untuk berdzikir kepada-Nya"));
		DoaAdapter adapter = new DoaAdapter(this, adapters);
		list.setChoiceMode(ListView.CHOICE_MODE_SINGLE);
		list.setAdapter(adapter);
	}
}
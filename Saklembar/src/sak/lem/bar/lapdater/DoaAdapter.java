package sak.lem.bar.lapdater;

import java.util.List;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

public class DoaAdapter extends BaseAdapter {
	private Context context;
	private List<Adapter> listAyat;

	public DoaAdapter(Context context, List<Adapter> listAyat) {
		this.context = context;
		this.listAyat = listAyat;
	}

	public int getCount() {
		return listAyat.size();
	}

	public Object getItem(int position) {
		return listAyat.get(position);
	}

	public long getItemId(int position) {
		return position;
	}

	public View getView(int position, View view, ViewGroup viewGroup) {
		Adapter entry = listAyat.get(position);
		DoaAdapterView adapterView = new DoaAdapterView(context, entry);
		return adapterView;
	}

}

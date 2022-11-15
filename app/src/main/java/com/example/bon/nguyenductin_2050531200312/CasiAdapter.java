package com.example.bon.nguyenductin_2050531200312;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class CasiAdapter extends BaseAdapter {
    private Context context;
    private int layout;
    private List<Casi> arrayList;

    public CasiAdapter(Context context, int layout, List<Casi> arrayList) {
        this.context = context;
        this.layout = layout;
        this.arrayList = arrayList;
    }


    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        view = inflater.inflate(layout, null);

        Casi csi = arrayList.get(i);

        TextView tvName = view.findViewById(R.id.tv_ten);
        TextView tv_nickname = view.findViewById(R.id.tv_nghedanh);
        TextView tv_ctryside = view.findViewById(R.id.tv_quocgia);
        ImageView imageV = view.findViewById(R.id.imageView);
        ImageView imageV1 = view.findViewById(R.id.img_sao);


        tvName.setText(csi.getTen());
        tv_nickname.setText(csi.getNghedanh());
        tv_ctryside.setText(csi.getQuocgia());
        imageV.setImageResource(csi.getHinhAnh1());
        imageV1.setImageResource(csi.getHinhanh2());

        return view;
    }
}

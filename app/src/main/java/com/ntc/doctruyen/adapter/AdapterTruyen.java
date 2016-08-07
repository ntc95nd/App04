package com.ntc.doctruyen.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.ntc.doctruyen.doctruyen.R;
import com.ntc.doctruyen.models.Truyen;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 07/08/2016.
 */
public class AdapterTruyen extends ArrayAdapter{
    private LayoutInflater inflater;
    private ArrayList<Truyen> arrTruyen;
    public AdapterTruyen(Context context, int resource, ArrayList objects) {
        super(context, resource, objects);
        arrTruyen = objects;
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = inflater.inflate(R.layout.item_truyen,parent,false);
        ImageView imgTruyen = (ImageView) convertView.findViewById(R.id.img_truyen);
        TextView txtTruyen = (TextView) convertView.findViewById(R.id.txt_ten_truyen);
        imgTruyen.setImageResource(arrTruyen.get(position).getIdAnh());
        txtTruyen.setText(arrTruyen.get(position).getTenTruyen());
        return convertView;
    }
}

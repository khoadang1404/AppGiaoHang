package com.example.view_appgiaohang.fragments;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.view_appgiaohang.R;

import org.w3c.dom.Text;

import java.util.List;

public class history_historyAdapter extends BaseAdapter {

    private Context context;
    private int layout;
    private List<history_history> history_list;

    public history_historyAdapter(Context context, int layout, List<history_history> history_list) {
        this.context = context;
        this.layout = layout;
        this.history_list = history_list;
    }

    @Override
    public int getCount() {
        return history_list.size();
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
        //ánh xạ View

//        TextView boba = (TextView) view.findViewById(R.id.boba);
//        TextView add = (TextView) view.findViewById(R.id.add);
//        TextView price = (TextView) view.findViewById(R.id.price);
//        TextView date = (TextView) view.findViewById(R.id.date);
//        ImageView image = (ImageView) view.findViewById(R.id.image);
//
//        //gán giá trị
//        history_history history = history_list.get(i);
//
//        boba.setText(history.getBoba());
//        add.setText(history.getAdd());
//        price.setText(history.getPrice());
//        date.setText(history.getDate());
//        image.setImageResource(history.getImage());


        return null;
    }
}

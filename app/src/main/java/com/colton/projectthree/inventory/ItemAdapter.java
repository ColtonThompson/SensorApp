package com.colton.projectthree.inventory;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.colton.projectthree.R;

public class ItemAdapter extends BaseAdapter {

    private final Item[] items;
    private final Context mContext;

    public ItemAdapter(Context context, Item[] myItems) {
        this.mContext = context;
        this.items = myItems;
    }

    @Override
    public int getCount() {
        return items.length;
    }

    @Override
    public Object getItem(int position) {
        if (items[position] == null) {
            return null;
        }
        return items[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final Item item = items[position];
        if (convertView == null) {
            System.out.println("convert view is null");
            final LayoutInflater li = LayoutInflater.from(mContext);
            convertView = li.inflate(R.layout.layout_item, null);
        }

//        TextView txtView = new TextView(mContext);
//        txtView.setText(String.valueOf(position));

//
//        final TextView itemNameView = (TextView) convertView.findViewById(R.id.itemNameTextView);
//        final TextView itemAmountView = (TextView) convertView.findViewById(R.id.itemStockAmountTextView);

        //itemNameView.setText(item.getName());
        //itemAmountView.setText(0);

        return convertView;
    }
}

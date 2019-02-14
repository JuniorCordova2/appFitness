package com.example.cabina10.latinoapp.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.example.cabina10.latinoapp.R;
import com.example.cabina10.latinoapp.models.Document;
import java.util.List;

public class DocumentAdapter extends ArrayAdapter<Document> {

    Context context;


private class ViewHolder {
    //NetworkImageView image;
    TextView name;
    TextView description;
    TextView date;

    private ViewHolder() {
    }
}

    public DocumentAdapter(Context context, int resourceId, List<Document> items) {
        super(context, resourceId, items);
        this.context = context;

    }

    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        Document rowItem = (Document) getItem(position);
        LayoutInflater mInflater = (LayoutInflater) this.context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        if (convertView == null) {
            convertView = mInflater.inflate(R.layout.list_item_document, null);
            holder = new ViewHolder();
            holder.name = (TextView) convertView.findViewById(R.id.name);
            holder.description = (TextView) convertView.findViewById(R.id.description);
            holder.date = (TextView) convertView.findViewById(R.id.date);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        holder.name.setText(rowItem.getNombre());
        holder.description.setText(rowItem.getDescripcion());
        holder.date.setText(rowItem.getFechaText());
        return convertView;
    }
}
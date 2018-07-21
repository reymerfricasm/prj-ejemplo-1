package com.ebank.customadapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class UserAdapter extends ArrayAdapter<User> {

    public UserAdapter(Context context, List<User> objects){
        super(context, 0, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        User user = getItem(position);
        if(convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.activity_user_item, parent, false);
        }
        TextView textView = convertView.findViewById(R.id.textName);
        TextView textView1 = convertView.findViewById(R.id.textAddress);
        textView.setText(user.getName());
        textView1.setText(user.getAddress());

        return convertView;
    }
}

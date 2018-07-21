package com.ebank.customadapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = findViewById(R.id.listView);

        final List<User> items = new ArrayList<>();

        items.add(new User("1 - Reymer Fricas", "C/ Los Cerros"));
        items.add(new User("2 - Reymer Fricas", "C/ Los Cerros"));
        items.add(new User("3 - Reymer Fricas", "C/ Los Cerros"));
        items.add(new User("4 - Reymer Fricas", "C/ Los Cerros"));
        items.add(new User("5 - Reymer Fricas", "C/ Los Cerros"));
        items.add(new User("6 - Reymer Fricas", "C/ Los Cerros"));
        items.add(new User("7 - Reymer Fricas", "C/ Los Cerros"));
        items.add(new User("8 - Reymer Fricas", "C/ Los Cerros"));
        items.add(new User("9 - Reymer Fricas", "C/ Los Cerros"));
        items.add(new User("10 - Reymer Fricas", "C/ Los Cerros"));
        items.add(new User("11 - Reymer Fricas", "C/ Los Cerros"));
        items.add(new User("12 - Reymer Fricas", "C/ Los Cerros"));

        UserAdapter adapter = new UserAdapter(this, items);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this, "Item clicked -> " + items.get(i).getName() , Toast.LENGTH_SHORT ).show();
            }
        });
    }
}

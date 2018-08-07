package com.example.android.musico;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;

import static android.R.attr.name;
import static android.R.id.list;
import static com.example.android.musico.R.id.search;

public class Artist extends AppCompatActivity {
    String [] items;
    ArrayList<String> listitems;
    ArrayAdapter<String> adapter;
    ListView listView;
    EditText editText;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artist);

        listView=(ListView)findViewById(R.id.listview);
        editText=(EditText)findViewById(R.id.txt_search);
        initList();
        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                if(charSequence.toString().equals("")){
                    //reset
                    initList();
                }

                else {
                    searchItem(charSequence.toString());
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
    }

    public void searchItem(String textToSearch){
        for (String item:items){
            if(!item.contains(textToSearch)){
                listitems.remove(item);
            }
        }
        adapter.notifyDataSetChanged();
    }

    public void initList(){
        items=new String[]{"Pitbull","Taylor Swift","Lana Del Rey","Chris Brown","Akon","Ed Sheeran","Sia"};
        listitems=new ArrayList<>(Arrays.asList(items));
        adapter=new ArrayAdapter<String>(this,R.layout.list_item,R.id.textitem,listitems);
        listView.setAdapter(adapter);

    }

}

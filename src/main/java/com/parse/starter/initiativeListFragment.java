package com.parse.starter;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.parse.ParseQuery;
import com.parse.ParseObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Adam on 10/3/2015.
 */
public class initiativeListFragment extends ListFragment {
    @Override
    public View onCreateView(LayoutInflater inflater, final ViewGroup parent, Bundle savedInstanceState){
        View v = inflater.inflate(R.layout.initiative_list_fragment, parent, false);
        ParseQueryAdapter<ParseObject> adapter = new ParseQuery<>()
        initiativeListAdapter = new ParseQueryAdapter<ParseObject>(this, "initiativeItem");

        return v;
    }
}

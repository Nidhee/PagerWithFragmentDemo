package com.nidhigondhia.demo;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Nidhi Gondhia on 20/09/2017.
 */

public class Fragment1 extends Fragment {

    public  Fragment1(){}

    String stringValue;

    // static method to create the Fragment1 frag containing string
    public  static Fragment1 newInstance(String str)
    {
        Fragment1 slider=new Fragment1();
        Bundle b=new Bundle();
        b.putString("stringValue", str);
        slider.setArguments(b);
        return slider;
    }


    TextView textView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment1, container, false);
        textView = (TextView) view.findViewById(R.id.textView);
        return view;
    }

    // you will get data in this method where you can set value to your views
    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        stringValue = getArguments().getString("stringValue");
        textView.setText(stringValue);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }
}

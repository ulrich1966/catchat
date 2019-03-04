package de.auli.catchat.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import de.auli.catchat.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class SendItemsFrg extends Fragment {


    public SendItemsFrg() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_send_items_frg, container, false);
    }

}

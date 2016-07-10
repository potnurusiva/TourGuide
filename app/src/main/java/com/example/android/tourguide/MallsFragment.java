package com.example.android.tourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class MallsFragment extends Fragment {


    public MallsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word(R.string.phoenix_mall, R.string.phoenix_address));
        words.add(new Word(R.string.forum_mall, R.string.forum_address));
        words.add(new Word(R.string.central_mall, R.string.central_address));
        words.add(new Word(R.string.pvr_mall, R.string.pvr_address));
        words.add(new Word(R.string.inorbit_mall, R.string.inorbit_address));
        words.add(new Word(R.string.garuda_mall, R.string.garuda_address));
        words.add(new Word(R.string.orion_mall, R.string.orion_address));
        words.add(new Word(R.string.gopalan_mall, R.string.gopalan_address));
        words.add(new Word(R.string.ascendas_mall, R.string.ascendas_address));

        //Using custom ArrayAdapter
        WordAdapter adapter = new WordAdapter(getActivity(), words, R.color.category_malls);

        //getting the listView from word_list.xml
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        return rootView;
    }
}

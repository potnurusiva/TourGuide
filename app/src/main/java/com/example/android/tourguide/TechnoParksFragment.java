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
public class TechnoParksFragment extends Fragment {


    public TechnoParksFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word(R.string.bagmane_tech_park, R.string.bagmane_address));
        words.add(new Word(R.string.itpl_tech_park, R.string.itpl_address));
        words.add(new Word(R.string.ecospace_tech_park, R.string.ecospace_address));
        words.add(new Word(R.string.manyata_tech_park, R.string.manyata_address));
        words.add(new Word(R.string.electronic_tech_park, R.string.electronic_address));
        words.add(new Word(R.string.cessna_tech_park, R.string.cessna_address));
        words.add(new Word(R.string.rmz_tech_park, R.string.rmz_address));
        words.add(new Word(R.string.embassy_tech_park, R.string.embassy_address));

        WordAdapter adapter = new WordAdapter(getActivity(), words, R.color.category_techno_parks);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        return rootView;
    }
}

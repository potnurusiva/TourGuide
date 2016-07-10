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
public class RestaurantsFragment extends Fragment {

    public RestaurantsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word(R.string.toit_restaurant,R.string.toit_address));
        words.add(new Word(R.string.chianti_restaurant,R.string.chianti_address));
        words.add(new Word(R.string.fisherman_restaurant,R.string.fisherman_address));
        words.add(new Word(R.string.karavalli_restaurant,R.string.karavalli_address));
        words.add(new Word(R.string.punjab_grill_restaurant,R.string.punjab_grill_address));
        words.add(new Word(R.string.samarkand_restaurant,R.string.samarkand_address));
        words.add(new Word(R.string.meghana_restaurant,R.string.meghana_address));
        words.add(new Word(R.string.absolute_restaurant,R.string.absolute_address));

        WordAdapter adapter = new WordAdapter(getActivity(), words, R.color.category_restaurants);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        return rootView;
    }
}

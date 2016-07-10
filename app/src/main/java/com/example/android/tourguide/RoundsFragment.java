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
public class RoundsFragment extends Fragment {


    public RoundsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word(R.string.isckon_temple, R.string.isckon_address, R.drawable.isckon_temple));
        words.add(new Word(R.string.cubbon_park, R.string.cubbon_address, R.drawable.cubbon_park));
        words.add(new Word(R.string.lal_bagh, R.string.lal_bagh_address, R.drawable.lal_bagh));
        words.add(new Word(R.string.visvesvaraya_museum, R.string.visvesvaraya_address, R.drawable.viswesarayya_museum));
        words.add(new Word(R.string.vidhanasoudha, R.string.vidhanasoudha_address, R.drawable.vidhana_soudha));
        words.add(new Word(R.string.tippu_palace, R.string.tippu_palace_address, R.drawable.tippus_palace));
        words.add(new Word(R.string.shiva_temple, R.string.shiva_temple_address, R.drawable.shiva_temple));

        WordAdapter adapter = new WordAdapter(getActivity(), words, R.color.category_rounds);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        return rootView;
    }
}

package com.davebyrne.ironsight.activity;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.davebyrne.ironsight.R;
import com.davebyrne.ironsight.adapter.GamesAdapter;

import java.util.ArrayList;
import java.util.List;

import static android.R.id.list;


public class MainListFragment extends Fragment {

    private List<Game> gameList = new ArrayList<>();
    private RecyclerView recyclerView;
    private GamesAdapter mAdapter;

    public MainListFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_mainlist, container, false);


        // Inflate the layout for this fragment
        recyclerView = (RecyclerView) rootView.findViewById(R.id.recyclerView);

        mAdapter = new GamesAdapter(gameList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getActivity().getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.addItemDecoration(new DividerItemDecoration(getActivity(), LinearLayoutManager.VERTICAL));
        recyclerView.setAdapter(mAdapter);

        //this is for clicking the list entries
        recyclerView.addOnItemTouchListener(new RecyclerTouchListener(getActivity().getApplicationContext(), recyclerView, new RecyclerTouchListener.ClickListener() {
            @Override
            public void onClick(View view, int position) {
                Game game = gameList.get(position);
                Toast.makeText(getActivity().getApplicationContext(), game.getTitle() + " is selected!", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onLongClick(View view, int position) {

            }
        }));

        prepareGameData();
        return rootView;
    }
    private void prepareGameData() {
        Game game = new Game("Super Mario Run", "Platformer", "18/11/2016");
        gameList.add(game);

        game = new Game("Stardew Valley", "Strategy", "19/12/2016");
        gameList.add(game);

        game = new Game("Dead Rising", "Survival", "20/12/2016");
        gameList.add(game);

        game = new Game("The Last Guardian", "Adventure", "20/12/2016");
        gameList.add(game);

        game = new Game("Steep", "Sports", "21/12/2016");
        gameList.add(game);

        game = new Game("Final Fantasy 15", "RPG", "22/12/2016");
        gameList.add(game);

        game = new Game("Pokemon Sun/Moon", "RPG", "23/12/2016");
        gameList.add(game);

        game = new Game("Dishonored 2", "FPS", "24/12/2016");
        gameList.add(game);

        game = new Game("Tyranny", "RPG", "25/12/2016");
        gameList.add(game);

        game = new Game("Owlboy", "Platformer", "26/12/2016");
        gameList.add(game);

        game = new Game("Civilization 6", "Strategy", "27/12/2016");
        gameList.add(game);

        game = new Game("TitanFall 2", "Animation", "28/12/2016");
        gameList.add(game);

        game = new Game("Root Letter", "Indie", "29/11/2016");
        gameList.add(game);

        game = new Game("Watch Dogs 2", "Action", "30/12/2016");
        gameList.add(game);

        game = new Game("Minimal", "Adventure", "30/12/2016");
        gameList.add(game);

        game = new Game("Total War", "Strategy", "31/12/2016");
        gameList.add(game);

        mAdapter.notifyDataSetChanged();
    }
    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }
}
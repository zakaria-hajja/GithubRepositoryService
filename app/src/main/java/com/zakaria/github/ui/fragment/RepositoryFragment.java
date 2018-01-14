package com.zakaria.github.ui.fragment;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.zakaria.github.R;
import com.zakaria.github.databinding.FragmentRepositoryBinding;
import com.zakaria.github.model.Owner;
import com.zakaria.github.model.Repository;
import com.zakaria.github.ui.adapter.ListRepositoryAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Zakaria on 14/01/2018.
 */

public class RepositoryFragment extends Fragment{
    FragmentRepositoryBinding binding;
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        binding= DataBindingUtil.bind(getView());

        List<Repository> repositories = new ArrayList<>();
        binding.recycler.setAdapter(new ListRepositoryAdapter(this.getActivity(),repositories));
        binding.recycler.setHasFixedSize(true);
        binding.recycler.setLayoutManager(new LinearLayoutManager(getContext()));
    }

    public static RepositoryFragment newInstance(){
        return new RepositoryFragment();
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_repository, container, false);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }
}

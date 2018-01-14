package com.zakaria.github.ui.fragment;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.zakaria.github.R;
import com.zakaria.github.databinding.FragmentRepositoryBinding;
import com.zakaria.github.model.Owner;
import com.zakaria.github.model.Repository;
import com.zakaria.github.ui.activity.RepositoryActivity;
import com.zakaria.github.ui.adapter.EndlessRecyclerViewScrollListener;
import com.zakaria.github.ui.adapter.ListRepositoryAdapter;
import com.zakaria.github.viewmodel.RepositoryViewModel;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import rx.Observer;
import rx.functions.Action1;

/**
 * Created by Zakaria on 14/01/2018.
 */

public class RepositoryFragment extends Fragment{
    @Inject
    RepositoryViewModel viewModel;
    LinearLayoutManager linearLayoutManager;
    EndlessRecyclerViewScrollListener scrollListener;
    ListRepositoryAdapter adapter;
    FragmentRepositoryBinding binding;
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        binding = DataBindingUtil.bind(getView());
        ((RepositoryActivity) getActivity()).getActivityComponent().plusFragmentComponent().inject(this);

        viewModel.getRepositories(1)
                .subscribe(new Observer<List<Repository>>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {
                        binding.emptyMessage.setVisibility(View.VISIBLE);
                    }

                    @Override
                    public void onNext(List<Repository> repositories) {
                        Log.e("LISTSIZE",repositories.size()+"");
                        if (repositories.size() == 0)
                            binding.emptyMessage.setVisibility(View.VISIBLE);
                        adapter=new ListRepositoryAdapter(getActivity(), repositories);
                        binding.recycler.setAdapter(adapter);
                    }
                });


        linearLayoutManager = new LinearLayoutManager(getContext());
        binding.recycler.setHasFixedSize(true);
        binding.recycler.setLayoutManager(linearLayoutManager);
        binding.recycler.addOnScrollListener(new EndlessRecyclerViewScrollListener(linearLayoutManager) {
            @Override
            public void onLoadMore(int page, int totalItemsCount, RecyclerView view) {
                loadNextPage(page);
            }
        });
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

    public void loadNextPage(int page) {
        this.viewModel.getRepositories(page)
                .subscribe(new Observer<List<Repository>>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onNext(List<Repository> repositories) {
                        adapter.getRepositories().addAll(repositories);
                        adapter.notifyDataSetChanged();
                    }
                });

    }
}

package com.zakaria.github.ui.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.zakaria.github.databinding.RepositoryListItemBinding;
import com.zakaria.github.model.Repository;

import java.util.List;

/**
 * Created by Zakaria on 14/01/2018.
 */

public class ListRepositoryAdapter extends RecyclerView.Adapter<ListRepositoryAdapter.ListRepositoryViewHolder> {

    private final Context context;
    private final List<Repository> repositories;

    public ListRepositoryAdapter(Context context, List<Repository> repositories) {
        this.context = context;
        this.repositories = repositories;
    }

    public List<Repository> getRepositories() {
        return repositories;
    }

    public class ListRepositoryViewHolder extends RecyclerView.ViewHolder{
        private final RepositoryListItemBinding binding;

        public ListRepositoryViewHolder(RepositoryListItemBinding binding) {
            super(binding.getRoot());
        this.binding = binding;
        }
        public void bind(Repository repository) {
            binding.setRepository(repository);
        }

    }
    @Override
    public ListRepositoryAdapter.ListRepositoryViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ListRepositoryViewHolder(RepositoryListItemBinding.inflate(LayoutInflater.from(context),parent,false));
    }

    @Override
    public void onBindViewHolder(ListRepositoryAdapter.ListRepositoryViewHolder holder, int position) {
        holder.bind(repositories.get(position));
    }

    @Override
    public int getItemCount() {
        return repositories.size();
    }
}

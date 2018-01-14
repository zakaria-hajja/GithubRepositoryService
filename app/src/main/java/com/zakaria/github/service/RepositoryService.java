package com.zakaria.github.service;

import com.zakaria.github.model.Repository;

import java.util.List;

import rx.Observable;

/**
 * Created by Zakaria on 14/01/2018.
 */

public interface RepositoryService {

    Observable<List<Repository>> getRepositories(int page);
}

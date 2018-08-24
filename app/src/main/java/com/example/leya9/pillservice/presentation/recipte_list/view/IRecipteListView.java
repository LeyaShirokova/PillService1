package com.example.leya9.pillservice.presentation.recipte_list.view;

import com.example.leya9.pillservice.presentation.viewmodels.RecipteRowModel;

import java.util.List;

public interface IRecipteListView {
    void showProgress();
    void hideProgress();
    void showNextView();
    void showError(String error);
    void showEmptyList();
    void updateList(List<RecipteRowModel> list);
}

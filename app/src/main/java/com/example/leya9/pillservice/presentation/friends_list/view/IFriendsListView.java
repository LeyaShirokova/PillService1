package com.example.leya9.pillservice.presentation.friends_list.view;

import com.example.leya9.pillservice.presentation.viewmodels.FriendsRowModel;

import java.util.List;

public interface IFriendsListView {
    void showProgress();
    void hideProgress();
    void showNextView();
    void showError(String error);
    void showEmptyList();
    void updateList(List<FriendsRowModel> listFriend);

}

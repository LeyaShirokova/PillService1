package com.example.leya9.pillservice.presentation.order_list.view;

import com.example.leya9.pillservice.presentation.viewmodels.MedicamentRowModel;

import java.util.List;

public interface IOrderListView {
    void showProgress();
    void hideProgress();
    void showNextView();
    void showError(String error);
    void showEmptyList();
    void updateList(List<MedicamentRowModel> listMedicament);
}

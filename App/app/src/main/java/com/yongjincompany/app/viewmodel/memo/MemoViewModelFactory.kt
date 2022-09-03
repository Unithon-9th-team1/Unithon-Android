package com.yongjincompany.app.viewmodel.memo

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.yongjincompany.app.repository.MemoRepository


class MemoViewModelFactory(private val memoRepository: MemoRepository) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return MemoViewModel(memoRepository) as T
    }
}
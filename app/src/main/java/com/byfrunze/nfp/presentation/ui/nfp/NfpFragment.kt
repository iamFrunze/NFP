package com.byfrunze.nfp.presentation.ui.nfp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.lifecycle.ViewModelProvider
import com.byfrunze.nfp.R
import com.byfrunze.nfp.presentation.helpers.injectViewModel
import dagger.android.AndroidInjection
import dagger.android.support.AndroidSupportInjection
import javax.inject.Inject

class NfpFragment : Fragment(R.layout.fragment_nfp) {

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory
   lateinit var nfpViewModel: NfpViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidSupportInjection.inject(this)
        super.onCreate(savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        nfpViewModel = injectViewModel(viewModelFactory)
    }
}
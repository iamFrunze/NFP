package com.byfrunze.nfp.presentation.ui.vt

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.byfrunze.nfp.R
import com.byfrunze.nfp.presentation.helpers.injectViewModel
import dagger.android.support.AndroidSupportInjection
import javax.inject.Inject

class VtFragment : Fragment(R.layout.fragment_vt) {

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory
    lateinit var vtViewModel: VtViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidSupportInjection.inject(this)
        super.onCreate(savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        vtViewModel = injectViewModel(viewModelFactory)
    }

}
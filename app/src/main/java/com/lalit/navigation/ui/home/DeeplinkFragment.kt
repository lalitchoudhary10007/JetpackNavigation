package com.lalit.navigation.ui.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.lalit.navigation.R

class DeeplinkFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_deeplink, container, false)
    }

    companion object {
        @JvmStatic
        fun newInstance() =
            DeeplinkFragment()
    }
}
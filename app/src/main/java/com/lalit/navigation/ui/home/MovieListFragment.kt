package com.lalit.navigation.ui.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.lalit.navigation.R
import kotlinx.android.synthetic.main.fragment_movie_list.*

private const val ARG_PARAM1 = "param1"

class MovieListFragment : Fragment() {
    private var param1: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_movie_list, container, false)
    }

    companion object {
        @JvmStatic
        fun newInstance(param1: String) =
            MovieListFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                }
            }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        movielist_go_to_details_btn.setOnClickListener {
            findNavController().navigate(MovieListFragmentDirections.actionMovieListFragmentToMovieDetailsFragment())
        }
    }

}
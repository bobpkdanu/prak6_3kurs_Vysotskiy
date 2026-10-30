package com.bignerdranch.android.prak6_3kurs_vysotskiy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment

class HomeFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.home_fragment,container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.searchButton).setOnClickListener{
            parentFragmentManager.beginTransaction().replace(R.id.FragmentContainer, SearchFragment()).addToBackStack(null).commit()
        }

        view.findViewById<Button>(R.id.popularButton).setOnClickListener{
            val fragment = SearchFragment()
            val bundle = Bundle()
        }
    }

    val apikey = "http://www.omdbapi.com/?apikey=[5dca8348]&"
}
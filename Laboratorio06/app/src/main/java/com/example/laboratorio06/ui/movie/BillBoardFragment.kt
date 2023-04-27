package com.example.laboratorio06.ui.movie


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.cardview.widget.CardView
import androidx.navigation.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.laboratorio06.R
import com.example.laboratorio06.data.adapter.MovieAdapter
import com.example.laboratorio06.data.model.movies
import com.example.laboratorio06.repositories.MovieRepository
import com.google.android.material.floatingactionbutton.FloatingActionButton

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
//private const val ARG_PARAM1 = "param1"
//private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [BillBoardFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class BillBoardFragment : Fragment() {
    // TODO: Rename and change types of parameters
    //private var param1: String? = null
    //private var param2: String? = null


    private lateinit var buttonFragmentNewMovie: FloatingActionButton
    private lateinit var recyclerViewMovies: RecyclerView
    //private lateinit var cardViewFragmentStarWars: CardView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //arguments?.let {
        //param1 = it.getString(ARG_PARAM1)
        //param2 = it.getString(ARG_PARAM2)
        //}
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_bill_board, container, false)
    }
}



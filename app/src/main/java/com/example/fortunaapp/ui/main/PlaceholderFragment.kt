package com.example.fortunaapp.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.fortunaapp.R

/**
 * A placeholder fragment containing a simple view.
 */
class PlaceholderFragment : Fragment() {

    private lateinit var pageViewModel: PageViewModel

    private var p1SpaceCount: Int = 5
    private val maxP1SpaceCount: Int = 5

    private var p2SpaceCount: Int = 5
    private val maxP2SpaceCount: Int = 5


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        pageViewModel = ViewModelProviders.of(this).get(PageViewModel::class.java).apply {
            setIndex(arguments?.getInt(ARG_SECTION_NUMBER) ?: 1)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Get All View Reference
        val root = inflater.inflate(R.layout.fragment_main, container, false)
        val p1TextView: TextView = root.run { findViewById(R.id.p1_space_count) }
        val p2TextView: TextView = root.findViewById(R.id.p2_space_count)

        val p1Button: Button = root.findViewById(R.id.p1Button)
        val p2Button: Button = root.findViewById(R.id.p2Button)

        // Initial Displays
        p1TextView.text = p1SpaceCount.toString() + "/" + maxP1SpaceCount.toString()
        p2TextView.text = p2SpaceCount.toString() + "/" + maxP2SpaceCount.toString()


        // Button click listeners

        p1Button.setOnClickListener {
            if (p1SpaceCount > 0) {
                p1SpaceCount = p1SpaceCount - 1
            }

            p1TextView.text = p1SpaceCount.toString() + "/" + maxP1SpaceCount.toString()


        }

        p2Button.setOnClickListener {
            if (p2SpaceCount > 0) {
                p2SpaceCount = p2SpaceCount - 1
            }

            p2TextView.text = p2SpaceCount.toString() + "/" + maxP2SpaceCount.toString()
        }


        return root
    }

    companion object {
        /**
         * The fragment argument representing the section number for this
         * fragment.
         */
        private const val ARG_SECTION_NUMBER = "section_number"

        /**
         * Returns a new instance of this fragment for the given section
         * number.
         */
        @JvmStatic
        fun newInstance(sectionNumber: Int): PlaceholderFragment {
            return PlaceholderFragment().apply {
                arguments = Bundle().apply {
                    putInt(ARG_SECTION_NUMBER, sectionNumber)
                }
            }
        }
    }
}
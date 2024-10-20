package com.bignerdranch.android.navigation2024_lezhen

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.NavHostFragment

class Fragment1 : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val fragmentLayout = inflater.inflate(R.layout.fragment_1, container, false)

        val navController = NavHostFragment.findNavController(this)

        fragmentLayout.findViewById<Button>(R.id.button2).setOnClickListener{
            navController.navigate(R.id.fragment2)
        }
        fragmentLayout.findViewById<Button>(R.id.button3).setOnClickListener{
            navController.navigate(R.id.fragment3)
        }
        fragmentLayout.findViewById<Button>(R.id.button4).setOnClickListener{
            navController.navigate(R.id.fragment4)
        }
        return fragmentLayout
    }
}
package com.bignerdranch.android.navigation2024_lezhen

import android.os.Bundle
import android.support.design.widget.NavigationView
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.ui.setupWithNavController

class Fragment3 : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val bottomBar = view?.findViewById<NavigationView>(R.id.bottom_nav_view)
        bottomBar?.setupWithNavController(navController)
        fragmentLayout.bottom_nav_view.setOnNavigationItemSelectedListener{
            navController.navigate(item.itemId)
            return@setOnNavigationItemSelectedListener true
        }
        return TODO("Provide the return value")
    }
}
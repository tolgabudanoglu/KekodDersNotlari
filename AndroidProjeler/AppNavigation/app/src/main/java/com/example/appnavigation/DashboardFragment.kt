package com.example.appnavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController


class DashboardFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_dashboard, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //route
        val btnOpenProfile = view.findViewById<Button>(R.id.btnOpenProfile) // fragmentte findViewbyId yok
        btnOpenProfile.setOnClickListener {
            findNavController().navigate(R.id.action_dashboardFragment_to_profileFragment)
        }

        val btnOpenSettings = view.findViewById<Button>(R.id.btnOpenSettings) // fragmentte findViewbyId yok
        btnOpenProfile.setOnClickListener {
            findNavController().navigate(R.id.action_dashboardFragment_to_settingsDialogFragment)
        }

        val btnOpenSecondActivity = view.findViewById<Button>(R.id.btnOpenSecondActivity) // fragmentte findViewbyId yok
        btnOpenProfile.setOnClickListener {
            findNavController().navigate(R.id.action_dashboardFragment_to_secondActivity)
        }
    }


}
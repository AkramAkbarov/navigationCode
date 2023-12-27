package com.nexis.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.nexis.myapplication.databinding.FragmentMenuBinding


class MenuFragment : Fragment() {


    lateinit var binding:FragmentMenuBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }
    fun openProductPage(){

        //val action= MenuFragmentDirections.actionMenuToProduct(userid = "123", product = 123)
        //findNavController().navigate(action)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMenuBinding.inflate(inflater)

        binding.productButton.setOnClickListener {
            openProductPage()
        }

        return binding.root
    }
}
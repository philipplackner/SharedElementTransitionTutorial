package com.plcoding.sharedelementtransitiontutorial

import android.os.Bundle
import android.transition.TransitionInflater
import androidx.fragment.app.Fragment

class ImageFragment : Fragment(R.layout.fragment_image) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val animation = TransitionInflater.from(requireContext()).inflateTransition(
            android.R.transition.move
        )
        sharedElementEnterTransition = animation
        sharedElementReturnTransition = animation
    }
}
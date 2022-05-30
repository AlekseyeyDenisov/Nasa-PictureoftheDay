package ru.dw.astronomypictureoftheday.ui.details

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import ru.dw.astronomypictureoftheday.R
import ru.dw.astronomypictureoftheday.databinding.FragmentDetailsBinding


private const val ARG_PARAM1 = "param1"

class DetailsFragment : Fragment() {
    private var param1: String? = null
    private var _binding:FragmentDetailsBinding? = null
    private val binding get() = _binding!!


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentDetailsBinding.inflate(inflater,container,false)
        return binding.root
    }


    companion object {
        @JvmStatic
        //fun newInstance(param1: String) =
        fun newInstance() =
            DetailsFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                }
            }
    }
}
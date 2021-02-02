package com.ex2.feedapp.presenter

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.ex2.feedapp.viewmodel.FeedViewModel
import com.ex2.feedapp.viewmodel.demo.DemoFeedViewModel
import com.ex2.feedapp.viewmodel.demo.DemoFeedViewModel_Factory
import com.ex2.weather.R
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class FeedListFragment : Fragment() {


    @Inject
    lateinit var factory: DemoFeedViewModel.Factory

    private val viewModel: FeedViewModel by viewModels<DemoFeedViewModel> { factory }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_feeds, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel.fetchFeeds()
        observeViewModel()
    }

    private fun observeViewModel() {
        viewModel.eventLiveData.observe(viewLifecycleOwner) {

            when (it) {
                is FeedViewModel.Events.Progress -> {
                    requireView().findViewById<View>(R.id.progressBar)
                        .visibility = if (it.show) View.VISIBLE else View.GONE
                }

                is FeedViewModel.Events.Success -> {

                }

                else -> {

                }
            }
        }
    }


}
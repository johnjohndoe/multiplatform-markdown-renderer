package com.mikepenz.markdown

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.annotation.IdRes
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.commit
import androidx.fragment.compose.content
import com.mikepenz.markdown.m3.Markdown

class TabletDetailsFragment : Fragment() {

    companion object {
        private const val FRAGMENT_TAG = "tablet_details"

        fun replace(fragmentManager: FragmentManager, @IdRes containerViewId: Int) {
            fragmentManager.commit {
                replace(containerViewId, TabletDetailsFragment(), FRAGMENT_TAG)
            }
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ) = content {
        Screen()
    }
}

@Composable
private fun Screen() {
    Box(
        Modifier
            .verticalScroll(rememberScrollState())
    ) {
//        Text(loremIpsum)
        Markdown(loremIpsum)
    }
}


private const val loremIpsum = """
Lorem ipsum odor amet, consectetuer adipiscing elit. Aliquam egestas himenaeos curae aliquam in integer morbi. Netus torquent pellentesque molestie sem fermentum vulputate, felis curae volutpat. Potenti neque maecenas cras; maximus viverra cras. Tortor sodales cubilia himenaeos himenaeos, ac sit tristique. Facilisi tellus odio tempor ultricies ac molestie. Aliquam iaculis nibh facilisis ipsum mattis id dapibus maecenas. Tempor turpis efficitur tristique aenean efficitur magna. Sapien dictum vivamus feugiat amet sapien phasellus eu.

Mus dictum ad nostra nisl primis. Finibus eros magna elit aenean dignissim. Dui mi porta ad per litora. Libero taciti sapien ac nibh varius platea nec eget. Consectetur auctor integer bibendum varius et vivamus turpis auctor tincidunt. Tempus rhoncus ipsum euismod venenatis aliquam gravida ex urna mus.

Dignissim taciti erat sollicitudin duis suscipit. Parturient finibus sapien porttitor aenean sociosqu. Lobortis posuere ex adipiscing nullam netus libero semper. Lobortis netus diam nullam iaculis mollis. Et ad natoque habitant metus integer mus. Posuere cras tortor vivamus; conubia nam quisque. Senectus dolor dapibus odio venenatis potenti eu fusce imperdiet. Habitant porta tempor urna malesuada sem magna scelerisque primis vel.

Mus dictum ad nostra nisl primis. Finibus eros magna elit aenean dignissim. Dui mi porta ad per litora. Libero taciti sapien ac nibh varius platea nec eget. Consectetur auctor integer bibendum varius et vivamus turpis auctor tincidunt. Tempus rhoncus ipsum euismod venenatis aliquam gravida ex urna mus.

Dignissim taciti erat sollicitudin duis suscipit. Parturient finibus sapien porttitor aenean sociosqu. Lobortis posuere ex adipiscing nullam netus libero semper. Lobortis netus diam nullam iaculis mollis. Et ad natoque habitant metus integer mus. Posuere cras tortor vivamus; conubia nam quisque. Senectus dolor dapibus odio venenatis potenti eu fusce imperdiet. Habitant porta tempor urna malesuada sem magna scelerisque primis vel.
Dignissim taciti erat sollicitudin duis suscipit. Parturient finibus sapien porttitor aenean sociosqu. Lobortis posuere ex adipiscing nullam netus libero semper. Lobortis netus diam nullam iaculis mollis. Et ad natoque habitant metus integer mus. Posuere cras tortor vivamus; conubia nam quisque. Senectus dolor dapibus odio venenatis potenti eu fusce imperdiet. Habitant porta tempor urna malesuada sem magna scelerisque primis vel.

Mus dictum ad nostra nisl primis. Finibus eros magna elit aenean dignissim. Dui mi porta ad per litora. Libero taciti sapien ac nibh varius platea nec eget. Consectetur auctor integer bibendum varius et vivamus turpis auctor tincidunt. Tempus rhoncus ipsum euismod venenatis aliquam gravida ex urna mus.

Dignissim taciti erat sollicitudin duis suscipit. Parturient finibus sapien porttitor aenean sociosqu. Lobortis posuere ex adipiscing nullam netus libero semper. Lobortis netus diam nullam iaculis mollis. Et ad natoque habitant metus integer mus. Posuere cras tortor vivamus; conubia nam quisque. Senectus dolor dapibus odio venenatis potenti eu fusce imperdiet. Habitant porta tempor urna malesuada sem magna scelerisque primis vel.

Quis aenean sodales mus pulvinar conubia primis aenean fames sed. Augue penatibus lacinia urna eget ligula. Sociosqu leo mus accumsan enim magnis tortor vehicula. Accumsan donec metus metus vehicula at. Luctus proin euismod integer praesent ex sociosqu. Ligula praesent quis lorem tempor sociosqu? Anec vivamus ad facilisis iaculis potenti tempus dictumst rutrum. Eleifend integer odio urna montes in laoreet. Viverra ac mauris cursus nunc senectus est.

Aptent vel sagittis platea himenaeos mus et nam. Elit mollis volutpat porttitor mus etiam mi venenatis magnis. Metus parturient metus natoque litora accumsan nostra litora quis. Suscipit maximus consequat interdum dapibus suscipit hac rhoncus. Ornare platea cras; eros fusce efficitur potenti imperdiet est? Faucibus integer leo vel cubilia cubilia finibus dis senectus. Nec cras conubia curae vulputate consectetur convallis arcu. Nibh curabitur metus ipsum tempus est cras bibendum quam. Vehicula cubilia per nostra hendrerit, feugiat aptent leo vivamus."""

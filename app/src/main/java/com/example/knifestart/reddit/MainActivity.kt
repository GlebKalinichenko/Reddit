package com.example.knifestart.reddit

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.Fragment
import ru.terrakok.cicerone.android.SupportFragmentNavigator
import ru.terrakok.cicerone.commands.Command
import android.widget.Toast
import com.example.knifestart.reddit.application.MainApplication
import com.example.knifestart.reddit.fragment.ListPostsFragment
import com.example.knifestart.reddit.fragment.PostDetailsFragment
import ru.terrakok.cicerone.NavigatorHolder
import ru.terrakok.cicerone.commands.Replace
import javax.inject.Inject


class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var navigationHolder: NavigatorHolder

    private val navigator = object : SupportFragmentNavigator(supportFragmentManager, R.id.main_container) {
        override fun createFragment(screenKey: String, data: Any): Fragment {
            if (screenKey.equals(ListPostsFragment.javaClass.canonicalName)) {
                return ListPostsFragment.newInstance()
            }

            return PostDetailsFragment.newInstance()
        }

        override fun showSystemMessage(message: String) {
            Toast.makeText(this@MainActivity, message, Toast.LENGTH_SHORT).show()
        }

        override fun exit() {
            finish()
        }

        override fun applyCommand(command: Command?) {
            super.applyCommand(command)
        }
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        (application as MainApplication).postActivityContainerComponent.inject(this)

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (savedInstanceState == null) {
            navigator.applyCommand(Replace(ListPostsFragment.javaClass.canonicalName, 1))
        }
    }

    override fun onResume() {
        super.onResume()
        navigationHolder.setNavigator(navigator)
    }

    override fun onPause() {
        super.onPause()
        navigationHolder.removeNavigator()
    }

}

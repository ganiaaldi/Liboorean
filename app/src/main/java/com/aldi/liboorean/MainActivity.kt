package com.aldi.liboorean

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.widget.TextView
import androidx.appcompat.widget.Toolbar
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.aldi.liboorean.Interface.ChangeToolbarTitle
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.fragment_first_menu.*

class MainActivity : AppCompatActivity(), ChangeToolbarTitle {
    private lateinit var mainNavControl: NavController
    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var mainBottomNav: BottomNavigationView
    private lateinit var host: NavHostFragment
    private lateinit var mainToolbar: Toolbar
    private lateinit var mainToolbarTitle: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupNavController()
       setupActionBar(mainNavControl, appBarConfiguration)
        showBottomMenu(mainNavControl)

        val namaPulau = intent.getStringExtra(CATEGORY1)
        val namaProvinsi = intent.getStringExtra(CATEGORY2)
        val namaKota = intent.getStringExtra(CATEGORY3)
//        cate1.text = namaPulau?.toString()
  //      cate2.text = namaProvinsi?.toString()
   //     cate3.text = namaKota?.toString()
    }
    override fun onSupportNavigateUp(): Boolean {
        return findNavController(R.id.primary_navigation_fragment).navigateUp(appBarConfiguration)
    }

    override fun updateTitle(title: String) {
        mainToolbarTitle.text = title
    }

    override fun toolbarAction(onClickListener: View.OnClickListener) {
        mainToolbar.setOnClickListener(onClickListener)
    }


    override fun showToolbar(show: Boolean) {
        mainToolbar.visibility = if (show) {
            View.VISIBLE
        } else {
            View.GONE
        }
    }

    override fun onBackPressed() {
        finish()
    }

    private fun setupNavController() {
        host = supportFragmentManager
            .findFragmentById(R.id.primary_navigation_fragment) as NavHostFragment? ?: return
        mainNavControl = host.navController
    }


    private fun showBottomMenu(navController: NavController) {
        mainBottomNav = findViewById(R.id.menu_bottom)
        mainBottomNav.setupWithNavController(navController)

        mainNavControl.addOnDestinationChangedListener { _, destination, _ ->
            if (destination.id == R.id.thirdMenuFragment ||
                destination.id == R.id.secondMenuFragment ||
                destination.id == R.id.firstMenuFragment
            ) {
                mainToolbarTitle.text=destination.label
                showBottomMenu()
            } else {
                hideBottomMenu()
            }
        }
    }


    private fun setupActionBar(
        navController: NavController,
        appBarConfiguration: AppBarConfiguration
    ) {
        mainToolbar = findViewById(R.id.toolbar)
        setSupportActionBar(mainToolbar)
        mainToolbarTitle = mainToolbar.findViewById(R.id.toolbarTitle)
        setupActionBarWithNavController(navController, appBarConfiguration)
    }

    private fun hideBottomMenu() {
        // bottom_navigation is BottomNavigationView
        with(mainBottomNav) {
            if (visibility == View.VISIBLE && alpha == 1f) {
                animate()
                    .alpha(0f)
                    .withEndAction { visibility = View.GONE }
                    .duration = 500
            }
        }
    }

    private fun showBottomMenu() {
        // bottom_navigation is BottomNavigationView
        with(mainBottomNav) {
            visibility = View.VISIBLE
            animate()
                .alpha(1f)
                .duration = 500
        }
    }
    companion object{
        const val CATEGORY1 = "category1"
        const val CATEGORY2 = "category2"
        const val CATEGORY3 = "category3"
    }
}

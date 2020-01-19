package edu.tomerbu.lec8bnv;

import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //findViewByID navView
        BottomNavigationView navView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.


        //Titles for the Appbar:
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications)
                .build();

        //setup nav controller:
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        //connect the titles(appBarConfiguration)
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);

        //navController: use the bnv for navigation:
        NavigationUI.setupWithNavController(navView, navController);
    }
}

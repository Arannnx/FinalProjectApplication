package com.example.finalprojectapplication;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.NavigationUI;

import com.example.finalprojectapplication.databinding.ActivityMainBinding;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    DrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        drawerLayout = findViewById(R.id.drawer_layout);
        findViewById(R.id.imageview).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawerLayout.openDrawer(GravityCompat.START);
            }
        });

        binding.bottomNavView.setOnItemSelectedListener(item -> {
            if (item.getItemId() == R.id.home) {
                repFragment(new FragmentHome());
            } else if (item.getItemId() == R.id.profile) {
                repFragment(new DepartmentFragment());
            } else if (item.getItemId() == R.id.settings) {
                repFragment(new FragmentAppearance());
            }
            return true;
        });

        NavigationView navigationView = findViewById(R.id.navigation_view);
        navigationView.setItemIconTintList(null); // If you have custom icons

        NavController navController = Navigation.findNavController(this, R.id.navHostFragment);
        NavigationUI.setupWithNavController(navigationView, navController);

        navigationView.setNavigationItemSelectedListener(item -> {
            if (item.getItemId() == R.id.nav_home) {
                repFragment(new FragmentHome());
            } else if (item.getItemId() == R.id.nav_profile) {
                repFragment(new SideAnnouncementFragment());
            } else if (item.getItemId() == R.id.nav_message) {
                repFragment(new SideAnnouncementFragment());
            } else if (item.getItemId() == R.id.nav_settings) {
                repFragment(new SideSettingsFragment());
            }
            drawerLayout.closeDrawer(GravityCompat.START); // Close drawer after selection
            return true;
        });
    }

    private void repFragment(Fragment fragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frame_out, fragment);
        fragmentTransaction.commit();
    }
}
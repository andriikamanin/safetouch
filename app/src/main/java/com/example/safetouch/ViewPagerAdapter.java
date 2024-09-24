package com.example.safetouch;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class ViewPagerAdapter extends FragmentStateAdapter {
    public ViewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                return new MapsFragment(); // Карты
            case 1:
                return new SosFragment(); // SOS
            case 2:
                return new CallsFragment(); // Телефон
            case 3:
                return new SettingsFragment(); // Настройки
            default:
                return new MapsFragment();
        }
    }

    @Override
    public int getItemCount() {
        return 4; // Количество страниц (Карты, SOS, Телефон, Настройки)
    }
}

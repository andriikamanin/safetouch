package com.example.safetouch;

import android.os.Bundle;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.viewpager2.widget.ViewPager2;

public class MainActivity extends AppCompatActivity {

    private ViewPager2 viewPager;
    private ImageButton buttonMaps, buttonSos, buttonCalls, buttonSettings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = findViewById(R.id.viewPager);
        buttonMaps = findViewById(R.id.button_maps);
        buttonSos = findViewById(R.id.button_sos);
        buttonCalls = findViewById(R.id.button_calls);
        buttonSettings = findViewById(R.id.button_settings);

        // Настройка адаптера ViewPager
        ViewPagerAdapter adapter = new ViewPagerAdapter(this);
        viewPager.setAdapter(adapter);

        // Нажатие на кнопку "Карты"
        buttonMaps.setOnClickListener(v -> viewPager.setCurrentItem(0));

        // Нажатие на кнопку "SOS"
        buttonSos.setOnClickListener(v -> viewPager.setCurrentItem(1));

        // Нажатие на кнопку "Телефон"
        buttonCalls.setOnClickListener(v -> viewPager.setCurrentItem(2));

        // Нажатие на кнопку "Настройки"
        buttonSettings.setOnClickListener(v -> viewPager.setCurrentItem(3));

        // Обработка свайпов в ViewPager2
        viewPager.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);
                updateButtonSelection(position);
            }
        });
    }

    // Метод для изменения состояния кнопок
    private void updateButtonSelection(int position) {
        buttonMaps.setAlpha(position == 0 ? 1f : 0.5f);
        buttonSos.setAlpha(position == 1 ? 1f : 0.5f);
        buttonCalls.setAlpha(position == 2 ? 1f : 0.5f);
        buttonSettings.setAlpha(position == 3 ? 1f : 0.5f);
    }
}
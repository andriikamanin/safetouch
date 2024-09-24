package com.example.safetouch;

import android.os.Bundle;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


import androidx.fragment.app.Fragment;

import com.google.firebase.messaging.FirebaseMessaging;

public class SosFragment extends Fragment {
    public SosFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        FirebaseMessaging.getInstance().subscribeToTopic("all")
                .addOnCompleteListener(task -> {
                    if (task.isSuccessful()) {
                        // Успешная подписка
                    }
                });

        // Кнопка "Сигнал"
        Button signalButton = findViewById(R.id.signalButton);
        signalButton.setOnClickListener(v -> sendNotification());


        return inflater.inflate(R.layout.fragment_sos, container, false);
    }

    private void sendNotification() {
        // Пока это пустой метод. Логику для отправки сигнала мы добавим позже,
        // когда настроим сервер.
        // Но на этом этапе можно тестировать push-уведомления через Firebase Console.
    }
}

package com.example.myapplication5;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.navigation.Navigation;

public class FirstScreen extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.first_screen, container, false);
        Button toSecondScreen = view.findViewById(R.id.to_second_screen);
        toSecondScreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view)
                        .navigate(R.id.action_first_screen_to_second_screen);
                Bundle bundle = new Bundle();
                String transmission = "Передача данных с первого экрана";
                bundle.putString("transmission", transmission);
                Navigation.findNavController(view).navigate(R.id.SecondScreen, bundle);
            }
        });
        return view;
    }

}

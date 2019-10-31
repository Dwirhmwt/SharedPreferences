package id.dwi.amikomtwo;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import static android.content.Context.MODE_PRIVATE;


public class ProfileFragment extends Fragment {

    SharedPreferences sharedPreferences;
    TextView tvNama;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_profile, container, false);

        tvNama = view.findViewById(R.id.tvNamaDepan);

        sharedPreferences = getContext().getSharedPreferences("username", MODE_PRIVATE);

        String namaDepan = sharedPreferences.getString("nama_depan", "nama_depan");
        String namaBelakang = sharedPreferences.getString("nama_belakang", "nama_belakang");

        tvNama.setText("Hello " + namaDepan + " " + namaBelakang + " " + " \n ini menu profile:)");
        return view;
    }
}

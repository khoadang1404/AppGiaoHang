package com.example.view_appgiaohang;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class PhotoFragment extends Fragment {

    private View mView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mView = inflater.inflate(R.layout.fragment_photo, container, false);

        Bundle bundle = getArguments();
        Photo photo = (Photo) bundle.get("object_photo");

        ImageView imgPhoto = mView.findViewById(R.id.img_photo);
        imgPhoto.setImageResource(photo.getResourceId());

        return mView;
    }
}

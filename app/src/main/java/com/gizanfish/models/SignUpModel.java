package com.gizanfish.models;

import android.content.Context;
import android.util.Patterns;
import android.widget.Toast;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;
import androidx.databinding.ObservableField;

import com.gizanfish.BR;
import com.gizanfish.R;


public class SignUpModel extends BaseObservable {
    private String name;
    private String phone_code;
    private String phone;
    private String image_url;
    public ObservableField<String> error_name = new ObservableField<>();


    public boolean isDataValid(Context context) {
        if (!name.trim().isEmpty()
        ) {
            error_name.set(null);

            return true;
        } else {
            if (name.trim().isEmpty()) {
                error_name.set(context.getString(R.string.field_required));

            } else {
                error_name.set(null);

            }


            return false;
        }
    }

    public SignUpModel() {
        setName("");

    }


    @Bindable
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        notifyPropertyChanged(BR.name);

    }

    public String getPhone_code() {
        return phone_code;
    }

    public void setPhone_code(String phone_code) {
        this.phone_code = phone_code;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }


    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }
}
